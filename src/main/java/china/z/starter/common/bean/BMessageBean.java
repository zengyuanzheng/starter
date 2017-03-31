package china.z.starter.common.bean;

import com.alibaba.druid.support.json.JSONUtils;

/**
 * Created by sherlock on 2017-03-30.
 */
public class BMessageBean {

    private String methodName;

    private String remark;

    private String resultCode;

    private Object resultData;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public BMessageBean() {
    }

    public BMessageBean(String methodName, String remark, String resultCode, Object resultData) {
        this.methodName = methodName;
        this.remark = remark;
        this.resultCode = resultCode;
        this.resultData = resultData;
    }
}
