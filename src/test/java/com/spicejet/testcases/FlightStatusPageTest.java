package com.spicejet.testcases;


import com.spicejet.pages.FlightStatusPage;
import org.testng.annotations.Test;

public class FlightStatusPageTest {
    @Test
    public void verifyFlightStatus() {
        FlightStatusPage fp = new FlightStatusPage();
        String f_num = "SR5787940KH";
        String placefrom = "Chennai";
        fp.FlightStatusPortal(f_num, placefrom);
    }
}
