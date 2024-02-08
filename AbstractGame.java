package org.example.OOP_Task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    Integer sizeWorld;
    Integer maxTry;
    String value;
    String computerWord;
    GameStatus gameStatus = GameStatus.INT;

    public AbstractGame(){
        super();
        }

    abstract ArrayList<String> ganerateCharList();
    @Override
    public void start(Integer sizeWord, Integer maxTry){
        this.sizeWorld=sizeWord;
        this.maxTry=maxTry;
        computerWord = generateWord();
        gameStatus = GameStatus.START;
        System.out.println("Введите слово");
        //System.out.println("computerWord =" + computerWord);
    }

    private String generateWord(){
           List <String> alphabet = ganerateCharList();
           Random ramdom = new Random();
           String res = "";
           for (int i = 0; i < sizeWorld; i++) {
            int randomIndex = ramdom.nextInt(alphabet.size());
            res += alphabet.get(randomIndex);
            alphabet.remove(randomIndex);
            
           }

           return res;
           
    }


      @Override
      public Ansver inputValue(String value){
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else  if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
            if (bull == computerWord.length()) {
                gameStatus = GameStatus.WIN;
            }
            maxTry--;
            if (maxTry == 0 && gameStatus != GameStatus.WIN){
                gameStatus = GameStatus.LOSE;
            }
        
        return new Ansver(bull, cow, maxTry);       
        }
      


      @Override
      public GameStatus getGameStatus (){
        return gameStatus;
      }


}
