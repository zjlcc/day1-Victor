package com.tw;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public boolean verifyParamScope(int number){
        return number >= 1 && number <= 1000;
    }

    public boolean isStartSmallerOrEqualThanEnd(int start, int end){
        return start <= end;
    }
}
