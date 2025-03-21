package com.zz.student.tankGame;

import javax.swing.*;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class TankGame extends JFrame {
    Panel panel = null;
    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
    public TankGame() {
        panel = new Panel();
        this.add(panel);
        this.addKeyListener(panel);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        new Thread(panel).start();

    }
}
