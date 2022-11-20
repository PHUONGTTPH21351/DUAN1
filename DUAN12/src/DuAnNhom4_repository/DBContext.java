/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class DBContext {

    public static final String HOSTNAME = "localhost";

    public static final String PORT = "1433";

    public static final String DBNAME = "DUAN1";

    public static final String USERNAME = "sa";

    public static final String PASSWORD = "phuong10092003";

    /**
     *
     * Get connection to MSSQL Server
     *
     * @return Connection
     *
     */
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);

        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace(System.out);

        }

        return null;

    }
    public static void main(String[] args) {
        // check thử
        Connection con = getConnection();
        if (con.equals("")) {
            System.out.println("loi ket noi");
        } else {
            System.out.println("ket noi thanh cong");
        }

    }
}
