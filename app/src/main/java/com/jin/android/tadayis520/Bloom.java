package com.jin.android.tadayis520;

import android.graphics.Canvas;

import java.util.ArrayList;

/**
 * TadayIs520
 * Created by Jin on 2019/5/20.
 * Email:17wjli6@stu.edu.cn
 */
public class Bloom {
    private int color;
    private Point point;
    private int radius;
    private ArrayList petals;

    public Point getPoint() {
        return point;
    }

    public Bloom(Point point, int radius, int color, int petalCount) {
        this.point = point;
        this.radius = radius;
        this.color = color;
        petals = new ArrayList<>(petalCount);

        float angle = 360f / petalCount;
        int startAngle = MyUtil.randomInt(0, 90);
        for (int i = 0; i < petalCount; i++) {
            float stretchA = MyUtil.random(Garden.Options.minPetalStretch, Garden.Options.maxPetalStretch);
            float stretchB = MyUtil.random(Garden.Options.minPetalStretch, Garden.Options.maxPetalStretch);
            int beginAngle = startAngle + (int) (i * angle);
            float growFactor = MyUtil.random(Garden.Options.minGrowFactor, Garden.Options.maxGrowFactor);
            this.petals.add(new Petal(stretchA, stretchB, beginAngle, angle, color, growFactor));
        }
    }

    public void draw(Canvas canvas) {
        Petal p;
        for (int i = 0; i < this.petals.size(); i++) {
            p = (Petal) petals.get(i);
            p.render(point, this.radius, canvas);
        }
    }

    public int getColor() {
        return color;
    }
}
