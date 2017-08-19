package user;

import javax.annotation.Resource;

import org.junit.Test;

import prs.dao.user.UserDao;
import prs.model.user.UserEntity;

public class TestUser {
	
	@Resource(name="user-UserDao")
	private UserDao usrDao;
	
	@Test
	public void testGetUserByUsername() {
		UserEntity u = usrDao.getByUserName("zhangsan");
		System.out.println(u);
	}
}
