package com.fallingobjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;


public class FallingObjects extends JPanel {
    Hero hero = new Hero(this);
    Projectile obj1 = new Projectile(this);
    Projectile obj2 = new Projectile(this);
    Projectile obj3 = new Projectile(this);
    Projectile obj4 = new Projectile(this);
    Ground ground = new Ground(this, 250, 300, 250);

    public FallingObjects(){
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
                hero.keyPressed(e);
            }


            public void keyReleased(KeyEvent e) {
                hero.keyReleased(e);
            }
        });
        setFocusable(true);
    }

    private void move() {
        obj1.move();
        obj2.move();
        obj3.move();
        obj4.move();
        hero.move();
    }


    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        obj1.paint(g2d);
        obj2.paint(g2d);
        obj3.paint(g2d);
        obj4.paint(g2d);
        ground.paint(g2d);
        hero.paint(g2d);
    }

    public void gameOver(){
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }
    

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Falling Objects");
        FallingObjects game = new FallingObjects();
        frame.add(game);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }
    }
}