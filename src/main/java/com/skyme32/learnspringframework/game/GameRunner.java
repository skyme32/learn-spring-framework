package com.skyme32.learnspringframework.game;

import com.skyme32.learnspringframework.game.MarioGame;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Runing game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
