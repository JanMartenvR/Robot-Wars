package com.btcag.bootcamp.Service;

import com.btcag.bootcamp.Entities.Game;
import com.btcag.bootcamp.Interfaces.IGameService;

public class GameService implements IGameService {

    @Override
    public Game getGame() {
        return new Game();
    }
}
