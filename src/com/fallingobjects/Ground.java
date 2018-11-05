package com.fallingobjects;

import java.awt.*;

public class Ground {
    private int x = 0;
    private int y;
    private int width;
    private int height;
    private FallingObjects game;

    public Ground(FallingObjects game,int y, int w, int h) {
        this.game=game;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public void paint(Graphics2D g){
        g.setColor(Color.GREEN);
        g.fillRect(x,y,width,height);
    }

}