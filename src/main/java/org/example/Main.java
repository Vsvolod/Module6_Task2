package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Edit your words: ");
        String test = in.nextLine();
        System.out.println(coding(test));



    }
    public static String coding(String test) {

        String result = new String();
        String[] testArray = test.split(" ");
        String finishResult = new String();
        if(!test.isEmpty()){

            for (int i = 0; i < testArray.length; i++) {
            int j = testArray[i].charAt(0);
            result = testArray[i].substring(1);
            char temp = result.charAt(0);
            char[] tempArr = result.toCharArray();
            tempArr[0] = tempArr[tempArr.length - 1];
            tempArr[tempArr.length - 1] = temp;
            finishResult += j + String.valueOf(tempArr) + " ";
            }
        }else{
            finishResult = "You don't edit your words.";
        }
        return finishResult;
    }
}
