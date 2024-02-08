package org.example.OOP_Task_3;

public interface Game  {
    void start(Integer sizeWord, Integer maxTry);
    Ansver inputValue(String value);
    GameStatus getGameStatus();
}
