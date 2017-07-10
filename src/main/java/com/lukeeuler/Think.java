package com.lukeeuler;

import com.lukeeuler.game.Games;
import com.lukeeuler.generics.LinkedStack;
import com.lukeeuler.io.DirList;

import java.io.*;
import java.util.Arrays;

public class Think {
    public static void main(String[] args) {
        playGame();
        stack();
        exploreIO(args);
        readFile();
        showEnum();
    }

    private static void playGame() {
        Games games = new Games();
        games.start();
        System.out.println();
    }

    private static void stack() {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void exploreIO(String[] args) {
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

    private static void readFile() {
        System.out.println();
        try (FileReader fileReader = new FileReader("/home/luke/boron.toml")) {
            BufferedReader in = new BufferedReader(fileReader);
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = in.readLine()) != null) {
                sb.append(s).append("\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    enum Pool {
        VALUE("point"), VECTOR("line"), MATRIX("matrix");
        private String description;

        Pool(String p) {
            this.description = p;
        }

        public String getDescription() {
            return this.description;
        }
    }

    private static void showEnum() {
        for (Pool item : Pool.values()) {
            System.out.printf("%s : %s\n", item, item.getDescription());
        }
    }
}
