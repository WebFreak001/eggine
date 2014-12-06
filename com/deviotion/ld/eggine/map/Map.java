package com.deviotion.ld.eggine.map;

import com.deviotion.ld.eggine.math.Dimension2d;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public class Map {

    private int[] map;
    private Dimension2d dimension;

    public Map (Dimension2d dimension) {
        this.dimension = dimension;
        this.map = new int[(int) this.dimension.getWidth() * (int) this
                .dimension.getHeight()];
    }

    public int[] getMap () {
        return this.map;
    }
    public Dimension2d getDimension() {
        return this.dimension;
    }

    public int getTile (int x, int y) {
        if (x >= 0 && y >= 0 && x < this.dimension.getWidth() && y < this
                .dimension.getHeight()) {
            return this.map[x + y * (int) this.dimension.getWidth()];
        }

        return -1;
    }

    public void setTile (int x, int y, int value) {
        if (x >= 0 && y >= 0 && x < this.dimension.getWidth() && y < this
                .dimension.getHeight()) {
            this.map[x + y * (int) this.dimension.getWidth()] = value;
        }
    }

}
