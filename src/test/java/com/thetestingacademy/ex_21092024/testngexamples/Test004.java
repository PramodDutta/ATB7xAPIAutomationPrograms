package com.thetestingacademy.ex_21092024.testngexamples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test004 {

    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("2");
    }
    @Test
    public void test_PUT(){
        // token and BookingID
        System.out.println("3");
    }
}
