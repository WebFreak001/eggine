package com.deviotion.ld.eggine.graphics;

import com.deviotion.ld.eggine.math.Dimension2d;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public class Screen {

    private Dimension2d dimension;
    private BufferedImage bufferedImage;
    private int[] pixels;

    public Screen (Dimension2d dimension) {
        this.dimension = dimension;
        this.bufferedImage = new BufferedImage((int) this.dimension.getWidth
                (), (int) this.dimension.getHeight(), BufferedImage
                .TYPE_INT_RGB);
        this.pixels = ((DataBufferInt) this.bufferedImage.getRaster()
                .getDataBuffer()).getData();
    }

    public Dimension2d getDimension () {
        return this.dimension;
    }
    public BufferedImage getBufferedImage () {
        return this.bufferedImage;
    }
    public int[] getPixels () {
        return this.pixels;
    }

}