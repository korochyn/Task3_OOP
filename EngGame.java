package org.example.OOP_Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class EngGame extends AbstractGame{
    @Override
    ArrayList<String> ganerateCharList() {
        return new ArrayList<>(Arrays.asList("A","B","C","D","F","G","H","I","J","K",
                                        "L","M","N","O","Q","R","S","T","U","U","V","W","X","Y","Z" ));
    }
}
