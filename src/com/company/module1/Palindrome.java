package com.company.module1;
/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Palindrome
  @version  1.0.0 
  @since 14.03.2021 - 10.34
**/

public class Palindrome {

    public static boolean isPalindrome1(String text){

        for (int i = 0; i < text.length()/2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)){
                return false;
            }

        }
        return true;
    }

    // reversed method
    public static boolean isPalindrome2(String text){

        String reversed = "";

        for (int i = text.length() -1 ; i >= 0 ; i--) {
            reversed += text.charAt(i);
        }

        return reversed.equals(text);
    }

    // StringBuilder method
    public static boolean isPalindrome3(String text){

        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();

        return reversed.equals(text);
    }


    public static void main(String[] args) {

        String text = "My gym!";
        System.out.println(text);

        // Clear string from any symbols
        text = text.toLowerCase();
        text = text.replaceAll("\\P{L}", "");

        System.out.println("---------- First way ----------");
        System.out.println(isPalindrome1(text));

        System.out.println("---------- Second way ----------");
        System.out.println(isPalindrome2(text));

        System.out.println("---------- Third way ----------");
        System.out.println(isPalindrome3(text));

        /* Output:
        My gym!
        ---------- First way ----------
        true
        ---------- Second way ----------
        true
        ---------- Third way ----------
        true
        */
    }
}
