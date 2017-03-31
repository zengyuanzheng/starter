package china.z.starter.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sherlock on 2017-03-28.
 * 时间工具类
 */
public class UDateUtil {



    private static SimpleDateFormat simpleDateFormat;

    /**
     * DATE转换指定类型字符串格式
     * @param source
     * @param pattern
     * @return
     */
    public static String DateToString(Date source, String pattern) {
        simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(source);
    }

    /**
     * 获得当前时间的指定格式
     * @param pattern
     * @return
     */
    public static String currentFormatDate(String pattern) {
        simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());

    }
}
