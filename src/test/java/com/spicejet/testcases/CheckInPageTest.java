package com.spicejet.testcases;

import com.spicejet.pages.CheckInPage;
import org.testng.annotations.Test;

public class CheckInPageTest {
    @Test
    public void verifyCheckIn() {
        CheckInPage ci = new CheckInPage();
        String pnr_num = "SR5787940KH";
        String email = "testuser@gmail.com";
        ci.CheckInPortal(pnr_num, email);
    }
}
