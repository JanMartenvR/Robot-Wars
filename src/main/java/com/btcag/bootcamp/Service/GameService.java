package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Entities.Game;
import com.btcag.bootcamp.Interfaces.IGameService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.btcag.bootcamp.Service.ConnectorDB.dbConnector.connect;

public class GameService implements IGameService {

    @Override
    public Game getGame(int gameId) {
        //get the game objekt from database with the ID gameId
        String sql = "CREATE TABLE IF NOT EXISTS User (" + "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "username TEXT NOT NULL, " + "password TEXT NOT NULL);";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabelle 'User' wurde erfolgreich erstellt.");
        } catch (SQLException e) {
            System.out.println("Fehler beim Erstellen der Tabelle 'User'.");
            e.printStackTrace();
        }
        Game game = new Game();
        return game;
    }
}
