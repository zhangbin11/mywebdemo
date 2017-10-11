package prs.user;

import org.junit.Test;
import prs.BaseTest;
import prs.dao.user.UserDao;
import prs.model.user.UserEntity;

import javax.annotation.Resource;

public class TestUser extends BaseTest {
	
	@Resource(name="user-UserDao")
	private UserDao usrDao;
	
	@Test
	public void testGetUserByUsername() {
		UserEntity u = usrDao.getByUserName("zhangsan");
		System.out.println(u);
	}
}
