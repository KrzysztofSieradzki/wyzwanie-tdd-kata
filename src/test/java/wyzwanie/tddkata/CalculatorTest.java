package wyzwanie.tddkata;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class CalculatorTest {


    @Test
    public void should_return_zero_for_empty_string() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(0));
    }

    @Test

    public void oneParameterShouldReturnHisValue(){
        //given
        Calculator calculatorUnderTest = new Calculator();
        String oneParameter="2";
        //when
        Integer output = calculatorUnderTest.add(oneParameter);
        //then
        assertThat(output, equalTo(2));
    }

    @Test
    public void twoParametersShouldReturnSumOfThem() {
        //give
        Calculator calculatorUnderTest = new Calculator();
        String twoParameters = "1,2";
        //when
        Integer output = calculatorUnderTest.add(twoParameters);
        //then
        assertThat(output, equalTo(3));
    }
    @Test
    public void should_return_zero_for_null_input() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = null;

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(0));
    }

    @Test
    public void should_return_self_for_a_single_number() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "42";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(42));
    }

    @Test
    public void should_return_sum_for_two_numbers() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "7,11";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(18));
    }

    @Test
    public void should_ignore_non_numbers_and_sum_rest() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "a,3";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(3));
    }

    @Test
    public void should_return_error_when_no_comma_as_delimeter() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "1;3";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then

    }

    @Test
    public void shouldChangeDelimiterAfterProperCommend(){
        //given
        Calculator calculatorUnderTest = new Calculator();
        String properCommend = "//[:]\n1:3";
        //when
        char result = calculatorUnderTest.setDelimiter(properCommend);
        //then
        assertThat(result,equalTo(':'));
    }
    @Test
    public void shouldChangeDelimiterAfterProperCommend2(){
        //given
        Calculator calculatorUnderTest = new Calculator();
        String properCommend = "//[+]\n1:3";
        //when
        char result = calculatorUnderTest.setDelimiter(properCommend);
        //then
        assertThat(result,equalTo('+'));
    }


    @Test
    public void should_return_three_for_comma_at_end() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String threeComma = "3,";

        //when
        Integer result = calculatorUnderTest.add(threeComma);

        //then
        assertThat(result, equalTo(3));
    }




}