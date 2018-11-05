package com.fallingobjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Hero extends JPanel {
    int x = 150;
    int y = 230;
    int xa = 0;
    int ya =0;
    private FallingObjects game;

    public Hero(FallingObjects game){
        this.game = game;
    }

    public void move(){
        if (x+xa>0 && x +xa < game.getWidth()-20){
            x = x + xa;
        }
        if (y+ya>0 && y+ya<230){
            y=y+ya;
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,20, 20);
    }


    public void paint(Graphics2D g){
        g.setColor(new Color(186,85,211));
        g.fillRoundRect(x,y, 20,20, 10, 10);
    }

    public void keyReleased(KeyEvent e){
        xa = 0;
        if (y < 230){
            ya = 1;
        }else{
            ya=0;
        }
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            xa = -1;
        }
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            xa = 1;
        }
        if(e.getKeyCode()== KeyEvent.VK_UP){
            ya = -1;
        }
    }
}
