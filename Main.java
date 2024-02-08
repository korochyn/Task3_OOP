package org.example.OOP_Task_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> wayGames = new ArrayList<String>();

        System.out.println("Выберите тип игры русский/английский/цифровой");
        System.out.println("для этого введите R/E/N");       
        Scanner in = new Scanner(System.in);
        String typeGames = in.nextLine();
        System.out.println("Введите длину слова");
        Integer inSizeWord = Integer.parseInt(in.nextLine());
        System.out.println("Число попыток");
        Integer inMaxTry = Integer.parseInt(in.nextLine());

        Game game = new NumberGame() ;
        switch(typeGames){
            
            case  "R" : Game game1 = new RusGame() ;    game = game1; break;
            case  "E" : Game game2 = new EngGame() ;    game = game2; break;
            case  "N"  : Game game3 = new NumberGame() ; game = game3; break;
            default :  break;
        }
       


        game.start(inSizeWord, inMaxTry);
        while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() !=GameStatus.LOSE) {

            String wayGamesSTR = (in.nextLine()).substring(0, inSizeWord);
            Ansver ansver = game.inputValue(wayGamesSTR);
            wayGames.add(wayGamesSTR);
           System.out.println("Текущее сотояние игры = " + game.getGameStatus().getRuValue());
            System.out.println("ansver = " + ansver);
        }
        System.out.println("Вывести историю игры? Y/N");  
        String wayGamesYN = in.nextLine();
        switch(wayGamesYN) {
            case "Y": System.out.println("Вы ввели  такие слова :" + wayGames); break;
            default :  break;
        }
        System.out.println(wayGames);

    }
    
}
