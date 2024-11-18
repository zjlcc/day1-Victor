package com.tw;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_multiply_table_when_build_given_start_number_2_end_number_4() {
        //given
        com.tw.MultiplicationTableBuilder builder = new com.tw.MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        //when
        String multiplicationTable = builder.build(start, end);
        String expectedMultiplicationTable = String.format("2*2=4\r\n2*3=6 3*3=9\r\n2*4=8 3*4=12 4*4=16\r\n");
        //then
        assertEquals(expectedMultiplicationTable, multiplicationTable);
    }

    @Test
    void should_return_null_when_build_given_start_number_2_end_number_1() {
        //given
        com.tw.MultiplicationTableBuilder builder = new com.tw.MultiplicationTableBuilder();
        int start = 2;
        int end = 1;
        //when
        String multiplicationTable = builder.build(start, end);
        //then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_null_when_build_given_start_number_0_end_number_2() {
        //given
        com.tw.MultiplicationTableBuilder builder = new com.tw.MultiplicationTableBuilder();
        int start = 0;
        int end = 2;
        //when
        String multiplicationTable = builder.build(start, end);
        //then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_null_when_build_given_start_number_2_end_number_1001() {
        //given
        com.tw.MultiplicationTableBuilder builder = new com.tw.MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;
        //when
        String multiplicationTable = builder.build(start, end);
        //then
        assertNull(multiplicationTable);
    }
}
