package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Entities.Game;
import com.btcag.bootcamp.Interfaces.IGameService;

public class GameService implements IGameService {

    @Override
    public Game getGame(int gameId) {
        //get the game objekt from database with the ID gameId
        Game game = new Game();
        return game;
    }
}
