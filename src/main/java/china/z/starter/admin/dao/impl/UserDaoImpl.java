package china.z.starter.admin.dao.impl;

import china.z.starter.admin.dao.IUserDao;
import china.z.starter.admin.model.TUser;
import china.z.starter.common.base.impl.BaseDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by sherlock on 2017-03-29.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<TUser> implements IUserDao {
}
