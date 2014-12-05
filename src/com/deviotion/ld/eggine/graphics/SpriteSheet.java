package com.deviotion.ld.eggine.graphics;

import com.deviotion.ld.eggine.math.Dimension2d;
import com.deviotion.ld.eggine.math.Vector2d;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public class SpriteSheet {

    private Sprite sprite;
    private Dimension2d spriteSize;

    public SpriteSheet (Sprite sprite, Dimension2d spriteSize) {
        this.sprite = sprite;
        this.spriteSize = spriteSize;
    }

    public Sprite getSprite () {
        return this.sprite;
    }
    public Dimension2d getSpriteSize () {
        return this.spriteSize;
    }

    public Vector2d getTileVector (int tileIndex) {
        return new Vector2d(
                (tileIndex % this.sprite.getDimension().getWidth()) * this
                        .spriteSize.getWidth(),
                (tileIndex / this.sprite.getDimension().getHeight()) * this
                        .spriteSize.getHeight()
        );
    }

}