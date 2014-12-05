package com.deviotion.ld.eggine.graphics;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public class SpriteAnimation {

    private SpriteSheet spriteSheet;
    private int animationFps;
    private int startTile;
    private int endTile;
    private int currentTile;
    private int tiles;
    private long lastTile;

    public SpriteAnimation (SpriteSheet spriteSheet, int startTile, int
            endTile, int fps) {
        this.spriteSheet = spriteSheet;
        this.animationFps = fps;
        this.startTile = startTile;
        this.endTile = endTile;
        this.currentTile = 0;

        this.tiles = this.endTile - this.startTile;
    }

    public SpriteSheet getSpriteSheet () {
        return this.spriteSheet;
    }
    public int getTile () {
        return this.currentTile;
    }

    public void nextFrame () {
        long now = System.nanoTime();
        if (now >= this.lastTile + (1000000000f / this.animationFps)) {
            this.lastTile = now;
            this.currentTile++;

            if (this.currentTile > this.tiles) {
                this.currentTile = 0;
            }
        }
    }

}