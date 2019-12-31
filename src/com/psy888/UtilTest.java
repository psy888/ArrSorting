package com.psy888;

import org.junit.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @org.junit.jupiter.api.Test
    void sort() {

        String[] actualStr = new String[]{"cc", "dd", "ee", "bb", "aa"};
        int[] actualInt = new int[]{44, 22, 33, 0, 11};
        String[] expectedStr = new String[]{"aa", "bb", "cc", "dd", "ee"};
        int[] expectedInt = new int[]{0, 11, 22, 33, 44};

        Util util = new Util();
        actualStr = util.sort(actualStr);
        actualInt = util.sort(actualInt);


        Assert.assertArrayEquals(expectedInt, actualInt);
        Assert.assertArrayEquals(expectedStr, actualStr);

    }
}