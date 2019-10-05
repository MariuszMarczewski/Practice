package MorseCoder;

import java.util.*;

class ICAOCoder implements Coder {

    @Override
    public void start() {
        System.out.println("Welcome to the ICAO Coder!");
    }
    

    public static void main(String[] args) {

        ICAOCoder c = new ICAOCoder();
        c.start();

        Map<Character, String> dictionary = new HashMap<>();
        dictionary.put('A', "Alpha");
        dictionary.put('B', "Bravo");
        dictionary.put('C', "Charlie");
        dictionary.put('D', "Delta");
        dictionary.put('E', "Echo");
        dictionary.put('F', "Foxtrot");
        dictionary.put('G', "Golf");
        dictionary.put('H', "Hotel");
        dictionary.put('I', "India");
        dictionary.put('J', "Juliett");
        dictionary.put('K', "Kilo");
        dictionary.put('L', "Lima");
        dictionary.put('M', "Mike");
        dictionary.put('N', "November");
        dictionary.put('O', "Oscar");
        dictionary.put('P', "Papa");
        dictionary.put('Q', "Quebec");
        dictionary.put('R', "Romeo");
        dictionary.put('S', "Sierra");
        dictionary.put('T', "Tango");
        dictionary.put('U', "Uniform");
        dictionary.put('V', "Victor");
        dictionary.put('W', "Whiskey");
        dictionary.put('X', "X-Ray");
        dictionary.put('Y', "Yankee");
        dictionary.put('Z', "Zulu");
        dictionary.put('/', "/");
        dictionary.put('!', "/");
        dictionary.put('?', "/");
        dictionary.put(',', "/");
        dictionary.put('.', "/");
        dictionary.put(' ', "/");

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
