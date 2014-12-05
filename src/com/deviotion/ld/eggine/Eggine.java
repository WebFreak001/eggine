package com.deviotion.ld.eggine;

import com.deviotion.ld.eggine.graphics.Window;
import com.deviotion.ld.eggine.loop.Loop;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public abstract class Eggine extends Loop {

    public Eggine (int fps, int ups, Window window) {
        super(fps, ups, window);
    }

}