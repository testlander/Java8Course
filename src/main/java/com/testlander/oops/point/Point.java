package com.testlander.oops.point;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Return the distance between this Point and Point(0, 0) as double
    public double distance() {
        return distance(0, 0);
    }

    // Return the distance between this Point and Point(x, y) as double
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Return the distance between this Point and another Point as double
    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}
