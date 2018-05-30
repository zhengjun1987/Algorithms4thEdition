package section11basicalprogrammingmodel;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/5/30 23:45
 * Project:Algorithms4thEdition
 */
public class Practice {
    public static void main(String[] args) {
        practice1125();
    }

    private static void practice1125() {
        int gcd = GCD.gcd(1111111, 1234567);
        System.out.println(MyUtils.getCurrentTime() + "gcd = " + gcd);
    }
//            2018-05-30 23:47:57:933  GCD.gcd  p = [1111111], q = [1234567]
//            2018-05-30 23:47:57:935  GCD.gcd  p = [1234567], q = [1111111]
//            2018-05-30 23:47:57:935  GCD.gcd  p = [1111111], q = [123456]
//            2018-05-30 23:47:57:936  GCD.gcd  p = [123456], q = [7]
//            2018-05-30 23:47:57:936  GCD.gcd  p = [7], q = [4]
//            2018-05-30 23:47:57:940  GCD.gcd  p = [4], q = [3]
//            2018-05-30 23:47:57:941  GCD.gcd  p = [3], q = [1]
//            2018-05-30 23:47:57:942  GCD.gcd  p = [1], q = [0]
//            2018-05-30 23:47:57:943  gcd = 1
}
