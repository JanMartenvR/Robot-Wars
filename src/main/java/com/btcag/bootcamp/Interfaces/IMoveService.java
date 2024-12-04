package com.btcag.bootcamp.Interfaces;

public interface IMoveService {
    String[] moveList(int gameId);
    String[] moveListAfter(int gameId, int moveId);
    String postMove(int gameId);
}
