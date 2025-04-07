import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        while (true) {
            //Variable ob die gewürfelte Zahl gerade ist
            //Gewürfelte Zahl gerade   gerade = true

            boolean gerade;


            //Abfrage ob man auf gerade oder ungerade wettet

            System.out.println("Willkommen im Würfel Programm");
            System.out.println("[1] Glaubst du das die Zahl gerade ist");
            System.out.println("[2] Glaubst du das die Zahl ungerade ist");
            Scanner scanner = new Scanner(System.in);
            int wette = scanner.nextInt();


            //Würfel

            Random random = new Random();
            int x = random.nextInt(6) + 1;


            //Zahl die gewürfelt wurde und ob sie gerade oder ungerade ist

            System.out.println("Du hast " + x + " gewürfelt");

            if (x % 2 == 0) {
                System.out.println("Die Zahl ist gerade");
                gerade = true;
            } else {
                System.out.println("Die Zahl ist ungerade");
                gerade = false;
            }


            //Kontrolliert ob das Ergebnis gerade ist
                if (wette == 1 && gerade) {
                    System.out.println("Du hast gewonnen");

                } else if (wette == 2 && !gerade) {
                    System.out.println("Du hast gewonnen");

                } else if (wette == 1 && !gerade) {
                    System.out.println("Du hast verloren");

                } else if (wette == 2 && gerade) {
                    System.out.println("Du hast verloren");

                }


                //Fragt ob das Programm beendet werden soll
                System.out.println("[1]Nochmal Spielen");
                System.out.println("[2]Beenden");
                Scanner scanner2 = new Scanner(System.in);
                int wiederholen = scanner2.nextInt();
                if (wiederholen == 1) {
                    System.out.println("Starte neu");
                } else if (wiederholen == 2) {
                    System.out.println("Wird beendet");
                    break;

                }


            }
        }
    }
