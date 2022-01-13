package com.test.calc;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CalculatorPage {



WebDriver driver;
NgWebDriver ngWebDriver;
JavascriptExecutor jsDriver;



ByAngularModel Operand1 = ByAngular.model("first");
ByAngularModel Operand2 = ByAngular.model("second");
ByAngularModel operator = ByAngular.model("operator");
ByAngularButtonText Submit = ByAngular.buttonText("Go!");



By Output = By.tagName("h2");



public CalculatorPage() 
{



WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
jsDriver = (JavascriptExecutor) driver;
ngWebDriver = new NgWebDriver(jsDriver);
driver.get("http://localhost:3456/");
ngWebDriver.waitForAngularRequestsToFinish();



}



public String doSum(String v1, String v2) {
driver.findElement(Operand1).clear();
driver.findElement(Operand1).sendKeys(v1);



driver.findElement(Operand2).clear();
driver.findElement(Operand2).sendKeys(v2);



driver.findElement(operator).sendKeys("+");
driver.findElement(Submit).click();
ngWebDriver.waitForAngularRequestsToFinish();



System.out.println(driver.findElement(Output).getText());
return driver.findElement(Output).getText();
}



public String doSub(String v1, String v2) {
driver.findElement(Operand1).clear();
driver.findElement(Operand1).sendKeys(v1);



driver.findElement(Operand2).clear();
driver.findElement(Operand2).sendKeys(v2);



driver.findElement(operator).sendKeys("-");
driver.findElement(Submit).click();
ngWebDriver.waitForAngularRequestsToFinish();



System.out.println(driver.findElement(Output).getText());
return driver.findElement(Output).getText();
}

public String doMul(String v1, String v2) {
driver.findElement(Operand1).clear();
driver.findElement(Operand1).sendKeys(v1);



driver.findElement(Operand2).clear();
driver.findElement(Operand2).sendKeys(v2);



driver.findElement(operator).sendKeys("*");
driver.findElement(Submit).click();
ngWebDriver.waitForAngularRequestsToFinish();



System.out.println(driver.findElement(Output).getText());
return driver.findElement(Output).getText();
}

public String doDiv(String v1, String v2) {
driver.findElement(Operand1).clear();
driver.findElement(Operand1).sendKeys(v1);



driver.findElement(Operand2).clear();
driver.findElement(Operand2).sendKeys(v2);



driver.findElement(operator).sendKeys("/");
driver.findElement(Submit).click();
ngWebDriver.waitForAngularRequestsToFinish();



System.out.println(driver.findElement(Output).getText());
return driver.findElement(Output).getText();
}



}