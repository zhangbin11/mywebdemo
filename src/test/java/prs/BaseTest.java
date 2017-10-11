package prs;

import org.junit.runner.RunWith;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration;

/**
 * Created by zhangbin on 2017/10/11.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest extends AbstractDependencyInjectionSpringContextTests {

    protected String defaultConfig = "classpath:/applicationContext.xml";

    protected String[] getConfigLocations() {
        return new String[]{defaultConfig};
    }


}
