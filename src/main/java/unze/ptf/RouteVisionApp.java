package unze.ptf;

import unze.ptf.config.DatabaseConfig;
import java.sql.Connection;
import java.sql.SQLException;

public class RouteVisionApp {

    public static void main(String[] args) {
        try (Connection conn = DatabaseConfig.getConnection()) {
            if (conn != null) {
                System.out.println("Povezano!");
            } else {
                System.out.println("Konekcija nije uspjela!");
            }
        } catch (SQLException e) {
            System.out.println("Nema konekcije!");
            e.printStackTrace();
        }
    }
}
