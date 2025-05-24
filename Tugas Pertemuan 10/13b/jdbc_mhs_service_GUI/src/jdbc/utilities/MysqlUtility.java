package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        try {
            // Selalu cek kondisi connection
            if (koneksi == null || koneksi.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs_service?useSSL=false&serverTimezone=UTC&autoReconnect=true&useUnicode=true&characterEncoding=UTF-8";
                String user = "root";
                String password = "";
                
                // Load MySQL JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi Berhasil");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error koneksi SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver tidak ditemukan: " + e.getMessage());
            e.printStackTrace();
        }
        return koneksi;
    }

    // Method untuk test koneksi
    public static boolean testConnection() {
        try {
            Connection conn = getConnection();
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            System.out.println("Test koneksi gagal: " + e.getMessage());
            return false;
        }
    }

    // Method untuk menutup koneksi
    public static void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                koneksi = null; // Set to null after closing
                System.out.println("Koneksi berhasil ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Error tutup koneksi: " + e.getMessage());
        }
    }
    
    // Method untuk refresh connection
    public static void refreshConnection() {
        closeConnection();
        getConnection();
    }
}