package com.androidx.widget;

import android.graphics.Color;

import java.util.Random;

public class Colors {

    /**
     * @param count 个数
     * @return 随机颜色数组
     */
    public static int[] randomColors(int count) {
        int[] colors = new int[count];
        for (int i = 0; i < count; i++) {
            colors[i] = randomColor();
        }
        return colors;
    }

    /***
     * @return 随机颜色
     */
    public static int randomColor() {
        StringBuffer sb = new StringBuffer();
        sb.append("#");
        for (int i = 0; i < 6; i++) {
            sb.append(randomItem());
        }
        return Color.parseColor(new String(sb));
    }

    private static String randomItem() {
        String value = "";
        Random random = new Random();
        int intValue = random.nextInt(16);
        if (intValue > 9) {
            switch (intValue) {
                case 10:
                    value = "a";
                    break;
                case 11:
                    value = "b";
                    break;
                case 12:
                    value = "c";
                    break;
                case 13:
                    value = "d";
                    break;
                case 14:
                    value = "e";
                    break;
                case 15:
                    value = "f";
                    break;
            }
        } else {
            value = String.valueOf(intValue);
        }
        return value;
    }

}
