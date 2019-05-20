package com.jin.android.tadayis520;

/**
 * TadayIs520
 * Created by Jin on 2019/5/20.
 * Email:17wjli6@stu.edu.cn
 */
public class Garden {
    public Bloom createRandomBloom(int x, int y) {
        int radius = MyUtil.randomInt(Options.minBloomRadius, Options.maxBloomRadius);
        int color = MyUtil.randomrgba(Options.minRedColor, Options.maxRedColor, Options.minGreenColor, Options.maxGreenColor, Options.minBlueColor, Options.maxBlueColor, Options.opacity);
        int petalCount = MyUtil.randomInt(Options.minPetalCount, Options.maxPetalCount);
        return createBloom(x, y, radius, color, petalCount);
    }

    public Bloom createBloom(int x, int y, int radius, int color, int petalCount) {
        return new Bloom(new Point(x, y), radius, color, petalCount);
    }

    static class Options {
        public static int minPetalCount = 8;
        public static int maxPetalCount = 15;
        public static float minPetalStretch = 2f;
        public static float maxPetalStretch = 3.5f;

        public static float minGrowFactor = 1f;
        public static float maxGrowFactor = 1.1f;

        public static int minBloomRadius = 8;
        public static int maxBloomRadius = 10;

        public static int minRedColor = 128;
        public static int maxRedColor = 255;
        public static int minGreenColor = 0;
        public static int maxGreenColor = 128;
        public static int minBlueColor = 0;
        public static int maxBlueColor = 128;

        public static int opacity = 50;
    }
}
