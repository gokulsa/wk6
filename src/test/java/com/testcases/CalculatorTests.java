package com.testcases;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.calc.CalculatorPage;




public class CalculatorTests {

CalculatorPage calPage;

@BeforeTest
public void setup(){
calPage = new CalculatorPage();
}


@Test(priority=1)
public void sumTest(){
String res = calPage.doSum("10", "20");
Assert.assertEquals(res, "30");
}

@Test(priority=2)
public void subTest(){
String res = calPage.doSub("100", "80");
Assert.assertEquals(res, "20");
}

@Test(priority=3)
public void mulTest(){
String res = calPage.doMul("20", "2");
Assert.assertEquals(res, "40");
}

@Test(priority=4)
public void divTest(){
String res = calPage.doDiv("20", "2");
Assert.assertEquals(res, "10");
}



}