package section11basicalprogrammingmodel;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018-04-13
 * Project:Algorithms4thEdition
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < a[middle]) {
                high = middle;
            } else if (key > a[middle]) {
                low = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
