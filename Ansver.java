package org.example.OOP_Task_3;

//import java.util.ArrayList;

public class Ansver {
    int bull;
    int cow;
    int maxTry;

   
 

    public Ansver(int bull, int cow, int maxTry) {
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;

    }




    @Override
    public String toString(){
        return "Answer{ " + "быков = " + bull + 
                " коров = " + cow + " maxTry = " + maxTry + " }";
    }

}
