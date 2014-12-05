package com.deviotion.ld.eggine;

import com.deviotion.ld.eggine.graphics.Window;
import com.deviotion.ld.eggine.input.Keyboard;
import com.deviotion.ld.eggine.loop.Loop;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public abstract class Eggine extends Loop {

    private Keyboard keyboard;

    public Eggine (int fps, int ups, Window window) {
        super(fps, ups, window);

        this.keyboard = new Keyboard();

        this.getWindow().getCanvas().addKeyListener(this.keyboard);
    }

    public Keyboard getKeyboard () {
        return this.keyboard;
    }

}