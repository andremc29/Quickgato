package com.example.hp.quickgato;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by HP on 05-08-2017.
 */

public class LuckyAnswer {
    private boolean answerBol;
    private boolean luckyDay;

    public LuckyAnswer(boolean answerBol) {
        this.answerBol = answerBol;
       boolean luckyDay = new LuckyDate().yourBooleanMethod();
    }

    public boolean isAnswerBol() {
        return answerBol;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate{

        public  boolean yourBooleanMethod(){
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));
            if(day%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }



}
