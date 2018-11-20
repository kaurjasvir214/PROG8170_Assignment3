package com.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void Addition_Input_10_10_Expected_20() {
        MainActivity obj = new MainActivity();
        int result = obj.Addition(10, 10);
        assertThat(result, is(20));
    }

    @Test
    public void Addition_Input_2500_1000_Expected_3500() {
        MainActivity obj = new MainActivity();
        int result = obj.Addition(2500, 1000);
        assertThat(result, is(3500));
    }

    @Test
    public void Addition_Input_3_negative_4_Expected_1() {
        MainActivity obj = new MainActivity();
        int result = obj.Addition(3, -4);
        assertThat(result, is(-1));
    }

    @Test
    public void Subtraction_Input_8_8_Expected_0() {
        MainActivity obj = new MainActivity();
        int result = obj.Subtraction(8, 8);
        assertThat(result, is(0));
    }

    @Test
    public void Subtraction_Input_5_10_Expected_negative_5() {
        MainActivity obj = new MainActivity();
        int result = obj.Subtraction(5, 10);
        assertThat(result, is(-5));
    }

    @Test
    public void Subtraction_Input_5000_4500_Expected_500() {
        MainActivity obj = new MainActivity();
        int result = obj.Subtraction(5000, 4500);
        assertThat(result, is(500));
    }

    @Test
    public void Multiply_Input_10_10_Expected_100() {
        MainActivity obj = new MainActivity();
        int result = obj.Multiplication(10, 10);
        assertThat(result, is(100));
    }

    @Test
    public void Multiply_Input_negative_5_10_Expected_negative_50() {
        MainActivity obj = new MainActivity();
        int result = obj.Multiplication(-5, 10);
        assertThat(result, is(-50));
    }


    @Test
    public void Multiply_Input_45_0_Expected_0() {
        MainActivity obj = new MainActivity();
        int result = obj.Multiplication(45, 0);
        assertThat(result, is(0));
    }

    @Test
    public void Divide_Input_15_5_Expected_3() {
        MainActivity obj = new MainActivity();
        int result = obj.Division(15, 5);
        assertThat(result, is(3));
    }

    @Test
    public void Divide_Input_9999_3333_Expected_3() {
        MainActivity obj = new MainActivity();
        int result = obj.Division(9999, 3333);
        assertThat(result, is(3));
    }

    @Test
    public void Divide_Input_negative_10_2_Expected_negative_5() {
        MainActivity obj = new MainActivity();
        int result = obj.Division(-10, 2);
        assertThat(result, is(-5));
    }
}