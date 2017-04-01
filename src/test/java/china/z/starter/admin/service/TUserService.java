package china.z.starter.admin.service;

import china.z.starter.admin.model.TUser;
import china.z.starter.common.context.CServiceContext;
import china.z.starter.common.util.UDateUtil;
import china.z.starter.common.util.UMd5Util;
import china.z.starter.common.util.UPkStringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sherlock on 2017-03-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class TUserService {

    @Autowired
    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @Test
    public void get(){
        TUser user = userService.get("1e18b539a94145c2867f50909aa23072");
        System.out.println(user);
    }

    @Test
    public void saveOrUpdate(){
        TUser user=new TUser();
        user.setUuid(UPkStringUtil.getUUID());
        user.setState(CServiceContext.STATE_OK);
        user.setUpdateTime(UDateUtil.currentFormatDate(CServiceContext.DATE_TO_STRING_DETAIAL_PATTERN));
        user.setCreateTime(UDateUtil.currentFormatDate(CServiceContext.DATE_TO_STRING_DETAIAL_PATTERN));
        user.setEmail("china_sherlock@163.com");
        user.setPhone("15258920215");
        user.setPassword(UMd5Util.getMd5("admin"));
        user.setRemark("回滚");
        String result = userService.saveOrUpdate(user);
        System.out.println(result);
    }
}
