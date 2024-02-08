package org.example.OOP_Task_3;

public enum GameStatus {
    INT(" "),
    START ("Старт игры"),
     WIN("Победа"),
     LOSE("Поражение");

    private String ruValue;

    GameStatus (String ruValue){
        this.ruValue = ruValue;
    }
    public String getRuValue(){
            return ruValue;
        }
}
 