package com.spicejet.testcases;


import com.spicejet.pages.BaseTest;
import com.spicejet.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {
    @Test
    public void verifyLogin() throws IOException {
        LoginPage lp = new LoginPage(driver);
        String username = "testuser@test.com";
        String password = "Test123456$";
        lp.loginToPortal(username, password);
    }

}
