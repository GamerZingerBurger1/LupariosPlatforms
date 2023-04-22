package main;

import javax.swing.*;
import java.awt.*;

public class GameWin {
    private JFrame jframe;
    public GameWin(Component gamePanel) {

        jframe = new JFrame();

        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
