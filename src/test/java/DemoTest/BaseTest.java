package DemoTest;

import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void testParamsPassing(){
        System.out.println("=====Test Started===========");
        System.out.println("Username is "+ System.getProperty("username"));
        System.out.println("Password is "+ System.getProperty("password"));
        System.out.println("======Test Ended============");
    }
}
