package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    private Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
    }

    public void insert(Mahasiswa mhs) throws SQLException {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            // Ambil ID yang dihasilkan
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mhs.setId(rs.getInt(1)); // Perbarui ID di objek Mahasiswa
            }
        } catch (SQLException e) {
            System.out.println("Error tambah data: " + e.getMessage());
            throw e; // Re-throw untuk handling di GUI
        }
    }

    public void update(Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated == 0) {
                throw new SQLException("Data dengan ID " + mhs.getId() + " tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
            throw e;
        }
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted == 0) {
                throw new SQLException("Data dengan ID " + id + " tidak ditemukan");
            }
        } catch (SQLException e) {
            System.out.println("Error hapus data: " + e.getMessage());
            throw e;
        }
    }

    public Mahasiswa getById(int id) throws SQLException {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error ambil data: " + e.getMessage());
            throw e;
        }
        return null;
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa ORDER BY id";
        
        // Refresh connection jika perlu
        if (koneksi == null || koneksi.isClosed()) {
            koneksi = MysqlUtility.getConnection();
        }
        
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error ambil semua data: " + e.getMessage());
            throw e;
        }
        return list;
    }

    // Hapus method indexReset() yang lama dan gunakan yang sudah diperbaiki
    public boolean resetAutoIncrement() throws SQLException {
        // Pastikan tabel kosong terlebih dahulu sebelum reset auto increment
        String countQuery = "SELECT COUNT(*) FROM mahasiswa";
        String resetQuery = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        
        // Refresh connection jika perlu
        if (koneksi == null || koneksi.isClosed()) {
            koneksi = MysqlUtility.getConnection();
        }
        
        try {
            // Cek apakah tabel kosong
            try (PreparedStatement countPs = koneksi.prepareStatement(countQuery)) {
                ResultSet rs = countPs.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    // Jika tabel tidak kosong, reset ke ID tertinggi + 1
                    String maxQuery = "SELECT MAX(id) FROM mahasiswa";
                    try (PreparedStatement maxPs = koneksi.prepareStatement(maxQuery)) {
                        ResultSet maxRs = maxPs.executeQuery();
                        if (maxRs.next()) {
                            int maxId = maxRs.getInt(1);
                            resetQuery = "ALTER TABLE mahasiswa AUTO_INCREMENT = " + (maxId + 1);
                        }
                    }
                }
            }
            
            // Execute reset query
            try (PreparedStatement resetPs = koneksi.prepareStatement(resetQuery)) {
                resetPs.executeUpdate();
                System.out.println("Auto increment berhasil direset");
                return true;
            }
            
        } catch (SQLException e) {
            System.err.println("Error resetting auto increment: " + e.getMessage());
            throw e;
        }
    }

    public void clearAll() throws SQLException {
        String query = "TRUNCATE TABLE mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error hapus semua data: " + e.getMessage());
            throw e;
        }
    }

    public boolean isEmpty() throws SQLException {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            System.out.println("Error cek tabel: " + e.getMessage());
            throw e;
        }
        return true;
    }

    public void closeConnection() {
        MysqlUtility.closeConnection();
    }
    
    // Method untuk refresh connection jika diperlukan
    public void refreshConnection() {
        try {
            if (koneksi == null || koneksi.isClosed()) {
                koneksi = MysqlUtility.getConnection();
            }
        } catch (SQLException e) {
            System.out.println("Error refresh connection: " + e.getMessage());
            koneksi = MysqlUtility.getConnection();
        }
    }
}