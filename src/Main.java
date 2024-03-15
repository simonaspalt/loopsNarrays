import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
// 012//  String name1 = "Simonas";
        //  System.out.println(name.contains("a"));
//
//        System.out.println(name1.charAt(5));
//        System.out.println(name.length());
//        System.out.println(name.repeat(10));
//        System.out.println(name.equals("simonas"));
//        System.out.println(name.trim()); /// panaikina tarpus pradzioje ir pabaigoje
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(1,5));
//        System.out.println(name.replace("o", "i"));


//Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę
// kaip stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.
        System.out.println("======= uzd 1 =====================");
        String name = "Keanu";
        String surname = "Reeves";
        if (name.length() < surname.length()) {
            System.out.println(name);
        }
        if (surname.length() < name.length()) {
            System.out.println(surname);
        }
// ka daryt jei name ilgis toks pat kaip surname?

        //     Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą
        //     ir pavardę kaip stringus. Vardą atspausdinti tik didžiosiom raidėm,
        //     o pavardę tik mažosioms. (LEONARDO dicaprio)

        System.out.println("======= uzd 2 =====================");
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        //   Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą
        //   ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti
        //   stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.
        //   Jį atspausdinti.
        System.out.println("======= uzd 3 =====================");
        String nesamone = (name.substring(0, 1) + surname.substring(0, 1));
        System.out.println(nesamone);
//Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę
// kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš
// trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.
        System.out.println("======= uzd 4 =====================");
        System.out.println(name + " " + surname);
        String nametail = "";
        String surnametail = "";
        if (name.length() >= 3) {
            nametail = (name.substring(name.length() - 3));
        } else nametail = name;
        if (surname.length() >= 3) {
            surnametail = (surname.substring(surname.length() - 3));
        } else surnametail = surname;
        System.out.println(nametail + surnametail);
        //     Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a”
        //    (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        System.out.println("======= uzd 5 =====================");
        String frase = "An American in Paris";
        frase = frase.replace("a", "*");
        frase = frase.replace("A", "*");
        System.out.println(frase);


        ///Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
        // Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
        // “2001:A Space Odyssey” ir “It's a Wonderful Life”.

        System.out.println("======= uzd 6 =====================");

        frase = "An American in Paris";
        frase = frase.replaceAll("[AEIOUaeiou]", "");

        System.out.println(frase);


        frase = "Breakfast at Tiffany's";
        frase = frase.replaceAll("[AEIOUaeiou]", "");

        System.out.println(frase);


        frase = "2001:A Space Odyssey” ir “It's a Wonderful Life";
        frase = frase.replaceAll("[AEIOUaeiou]", "");

        System.out.println(frase);

        ///  Stringe, kurį generuoja toks kodas:
        // "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
        // Surasti ir atspausdinti epizodo numerį.

        System.out.println("======= uzd 7 =====================");

        String frase1 = "Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope";
        System.out.println(frase1);
        System.out.println("epiode number: " + frase1.replaceAll("[^0-9.]", ""));

        //      Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice in the Hood”
        //      yra žodžių trumpesnių arba lygių nei 5 raidės. Pakartokite kodą su stringu
        //      “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.

        System.out.println("======= uzd 8 =====================");

        frase = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
        System.out.println(frase);
        frase = frase.replaceAll("[.!?,:-]", "");

        frase = frase.replaceAll("\\b[\\w']{6,}\\b", ""); // remove word longer than 5 letters, doessnt count '
        //  System.out.println(frase);
        frase = frase.replaceAll("\\s{2,}", " "); // turns all multiple space into single
        // System.out.println(frase);
        frase = frase.trim(); // remove  spaces in front and start of string

        frase = frase.replaceAll("[^\\s]", ""); // removes all char except space
        // System.out.println(frase);
        int wordnum = frase.length() + 1;
        System.out.println("There are " + wordnum + " words with 5 letters or less");

        frase = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
        System.out.println(frase);
        frase = frase.replaceAll("[ĄČĘĖĮŠŲŪŽąčęėįšųūž]", "a");
        frase = frase.replaceAll("[.!?,:-]", "");// ";" --- regex?
        // System.out.println(frase);
        frase = frase.replaceAll("\\b[\\w']{6,}\\b", "");
        // System.out.println(frase);

        frase = frase.replaceAll("\\s{2,}", " ");
        frase = frase.trim();
        // System.out.println(frase);
        frase = frase.replaceAll("[^\\s]", "");
        // System.out.println(frase);
        wordnum = frase.length() + 1;
        System.out.println("There are " + wordnum + " words with 5 letters or less");


        //     Parašyti kodą, kuris generuotų atsitiktinį stringą iš lotyniškų mažųjų raidžių.
        //     Stringo ilgis 3 simboliai.

        System.out.println("======= uzd 9 =====================");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int a = (int) Math.round(Math.random() * alphabet.length());
        int b = (int) Math.round(Math.random() * alphabet.length());
        int c = (int) Math.round(Math.random() * alphabet.length());

        System.out.println(a + " " + b + " " + c);
        System.out.println("" + alphabet.charAt(a) + alphabet.charAt(b) + alphabet.charAt(c) + "");

        //   Parašykite kodą, kuris generuotų atsitiktinį stringą su 10 atsitiktine tvarka išdėliotų
        //   žodžių, o žodžius generavimui imtų iš 8-me uždavinyje pateiktų dviejų stringų.
        //   Žodžiai neturi kartotis. (reikės masyvo)

        System.out.println("======= uzd 10 =====================");

        frase = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
        String[] array = frase.split(" ", 0);

//final String[] proper_noun = {"Fred", "Jane", "Richard Nixon", "Miss America"};
//Random random = new Random();
//int index = random.nextInt(proper_noun.length);
//System.out.println(proper_noun[index]);


        Random random = new Random();
        int index = random.nextInt(array.length);
        System.out.println(array[index]);



    }
}