package org.example.OOP_Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberGame extends AbstractGame{
    @Override
    ArrayList<String> ganerateCharList() {
        return new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
    }
}
