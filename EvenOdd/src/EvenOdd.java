// EvenOdd
// Autore: Marco Del Core

import java.util.ArrayList;
import java.util.List;
import java.applet.*;

public class EvenOdd {
    public static void main(String[] args){

        // lista numeri
        int[] n = new int [args.length];

        // controllo dati
        for (int i=0; i<args.length; i++){
            try {
                n[i] = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e){
                System.out.println("sbaliato!!1!!1!!!");
            }
        }
        // check se numero è pari o dispari, controllando prima se sia "0" così da non ripetere Even due volte...
        for (int n2 : n) {
            if(n2 == 0){
                System.out.println("Even => 0");
            }
            else if(n2 % 2 == 0){
                System.out.println("Even");
            }
            if(n2 % 2 !=0){
                System.out.println("Odd");
            }

        }
    }
}