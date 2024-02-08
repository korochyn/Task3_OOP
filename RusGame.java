package org.example.OOP_Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class RusGame extends AbstractGame{
    @Override
    ArrayList<String> ganerateCharList() {
        return new ArrayList<>(Arrays.asList("А","Б","В","Г","Д","Е","Ё","Ж","З","И",
                                                "Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф",
                                                "Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я" ));
    }
}
