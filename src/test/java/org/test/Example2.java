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

public class Example2 {

    /*private String addressLine;*/

    /*@Factory(dataProvider = "testDataProvider")
    public Example2(String addressLine) {
        this.addressLine = addressLine;
    }*/

    @Test(dataProvider = "testDataProvider")
    public void testMethodProvider(String addressLine){
        System.out.println("method runs = " + addressLine);
        if (addressLine.equalsIgnoreCase("state")) {
            Assert.assertTrue(false);
        }
    }

    @DataProvider(name = "testDataProvider")
    public static String[][] testDataProviderMethod(){
        return new String[][] {new String[]{"state"}, new String[]{"city"}};
    }

}
