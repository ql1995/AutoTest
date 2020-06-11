package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public  void test1(){
        System.out.println("ignore1");
    }
    @Test(enabled = true)
    public void test2(){
        System.out.println("ignore2");
    }
}
