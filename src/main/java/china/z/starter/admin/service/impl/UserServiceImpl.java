package china.z.starter.admin.service.impl;

import china.z.starter.admin.dao.IUserDao;
import china.z.starter.admin.model.TUser;
import china.z.starter.admin.service.IUserService;
import china.z.starter.common.context.CServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sherlock on 2017-03-29.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public TUser get(String uuid) {
        return userDao.get(uuid);
    }

    public String saveOrUpdate(TUser user) {
        try{
            userDao.saveOrUpdate(user);
            return CServiceContext.SUCCESS;
        }catch (Exception e){
            return CServiceContext.ERROR;
        }
    }
}
