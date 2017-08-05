package com.example.hp.quickgato;

/**
 * Created by HP on 05-08-2017.
 */

public class LuckyResult extends LuckyAnswer {

    private boolean resp;
    public LuckyResult(boolean answerBol) {
        super(answerBol);
    }


    private String processing(){
        if(isAnswerBol()){
            return "Esa es la actitud";
        }
        else {
            return "Animate";
        }

    }
    private String getLuckyDay(){
        if(isAnswerBol()){
            return "Es tu dia de suerte";
        }
        else
        {
            return "vendran mejores tiempos";
        }
    }

    public String Acceso(){
        return processing()+" "+getLuckyDay();
    }




}
