package ictgradschool.industry.exceptions.custom;

import ictgradschool.Keyboard;

public class custom {
    static String firstLetterWord(String str) {
        String result = "";
        boolean v = true;
        for (int i = 0; i < str.length(); i++) ;
        {
            if (str.charAt(i) == ' ') {
                v = true;
            }
            else if (str.charAt(i) != ' '&& v == true){
                result += ()
            }
        }


    }


    public void start() {
        System.out.println("Enter a string of at most 100 character: ");
        String mystr = Keyboard.readInput();
        System.out.println("You entered: ");
    }


}






