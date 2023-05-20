package main;

import javax.swing.JFrame;

public class GameWin {
    private JFrame jframe;

    public GameWin(GamePanel gamePanel) {

        jframe = new JFrame();

        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

    }

}