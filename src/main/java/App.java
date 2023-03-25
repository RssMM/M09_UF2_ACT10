import com.objectes.Cercle;
import com.objectes.Ellipse;
import com.objectes.Sprite;
import com.objectes.Triangle;
import processing.core.PApplet;
import processing.core.PGraphics;

import java.awt.*;

public class App extends PApplet {
    Cercle cercle;
    Triangle triangle;
    Ellipse ellipse;

    Sprite sprite;

    public void settings(){
        size(400, 400);
    }

    public void setup() {
        cercle = new Cercle(50, 50, 50, Color.RED);
        triangle = new Triangle(100, 100, new int[] {40, 40}, new int[] { 60, 20 }, Color.BLUE);
        ellipse = new Ellipse(370, 150, 60, 100, Color.GREEN);
        sprite = new Sprite(loadImage("../assets/pokemon.png"), 0, 0);

        cercle.setVelocitat(1, 1);
        triangle.setVelocitat(1, 1);
        ellipse.setVelocitat(1, -1);
        sprite.setVelocitat(0, 1);
    }

    public void draw() {
        PGraphics g = getGraphics();
        background(255);

        cercle.mou();
        triangle.mou();
        ellipse.mou();
        sprite.mou();

        cercle.pinta(g);
        triangle.pinta(g);
        ellipse.pinta(g);
        sprite.pinta(g);
    }

    public static void main(String[] args) {
        PApplet.main("App");
    }
}