package org.seleniumqa.lesson_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


/**
 * Created by admin on 09.02.2015.
 */
public class PrimeNumbers {

    private int number;

    @BeforeTest
    public void setUp(){
        number = 13;
    }

    @Test
    public void isPrimeTest() {
        assertTrue(isPrime(number));
    }

//        int[] arr = new int[]{6, 11, 13, 54, 99, 45};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (isPrime(arr[i])) {
//                System.out.println(arr[i]);
//            }
//        }
//    }

    public static boolean isPrime(int num) {
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    @AfterTest
    public void tearDown(){
        number = 0;
    }
}

