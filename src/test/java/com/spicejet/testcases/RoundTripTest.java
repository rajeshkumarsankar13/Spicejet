package com.spicejet.testcases;


import com.spicejet.pages.RoundTrip;
import org.testng.annotations.Test;

public class RoundTripTest {
    @Test
    public void verifyRoundTrip() {
        RoundTrip rp = new RoundTrip();
        String fpoint = "Goa";
        rp.RoundTripPortal(fpoint);
    }
}
