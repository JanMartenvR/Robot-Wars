package com.btcag.bootcamp.Entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Game")
@Table(name = "game")
public class Game {
    @Column(name = "game_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private Map map;
    @Column(name = "moves")
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Move> moves = new ArrayList<>();
    @Column(name="robots")
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Robot> robots = new ArrayList<>();
    public Game() {

    }

    public Long getId() {
        return id;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public void setRobots(List<Robot> robots) {
        this.robots = robots;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void addMove(Move move) {
        this.moves.add(move);
        move.setGame(this);
    }


}
