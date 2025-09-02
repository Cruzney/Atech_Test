package org.example;
public class AnagramaApp {
    public static void main ( String[] args ) {

//        Exemplo 1:
//        Input: s = "anagram", t = "nagaram"
//        Output: true

        String s = "anagram";
        String t = "nagaram";

        System.out.println(Anagrama.isAnagram(s, t));

        System.out.println();

//      Exemplo 2:
//      Input: s = "rat", t = "car"
//      Output: false

        String s2 = "rat";
        String t2 = "car";

        System.out.println(Anagrama.isAnagram(s2, t2));

    }
}