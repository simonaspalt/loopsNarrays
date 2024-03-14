import java.sql.SQLOutput;

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
        frase = frase.replace("A", "");
        frase = frase.replace("E", "");
        frase = frase.replace("I", "");
        frase = frase.replace("O", "");
        frase = frase.replace("U", "");
        frase = frase.replace("Y", "");
        frase = frase.replace("a", "");
        frase = frase.replace("e", "");
        frase = frase.replace("i", "");
        frase = frase.replace("o", "");
        frase = frase.replace("u", "");
        frase = frase.replace("y", "");

        System.out.println(frase);


        frase = "Breakfast at Tiffany's";
        frase = frase.replace("A", "");
        frase = frase.replace("E", "");
        frase = frase.replace("I", "");
        frase = frase.replace("O", "");
        frase = frase.replace("U", "");
        frase = frase.replace("Y", "");
        frase = frase.replace("a", "");
        frase = frase.replace("e", "");
        frase = frase.replace("i", "");
        frase = frase.replace("o", "");
        frase = frase.replace("u", "");
        frase = frase.replace("y", "");

        System.out.println(frase);


        frase = "2001:A Space Odyssey” ir “It's a Wonderful Life";
        frase = frase.replace("A", "");
        frase = frase.replace("E", "");
        frase = frase.replace("I", "");
        frase = frase.replace("O", "");
        frase = frase.replace("U", "");
        frase = frase.replace("Y", "");
        frase = frase.replace("a", "");
        frase = frase.replace("e", "");
        frase = frase.replace("i", "");
        frase = frase.replace("o", "");
        frase = frase.replace("u", "");
        frase = frase.replace("y", "");

        System.out.println(frase);

      ///  Stringe, kurį generuoja toks kodas:
        // "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
        // Surasti ir atspausdinti epizodo numerį.

        System.out.println("======= uzd 7 =====================");

        String frase1 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(frase1);
        System.out.println("epiode number: " + frase1.replaceAll("[^0-9.]", ""));




    }
}