package prs;

import org.junit.runner.RunWith;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration;

/**
 * Created by zhangbin on 2017/10/11.
 */

public class BaseTest extends AbstractDependencyInjectionSpringContextTests {

    protected String defaultConfig = "classpath:/applicationContext.xml";

    protected String[] getConfigLocations() {
        return new String[]{defaultConfig};
    }


}
