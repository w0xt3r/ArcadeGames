package com.agames.arcadegames.utils;


import java.util.ArrayList;

/**
 * Created by gerard on 1/07/17.
 */

public class GameInfo {

    private static ArrayList<String> games = new ArrayList<>();

    public static ArrayList<String> loadGames() {

        games.add("Space Invaders");
        games.add("Pacman");

        return games;

    }

}
