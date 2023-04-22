package main;

public class Game {

    private GameWin gameWindow;
    private GamePanel gamePanel;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWin(gamePanel);
        gamePanel.requestFocus();


    }

}
