package com.lukeeuler;

import com.lukeeuler.game.Games;
import com.lukeeuler.generics.LinkedStack;

public class Think {
    public static void main(String[] args) {
        Games games = new Games();
        games.start();
        System.out.println();

        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
