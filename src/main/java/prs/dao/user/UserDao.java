package prs.dao.user;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import prs.model.user.UserEntity;

@Repository("userDao")
public interface UserDao {
	UserEntity getByUserName(@Param("username")String username);
}
