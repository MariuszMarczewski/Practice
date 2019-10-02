package MorseCoder;

import java.io.OutputStream;

import java.util.*;

public class MorseCoder {

    public static void main(String[] args) {

        Map<Character, String> dictionary = new HashMap<>();
        dictionary.put('A', "._");
        dictionary.put('B', "_...");
        dictionary.put('C', "_._.");
        dictionary.put('D', "_..");
        dictionary.put('E', ".");
        dictionary.put('F', ".._");
        dictionary.put('G', "__.");
        dictionary.put('H', "....");
        dictionary.put('I', "..");
        dictionary.put('J', ".___");
        dictionary.put('K', "_._");
        dictionary.put('L', "._..");
        dictionary.put('M', "__");
        dictionary.put('N', "_.");
        dictionary.put('O', "___");
        dictionary.put('P', ".__.");
        dictionary.put('Q', "__._");
        dictionary.put('R', "._.");
        dictionary.put('S', "...");
        dictionary.put('T', "_");
        dictionary.put('U', ".._");
        dictionary.put('V', "..._");
        dictionary.put('W', ".__");
        dictionary.put('X', "_.._");
        dictionary.put('Y', "._.");
        dictionary.put('Z', "__..");
        dictionary.put('/', "/");
        dictionary.put('!', "/");
        dictionary.put('?', "/");
        dictionary.put(',', "/");
        dictionary.put('.', "/");
        dictionary.put(' ', "/");


        System.out.println("Hello, welcome in the Morse Coder!!!");

        Scanner in = new Scanner(System.in);
        System.out.println("Give a sample of text to be translate: ");

        String text = in.nextLine();
        String text1 = text.trim().toUpperCase();

        char[] textTab = text1.toCharArray();

        String textFinal = "";

        for (int i = 0; i < textTab.length; i++) {

            for (Map.Entry<Character, String> letters : dictionary.entrySet()) {

                        if (textTab[i] == letters.getKey()) {

                            StringBuilder sb = new StringBuilder();
                            textFinal = sb.append(letters.getValue()).append(" ").toString();

                            System.out.println(textFinal);
                        }
                }
            }
        }
    }


