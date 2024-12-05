package com.btcag.bootcamp.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectorDB {


    public class dbConnector {
        private static final String URL = "jdbc:sqlite:C:/Users/JAROSSUM/OneDrive - BTC AG/Dokumente/Bootcamp2/Datenbanken/Neuer Ordner/sqlite-tools-win-x64-3470000/Bootcamp2024.db";

        public static Connection connect() {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(URL);
                System.out.println("Verbindung zur SQLite-Datenbank hergestellt.");
            } catch (SQLException e) {
                System.out.println("Verbindung zur SQLite-Datenbank fehlgeschlagen.");
                e.printStackTrace();
            }
            return conn;
        }

        public static void createTable() {
            String sql = "CREATE TABLE IF NOT EXISTS User (" + "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "username TEXT NOT NULL, " + "password TEXT NOT NULL);";
            try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
                stmt.execute(sql);
                System.out.println("Tabelle 'User' wurde erfolgreich erstellt.");
            } catch (SQLException e) {
                System.out.println("Fehler beim Erstellen der Tabelle 'User'.");
                e.printStackTrace();
            }
        }

    }
}
