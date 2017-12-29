package section11basicalprogrammingmodel;

import java.util.Arrays;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/29
 * Project:Algorithms4thEdition
 */
public class GCD {
    public static void main(String[] args) {
        int gcd = gcd(137, 76);
        System.out.println(MyUtils.getCurrentTime() + "运算结果 = " + gcd);

        System.out.println(MyUtils.getCurrentTime() +"");
        System.out.println(MyUtils.getCurrentTime() +"");

        for (int i = 1; i < 18; i++) {
            System.out.println(MyUtils.getCurrentTime() + Arrays.toString(triangle(i)));
        }
    }

    /*
    * 杨辉三角  利用了递归算法
    * */
    private static int[] triangle(int i){
        int[] ints = new int[i];
        if (i <= 2) {
            for (int i1 = 0; i1 < ints.length; i1++) {
                ints[i1]=1;
            }
        } else {
            int[] triangle = triangle(i - 1);
            for (int i1 = 0; i1 < ints.length; i1++) {
                if (i1==0 || i1==ints.length-1) {
                    ints[i1]=1;
                } else {
                    ints[i1] = triangle[i1-1]+triangle[i1];
                }
            }
        }
        return ints;
    }
//        2017-12-29 21:42:13:027  [1]
//        2017-12-29 21:42:13:027  [1, 1]
//        2017-12-29 21:42:13:028  [1, 2, 1]
//        2017-12-29 21:42:13:028  [1, 3, 3, 1]
//        2017-12-29 21:42:13:029  [1, 4, 6, 4, 1]
//        2017-12-29 21:42:13:029  [1, 5, 10, 10, 5, 1]
//        2017-12-29 21:42:13:029  [1, 6, 15, 20, 15, 6, 1]
//        2017-12-29 21:42:13:031  [1, 7, 21, 35, 35, 21, 7, 1]
//        2017-12-29 21:42:13:031  [1, 8, 28, 56, 70, 56, 28, 8, 1]
//        2017-12-29 21:42:13:033  [1, 9, 36, 84, 126, 126, 84, 36, 9, 1]
//        2017-12-29 21:42:13:043  [1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1]
//        2017-12-29 21:42:13:095  [1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1]
//        2017-12-29 21:42:13:466  [1, 12, 66, 220, 495, 792, 924, 792, 495, 220, 66, 12, 1]

    private static int gcd(int p, int q){
        System.out.println(MyUtils.getCurrentTime() + "GCD.gcd  " + "p = [" + p + "], q = [" + q + "]");
        if (q==0) {
            return p;
        }
        int i = p % q;
        return gcd(q,i);
    }
//            2017-12-29 20:54:04:500  GCD.gcd  p = [36], q = [76]
//            2017-12-29 20:54:04:507  GCD.gcd  p = [76], q = [36]
//            2017-12-29 20:54:04:507  GCD.gcd  p = [36], q = [4]
//            2017-12-29 20:54:04:508  GCD.gcd  p = [4], q = [0]
//            2017-12-29 20:54:04:510  运算结果 = 4
}
