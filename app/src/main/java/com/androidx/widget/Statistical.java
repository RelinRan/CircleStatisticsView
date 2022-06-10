package com.androidx.widget;

import android.graphics.Color;
import android.graphics.Point;

import java.util.List;

/**
 * 统计数据
 */
public class Statistical {

    private float percent;
    private int color = Color.GREEN;
    private int markTextColor = 0;
    private String topMarkText = "Top Mark";
    private String bottomMarkText = "Bottom Mark";

    private Point dotPoint;
    private Point gapPoint;
    private Point lineEndPoint;
    private Point topMarkPoint;
    private Point bottomMarkPoint;

    private Point gapAnimationPoint;
    private Point lineEndAnimPoint;
    private Point topMarkAnimPoint;
    private Point bottomMarkAnimPoint;

    private float startAngle;
    private float sweepAngle;
    private float startAngleAnim;
    private float sweepAngleAnim;
    private float dotRadiusAnim;
    private float dotRadius;

    public Statistical() {

    }

    public Statistical(float percent, int color, int markTextColor, String topMarkText, String bottomMarkText) {
        this.percent = percent;
        this.color = color;
        this.markTextColor = markTextColor;
        this.topMarkText = topMarkText;
        this.bottomMarkText = bottomMarkText;
    }

    public Statistical(float percent, String topMarkText, String bottomMarkText) {
        this.percent = percent;
        int color = Colors.randomColor();
        this.color = color;
        this.markTextColor = color;
        this.topMarkText = topMarkText;
        this.bottomMarkText = bottomMarkText;
    }

    public static float[] toPercent(double[] values) {
        double sum = 0;
        float[] percents = new float[values.length];
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            percents[i] = (float) (values[i] * 1F / sum * 1F);
        }
        return percents;
    }

    public static float[] toPercent(int[] values) {
        int sum = 0;
        float[] percents = new float[values.length];
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            percents[i] = values[i] * 1F / sum * 1F;
        }
        return percents;
    }

    public static double toDouble(String value) {
        if (value == null || value.length() == 0) {
            value = "0.0";
        }
        if (!value.contains(".")) {
            value += ".0";
        }
        return Double.parseDouble(value);
    }

    public static float[] toPercent(String[] values) {
        double sum = 0;
        float[] percents = new float[values.length];
        for (int i = 0; i < values.length; i++) {
            sum += toDouble(values[i]);
        }
        for (int i = 0; i < values.length; i++) {
            percents[i] = (float) (toDouble(values[i]) * 1F / sum * 1F);
        }
        return percents;
    }

    public static float[] toPercent(List<String> list) {
        int size = list == null ? 0 : list.size();
        String[] values = new String[size];
        list.toArray(values);
        return toPercent(values);
    }

    public static String[] toMarks(List<String> list){
        int size = list == null ? 0 : list.size();
        String[] values = new String[size];
        list.toArray(values);
        return values;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTopMarkText() {
        return topMarkText;
    }

    public void setTopMarkText(String topMarkText) {
        this.topMarkText = topMarkText;
    }

    public String getBottomMarkText() {
        return bottomMarkText;
    }

    public void setBottomMarkText(String bottomMarkText) {
        this.bottomMarkText = bottomMarkText;
    }

    public int getMarkTextColor() {
        return markTextColor;
    }

    public void setMarkTextColor(int markTextColor) {
        this.markTextColor = markTextColor;
    }


    public Point getDotPoint() {
        return dotPoint;
    }

    public void setDotPoint(Point dotPoint) {
        this.dotPoint = dotPoint;
    }

    public Point getGapPoint() {
        return gapPoint;
    }

    public void setGapPoint(Point gapPoint) {
        this.gapPoint = gapPoint;
    }

    public Point getLineEndPoint() {
        return lineEndPoint;
    }

    public void setLineEndPoint(Point lineEndPoint) {
        this.lineEndPoint = lineEndPoint;
    }

    public Point getTopMarkPoint() {
        return topMarkPoint;
    }

    public void setTopMarkPoint(Point topMarkPoint) {
        this.topMarkPoint = topMarkPoint;
    }

    public Point getBottomMarkPoint() {
        return bottomMarkPoint;
    }

    public void setBottomMarkPoint(Point bottomMarkPoint) {
        this.bottomMarkPoint = bottomMarkPoint;
    }

    public Point getGapAnimationPoint() {
        return gapAnimationPoint;
    }

    public void setGapAnimationPoint(Point gapAnimationPoint) {
        this.gapAnimationPoint = gapAnimationPoint;
    }

    public Point getLineEndAnimPoint() {
        return lineEndAnimPoint;
    }

    public void setLineEndAnimPoint(Point lineEndAnimPoint) {
        this.lineEndAnimPoint = lineEndAnimPoint;
    }

    public Point getTopMarkAnimPoint() {
        return topMarkAnimPoint;
    }

    public void setTopMarkAnimPoint(Point topMarkAnimPoint) {
        this.topMarkAnimPoint = topMarkAnimPoint;
    }

    public Point getBottomMarkAnimPoint() {
        return bottomMarkAnimPoint;
    }

    public void setBottomMarkAnimPoint(Point bottomMarkAnimPoint) {
        this.bottomMarkAnimPoint = bottomMarkAnimPoint;
    }

    public float getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
    }

    public float getSweepAngle() {
        return sweepAngle;
    }

    public void setSweepAngle(float sweepAngle) {
        this.sweepAngle = sweepAngle;
    }

    public float getStartAngleAnim() {
        return startAngleAnim;
    }

    public void setStartAngleAnim(float startAngleAnim) {
        this.startAngleAnim = startAngleAnim;
    }

    public float getSweepAngleAnim() {
        return sweepAngleAnim;
    }

    public void setSweepAngleAnim(float sweepAngleAnim) {
        this.sweepAngleAnim = sweepAngleAnim;
    }

    public float getDotRadiusAnim() {
        return dotRadiusAnim;
    }

    public void setDotRadiusAnim(float dotRadiusAnim) {
        this.dotRadiusAnim = dotRadiusAnim;
    }

    public float getDotRadius() {
        return dotRadius;
    }

    public void setDotRadius(float dotRadius) {
        this.dotRadius = dotRadius;
    }
}