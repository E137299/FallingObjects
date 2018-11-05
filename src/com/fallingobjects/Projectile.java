package com.fallingobjects;

import java.awt.*;
import java.math.*;

public class Projectile {
    int x = (int)(Math.random()*270);
    int y = (int)(Math.random()*300-300);
    int red = (int)(Math.random()*256);
    int green = (int)(Math.random()*256);
    int blue = (int)(Math.random()*256);
    int shape = (int)(Math.random()*2+1);
    int speed = (int)(Math.random()*2+1);
    int width=(int)(Math.random()*20+10);

    private FallingObjects game;

    public Projectile(FallingObjects game){
        this.game=game;
    }

    public void move(){
        if (y>300){
            x = (int)(Math.random()*270);
            y = (int)(Math.random()*300-300);
            shape = (int)(Math.random()*2+1);
            width=(int)(Math.random()*20+10);
        }
        y+=speed;
        if (collision()){
            game.gameOver();
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, width,width);
    }

    public boolean collision(){
        return game.hero.getBounds().intersects(getBounds());
    }

    public void paint(Graphics2D g){
            if (shape==1){
                g.setColor(new Color(red,green,blue));
                g.fillRect(x,y,width,width);
            }else{
                g.setColor(new Color(red,green,blue));
                g.fillOval(x,y,width,width);
            }


        }
    }

