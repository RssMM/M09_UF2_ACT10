package com.objectes;

import processing.core.PGraphics;

import java.awt.*;

public class Cercle extends ObjecteGrafic {
    int radi;

    public Cercle(int x, int y, int radi, Color color) {
        super(x, y, color);
        this.radi = radi;
    }

    public void pinta(PGraphics g) {
        super.pinta(g);
        g.ellipse(x,y,radi*2, radi*2);
    }
}
