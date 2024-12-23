package com.spicejet.testcases;


import com.spicejet.pages.BaseTest;
import com.spicejet.pages.SignUpPage;
import org.testng.annotations.Test;


public class SignUpTest extends BaseTest {
    @Test
    public void verifySignUp() {
        SignUpPage sp = new SignUpPage(driver);
        String first_name = "Rajeshkumar";
        String last_name = "Sankar";
        String month = "7";
        String year = "1991";
        String mobile = "123456789";
        String Email = "testuser@test.com";
        String password = "Test123456$";
        String cpassword = "Test123456$";
        sp.SignUpToPortal(first_name, last_name, month, year, Email, mobile, password, cpassword);
    }
}
