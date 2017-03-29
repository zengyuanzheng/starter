package china.z.starter.admin.service;

import china.z.starter.admin.model.TUser;

/**
 * Created by sherlock on 2017-03-29.
 */
public interface IUserService {

    public TUser get(String uuid);

    public String saveOrUpdate(TUser user);
}
