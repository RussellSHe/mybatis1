package dao;

import domain.user;

import java.util.List;

/**
 * @ProjectName: mybatis1
 * @Package: dao
 * @ClassName: IUserDao
 * @Description:
 * @Author: zengyanbo
 * @CreateDate: 2019-04-28 18:06
 * @UpdateDate: 2019-04-28 18:06
 * @Version: 1.0
 */

public interface IUserDao {

    List<user> findAll();
}
