package china.z.starter.commom.util;

import china.z.starter.common.util.URedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sherlock on 2017-03-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class TRedisUtil {

    @Autowired(required = false)
    private URedisUtil redisUtil;

    @Test
    public void cacheValue(){
        redisUtil.cacheValue("c","aaa",10000);
    }
}
