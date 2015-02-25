package org.seleniumqa.lesson5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by admin on 25.02.2015.
 */
public class TestArray {
    private int arr[];
    private int length;

    @BeforeTest
    public void setUp(){
        arr = new int[]{1,2,3,4,5};
        length = 5;
    }

    @Test
    public void verifyArrayLength(int[] arr, int length){
        assertTrue(arr.length <= length);
    }

    @AfterTest
    public void tearDown(){}


}
