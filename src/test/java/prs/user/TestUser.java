package prs.user;

import org.junit.Test;
import prs.BaseTest;
import prs.BaseTest2;
import prs.dao.user.UserDao;
import prs.model.user.UserEntity;

import javax.annotation.Resource;

public class TestUser extends BaseTest2 {
	
	@Resource(name="userDao")
	private UserDao usrDao;
	
	@Test
	public void testGetUserByUsername() {
		UserEntity u = usrDao.getByUserName("zhangsan");
		System.out.println(u);
	}
}
