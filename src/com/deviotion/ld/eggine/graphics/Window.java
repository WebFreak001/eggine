package com.deviotion.ld.eggine.graphics;

import com.deviotion.ld.eggine.math.Dimension2d;

import javax.swing.*;
import java.awt.*;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public class Window extends JFrame {

    private Dimension2d dimension;
    private int scale;
    private Screen screen;
    private Canvas canvas;

    public Window (String title, Dimension2d dimension, int scale) {
        this.dimension = dimension;
        this.scale = scale;

        this.screen = new Screen(this.dimension);

        this.setTitle(title);
        this.setResizable(false);

        this.canvas = new Canvas();
        this.canvas.setSize((int) this.dimension.getWidth() * this.scale,
                (int) this.dimension.getHeight() * this.scale);
        this.canvas.setBackground(new Color(0, 0, 0));

        this.add(this.canvas);
        this.pack();

        this.setVisible(true);
    }

    public Dimension2d getDimension () {
        return this.dimension;
    }
    public Screen getScreen () {
        return this.screen;
    }

    public void render() {

    }

}