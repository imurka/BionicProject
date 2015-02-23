package org.seleniumqa.lesson_2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

/**
 * Created by admin on 11.02.2015.
 */
public class TestCalculation {
    private int[] arr;
    private int number;
    private int position;

    @BeforeTest
    public void setUp(){
       arr = new int[]{2,4,5,9,45,76,2,3,5,7,3456,56,7,8,2};
        number = 2;
        position = arr.length - 1;
    }


    @Test
    public void verifyNumberPosition(){
        assertTrue(verifyPositionOfNumber(arr, number, position));

    }

    public boolean verifyPositionOfNumber(int[] arr, int num, int position){
        if (getPositionOfNumber(arr, num) == position) {
            return true;
        } else
            return false;
    }

    public int getPositionOfNumber(int[] arr, int num){
        int position = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
               position = i;
            }
        }
        return position;
    }

    @AfterTest
    public void tearDown(){

    }
}
