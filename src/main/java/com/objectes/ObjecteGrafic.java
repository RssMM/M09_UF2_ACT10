package com.objectes;

import processing.core.PGraphics;

import java.awt.Color;

public class ObjecteGrafic implements Movible {
    protected int x, y;
    protected int vX, vY;
    protected Color color;

    public ObjecteGrafic(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.vX = 0;
        this.vY = 0;
    }

    public void pinta(PGraphics g) {
        g.fill(color.getRGB());
    }

    public void mou() {
        x += vX;
        y += vY;
    }

    public void setVelocitat(int x, int y) {
        this.vX = x;
        this.vY = y;
    }
}