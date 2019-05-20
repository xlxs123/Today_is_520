package com.jin.android.tadayis520;

/**
 * TadayIs520
 * Created by Jin on 2019/5/20.
 * Email:17wjli6@stu.edu.cn
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point rotate(float theta) {
        int x = this.x;
        int y = this.y;
        this.x = (int) (Math.cos(theta) * x - Math.sin(theta) * y);
        this.y = (int) (Math.sin(theta) * x + Math.cos(theta) * y);
        return this;
    }

    public Point mult(float f) {
        this.x *= f;
        this.y *= f;
        return this;
    }

    public Point clone() {
        return new Point(this.x, this.y);
    }

    public float length() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Point subtract(Point p) {
        this.x -= p.x;
        this.y -= p.y;
        return this;
    }

    public Point add(Point p) {
        this.x += p.x;
        this.y += p.y;
        return this;
    }

    public Point set(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }
}