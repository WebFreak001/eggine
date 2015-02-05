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
    }

    public Vector2d add (Vector2d vector) {
        this.x += vector.getX();
        this.y += vector.getY();
		return this;
    }

    public Vector2d subtract (Vector2d vector) {
        this.x -= vector.getX();
        this.y -= vector.getY();
		return this;
    }

    public Vector2d multiply (double value) {
        this.x *= value;
        this.y *= value;
		return this;
    }

    public double getLengthSquared () {
        return this.x * this.x + this.y * this.y;
    }

    public double getLength () {
        return Math.sqrt(getLengthSquared());
    }

    public void normalize () {
        double invertedLength = 1.0 / getLength();
		this.x *= invertedLength;
		this.y *= invertedLength;
    }

    public Vector2d normalized () {
        Vector2d vec = copy().normalize();
		return vec;
    }

    public Vector2d copy () {
		return new Vector2d(this.x, this.y);
    }

    public double dot (Vector2d vector) {
		return this.x * vector.x + this.y * vector.y;
    }
	
	public static Vector2d reflect (Vector2d in, Vector2d normal) {
    	Vector2d nIn = in.normalized();
    	Vector2d nNormal = normal.normalized();
    	return nIn.copy().add(nNormal.copy().multiply(-2).multiply(nNormal.dot(nIn)));
    }

}