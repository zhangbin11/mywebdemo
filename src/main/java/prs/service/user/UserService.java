package prs.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import prs.dao.user.UserDao;
import prs.model.user.UserEntity;

@Service("user-UserService")
public class UserService {
	
	@Resource(name="user-UserDao")
	private UserDao usrDao;
	
	public String getUserByUserName() {
		UserEntity u = usrDao.getByUserName("zhangsan");
		return u.toString();
	}

}
