package org.lqscr88;

import org.lqscr88.utils.distance.Distance;
import org.lqscr88.utils.distance.Point;


public class DistanceTest {

    /**
     * 计算地球上任意两点(经纬度)距离
     *
     * @param long1 第一点经度
     * @param lat1  第一点纬度
     * @param long2 第二点经度
     * @param lat2  第二点纬度
     * @return 返回距离 单位：米
     */
    public static double distanceByLongNLat(double long1, double lat1, double long2, double lat2) {
        double a, b, R;
        R = 6378137;//地球半径
        lat1 = lat1 * Math.PI / 180.0;
        lat2 = lat2 * Math.PI / 180.0;
        a = lat1 - lat2;
        b = (long1 - long2) * Math.PI / 180.0;
        double d;
        double sa2, sb2;
        sa2 = Math.sin(a / 2.0);
        sb2 = Math.sin(b / 2.0);
        d = 2 * R * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1) * Math.cos(lat2) * sb2 * sb2));
        return d;
    }

    public static void main(String[] args) {
//        double v = distanceByLongNLat(1, 2, 2, 3);
//        System.out.println(v);
//        TwoDistance();
        Point p1 = new Point(2.2,2.6);
        Point p2 = new Point(3.68,1);
        System.out.println("(2,2)与(2,1)的距离：" + Distance.distance(p1, p2));
    }

    private static void TwoDistance() {
        Point p1 = new Point(10, 2);// 定义第一个点的坐标(5,6)
        Point p2 = new Point(2,3);// 定义第二个点的坐标(7,8)
        //定位坐标
        System.out.println("p1的x坐标为"+p1.getX());
        System.out.println("p1的y坐标为"+p1.getY());
        System.out.println("p2的x坐标为"+p2.getX());
        System.out.println("p2的y坐标为"+p2.getY());

        // 计算两点间距离公式
        double juli = Math.sqrt(Math.abs((p1.getX() - p2.getX())* (p1.getX() - p2.getX())+(p1.getY() - p2.getY())* (p1.getY() - p2.getY())));
        System.out.println("两点间的距离是:" + juli);
    }
}
