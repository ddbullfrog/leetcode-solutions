package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

public class FindPeakElementTest {

    private FindPeakElement findPeakElement = new FindPeakElement();

    @Test
    public void testFindPeakElement1() {
        int[] nums = {1, 2, 3, 1};
        int actualResult = findPeakElement.findPeakElement(nums);
        Assert.assertEquals(2, actualResult);
    }

    @Test
    public void testFindPeakElement2() {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int actualResult = findPeakElement.findPeakElement(nums);
        Assert.assertEquals(5, actualResult);
    }
}
