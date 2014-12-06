package com.deviotion.ld.eggine.math;

/**
 * Eggine
 * A last minute game engine for Ludum Dare.
 *
 * @author Alex Nicholson (TechnoCF)
 *
 */

public class Vector2d {

    private double x;
    private double y;

    public Vector2d (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return this.x;
    }
    public double getY () {
        return this.y;
    }

    public void setX (double x) {
        this.x = x;
    }
    public void setY (double y) {
        this.y = y;
    }

    public double distance (Vector2d vector) {
        double distX = vector.getX() - this.x;
        double distY = vector.getY() - this.y;

        return Math.sqrt(distX * distX + distY * distY);
    };

    public void add (Vector2d vector) {
        this.x += vector.getX();
        this.y += vector.getY();
    }

}