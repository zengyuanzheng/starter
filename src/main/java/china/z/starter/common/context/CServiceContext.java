package china.z.starter.common.context;

/**
 * Created by sherlock on 2017-03-29.
 */
public class CServiceContext {

    /**
     * 时间格式 yyyy-MM-dd HH:mm:ss
     */
    public final static String DATE_TO_STRING_DETAIAL_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 时间格式 yyyy-MM-dd
     */
    public final static String DATE_TO_STRING_SHORT_PATTERN = "yyyy-MM-dd";

    /**
     * 排序方式 降序
     */
    public final static String SORTED_DESC = "DESC";

    /**
     * 排序方式 升序
     */
    public final static String SORTED_ASC = "ASC";

    /**
     * 状态成功
     */
    public final static String SUCCESS = "success";

    /**
     * 状态失败
     */
    public final static String ERROR = "error";

    /**
     * 状态   正常
     */
    public final static int STATE_OK = 1;

    /**
     * 状态   冻结
     */
    public final static int STATE_NO = 0;

    /**
     * redis string key
     */
    public final static String KEY_PREFIX_VALUE = "db:report:value:";

    /**
     * redis set key
     */
    public final static String KEY_PREFIX_SET = "db:report:set:";

    /**
     * redis list key
     */
    public final static String KEY_PREFIX_LIST = "db:report:list:";
}
