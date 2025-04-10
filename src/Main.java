import java.util.Random;
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        System.out.println("Test123");

        while (true) {
            //Variable ob die gewürfelte Zahl gerade ist
            //Gewürfelte Zahl gerade   gerade = true

            boolean gerade;


            //Abfrage ob man auf gerade oder ungerade wettet

            JOptionPane.showMessageDialog(null, "Wilkommen im Würfel Programm");
            String wette0 = JOptionPane.showInputDialog("Glaubst du das der Würfel gerade[1] oder ungerade[2] ist ?");
            int wette = Integer.parseInt(wette0);


            //Würfel

            Random random = new Random();
            int x = random.nextInt(6) + 1;


            //Zahl die gewürfelt wurde und ob sie gerade oder ungerade ist

            JOptionPane.showMessageDialog(null,"Du hast "+ x +" gewürfelt");

            if (x % 2 == 0){
                JOptionPane.showMessageDialog(null,"Die Zahl ist gerade");
                gerade = true;
            } else {
                JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade");
                gerade = false;
            }


            //Kontrolliert ob das Ergebnis gerade ist
                if (wette == 1 && gerade) {
                    JOptionPane.showMessageDialog(null,"Du hast gewonnen");

                } else if (wette == 2 && !gerade) {
                    JOptionPane.showMessageDialog(null, "Du hast gewonnen");

                } else if (wette == 1 && !gerade) {
                    JOptionPane.showMessageDialog(null, "Du hast verloren");

                } else if (wette == 2 && gerade) {
                    JOptionPane.showMessageDialog(null, "Du hast verloren");

                }


                //Fragt ob das Programm beendet werden soll
                String ende = JOptionPane.showInputDialog("Soll das Programm beendet werden? (Ja oder Nein)");
                // || Steht für oder
                if (ende .equals("ja")  || ende .equals("Ja")){
                    JOptionPane.showMessageDialog(null,"Programm wird beendet");
                    break;
                }else if (ende .equals("nein") || ende .equals("Nein")){
                    JOptionPane.showMessageDialog(null,"Dann nochmal von vorn :)");
                }else{
                    JOptionPane.showMessageDialog(null, "Das nehm ich mal als nein :(");
                    break;
                }
            }
        }
    }
