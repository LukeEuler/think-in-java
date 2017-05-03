package com.lukeeuler;

import com.lukeeuler.game.Games;
import com.lukeeuler.generics.LinkedStack;
import com.lukeeuler.io.DirList;

import java.io.File;
import java.util.Arrays;

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
        System.out.println();

        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(DirList.filter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
