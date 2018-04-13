package section11basicalprogrammingmodel;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/29
 * Project:Algorithms4thEdition
 */
public class MyUtils {
    public static String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()) + "  ";
    }

    public static <T> T requireNotNull(T t) {
        if (t == null) {
            throw new NullPointerException(t.getClass().getSimpleName() + "实例为空！");
        }
        return t;
    }
}
