package com.lukeeuler.game;

public class Games {
    private void playGame(GameFactory factory){
        Game game = factory.getGame();
        while (game.move())
            ;
    }

    public void start(){
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
