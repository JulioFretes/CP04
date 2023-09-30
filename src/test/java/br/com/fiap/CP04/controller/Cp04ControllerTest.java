package br.com.fiap.CP04.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Cp04ControllerTest {

	Cp04Controller controller = new Cp04Controller();
	
	 @Test
    public void testFindSingleNumberWithValidInput() {
        int[] nums = {1, 2, 2, 1, 3};
        int expectedResult = 3;
        int actualResult = controller.findSingleNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindSingleNumberWithNullInput() {
        int[] nums = null;
        assertThrows(NullPointerException.class, () -> {
        	controller.findSingleNumber(nums);
        });
    }

    @Test
    public void testMaxConsecutiveOnesWithValidInput() {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int expectedResult = 3;
        int actualResult = controller.findMaxConsecutiveOnes(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxConsecutiveOnesWithEmptyArray() {
        int[] nums = {};
        int expectedResult = 0;
        int actualResult = controller.findMaxConsecutiveOnes(nums);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxConsecutiveOnesWithNullInput() {
        int[] nums = null;
        assertThrows(NullPointerException.class, () -> {
        	controller.findMaxConsecutiveOnes(nums);
        });
    }

    @Test
    public void testMaxConsecutiveOnesWithAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int expectedResult = 0;
        int actualResult = controller.findMaxConsecutiveOnes(nums);
        assertEquals(expectedResult, actualResult);
    }
    
}
