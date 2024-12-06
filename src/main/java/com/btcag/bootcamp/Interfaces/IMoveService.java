package com.btcag.bootcamp.Interfaces;

import com.btcag.bootcamp.Entities.Move;

import java.util.List;

public interface IMoveService {
    List<Move> moveList(int gameId);
    List<Move> moveListAfter(int gameId, int moveId);
    String postMove(int gameId);
}
