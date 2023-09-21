package test_case.codes;

import java.net.MalformedURLException;

public class App {
    /**
     * @throws InterruptedException
     * @throws MalformedURLException
     */
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // TestCases tests = new TestCases(); // Initialize your test class
     
        CountHyperlinks count=new CountHyperlinks();
        // TODO: call your test case functions one after other here
                         
         count.testcase02();
         
          // END Tests
         
          count.endTest();
         
    }
          public static void main(String[] args) throws InterruptedException, MalformedURLException {
            new App().getGreeting();
        }}