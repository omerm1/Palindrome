package com.sparta.om;

public class MyStrings {
    public void sayHello() {
        System.out.println("Hello");
    }
    public boolean letterExists (String strIn, String strSearch) {
        return strSearch.contains(strIn);
    }
    public String reverse(String word) {
        String newWord = "";
        for(int i=word.length() - 1; i>=0; i--) {
            newWord += word.charAt(i);
        }
        return newWord;
    }

    public boolean isPalindrome(String word) {
        String wordReversed = this.reverse(word);
        if (wordReversed.equals(word)) {
            return true;
        } else {return false;}
    }
}
