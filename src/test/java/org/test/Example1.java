/*
*Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/
package org.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class Example1 {

    /*@BeforeSuite()
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @AfterSuite()
    public void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeClass()
    public void init(){
        System.out.println("before class");
    }

    @AfterClass()
    public void tearDown(){
        System.out.println("after class");
    }

    @BeforeMethod()
    public void beforeEachMethod(){
        System.out.println("before each method");
    }

    @AfterMethod()
    public void afterEachMethod(){
        System.out.println("after each method");
    }
*/
    @Test
    public void testMethod1(){
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test()
    public void testMethod2(){
        while(true){
            System.out.println("method2");
            break;
        }
    }

    @Test(dependsOnMethods = "testMethod1")
    public void dependsTest(){
        System.out.println("Depends ");
    }

    @Test(dataProvider = "testqqqq")
    public void testMethod3(int i, int a){
        System.out.println("Prime Number" + i + a );

    }

    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { {1, 3}, {1, 4}};
    }

    @DataProvider(name = "testqqqq")
    public static Object[][] testProv(){
        return new Object[][] {{1, 4}, {5, 6}};
    }

}
