package org.lqscr88.utils.distance;

public class Distance {

    // 求距离的工具类
    public static double distance(Point p1, Point p2) {
        double a = Math.pow((p1.getX()-p2.getX()),2);
        double b = Math.pow((p1.getY()-p2.getY()),2);
        return Math.sqrt(a+b);
    }

}