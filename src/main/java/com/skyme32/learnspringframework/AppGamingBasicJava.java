package com.skyme32.learnspringframework;

import com.skyme32.learnspringframework.game.GameRunner;
import com.skyme32.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
