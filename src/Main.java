import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        //Variable ob die gewürfelte Zahl gerade ist
        //Gewürfelte Zahl gerade   gerade = true

        boolean gerade;


        //Abfrage ob man auf gerade oder ungerade wettet

        System.out.println("Willkommen im Würfel Programm");
        System.out.println("Glaubst du die Zahl wird gerade oder ungerade?");
        Scanner scanner = new Scanner(System.in);
        String wette = scanner.nextLine();


        //Würfel

        Random random = new Random();
        int x = random.nextInt(6)+1;


        //Zahl die gewürfelt wurde und ob sie gerade oder ungerade ist

        System.out.println("Du hast " + x + " gewürfelt");

        if(x % 2 == 0){
            System.out.println("Die Zahl ist gerade");
            gerade = true;
        }else{
            System.out.println("Die Zahl ist ungerade");
            gerade = false;
        }


        //Kontrolliert ob das Ergebnis gerade ist

        if(gerade == true && wette.equals("gerade")){
            System.out.println("Du hast gewonnen");
        } else if (gerade == false && wette.equals("ungerade")) {
            System.out.println("Du hast gewonnen");
        } else if(gerade == true && wette.equals("ungearde")){
            System.out.println("Du hast leider verloren");
        } else if(gerade == false && wette.equals("gerade")){
            System.out.println("Du hast leider verloren");
        }
    }
}