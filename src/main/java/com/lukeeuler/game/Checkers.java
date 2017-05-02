package com.lukeeuler.game;

public class Checkers implements Game {
    private Checkers() {
    }

    private int moves = 0;

    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves < MOVES;
    }

    static GameFactory factory = Checkers::new;
}
