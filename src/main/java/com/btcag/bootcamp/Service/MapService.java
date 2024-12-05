package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Entities.Map;
import com.btcag.bootcamp.Interfaces.IMapService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.btcag.bootcamp.Service.ConnectorDB.dbConnector.connect;
import static javax.swing.UIManager.getInt;


public class MapService implements IMapService {

    @Override
    public Map gameMap(int gameId) {
        //get map des Spiels mit der GameId
        //SELECT mapID FROM game WHERE GameId == gameId
        String sql = "SELECT mapID FROM game WHERE GameId == "+ gameId +";";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Map map = new Map(int rs.getInt("gameId",));
                System.out.println("ID: " + rs.getInt("id") + "\t" +
                        "Username: " + rs.getString("username") + "\t" +
                        "Password: " + rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Abrufen des Games.");
            e.printStackTrace();
        }
        return map;
    }
}
