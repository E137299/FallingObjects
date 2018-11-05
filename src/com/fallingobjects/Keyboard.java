package com.fallingobjects;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard extends JPanel {

    public Keyboard (){
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Falling Objects");
        Keyboard keyboard = new Keyboard();
        frame.add(keyboard);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class MyKeyListener implements KeyListener{
        public void keyTyped(KeyEvent e){
        }

        public void keyPressed(KeyEvent e){
            System.out.println("keyPressed= "+KeyEvent.getKeyText(e.getKeyCode()));
        }

        public void keyReleased(KeyEvent e){
            System.out.println("keyReleaed= "+KeyEvent.getKeyText(e.getKeyCode()));
        }

    }
}
