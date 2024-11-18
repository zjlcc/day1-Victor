package com.tw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public boolean verifyParams(int start, int end){
        boolean isStartValid = verifyParamScope(start);
        boolean isEndValid = verifyParamScope(end);
        boolean isStartSmallerThanOrEqualEnd = isStartSmallerOrEqualThanEnd(start, end);
        return isEndValid && isStartValid && isStartSmallerThanOrEqualEnd;
    }

    public String printMultiplicationItem(int row, int col){
        return col + "*" + row + "=" + row * col;
    }

    public String printMultiplicationRow(int start, int row) {
        return IntStream.rangeClosed(start, row)
                .mapToObj(i -> printMultiplicationItem(row, i))
                .collect(Collectors.joining(" "));
    }

    public String printMultiplicationMap(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(i -> printMultiplicationRow(start, i))
                .collect(Collectors.joining("\r\n"));
    }
}
