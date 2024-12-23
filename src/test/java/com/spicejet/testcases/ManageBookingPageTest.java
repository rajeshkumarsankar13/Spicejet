package com.spicejet.testcases;

import com.spicejet.pages.ManageBookingPage;
import org.testng.annotations.Test;

public class ManageBookingPageTest {
    @Test
    public void verifyManageBooking() {
        ManageBookingPage mb = new ManageBookingPage();
        String pnrnum = "SR5787940KH";
        String email = "testuser@gmail.com";
        mb.ManageBookingPortal(pnrnum, email);
    }
}
