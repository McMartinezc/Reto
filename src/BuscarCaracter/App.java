package BuscarCaracter;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        String paraula;
        paraula = introInfo("Introdueix la paraula:");
        caracterRepetit(paraula);
        caracterNoRepetido(paraula);
    }
    static void caracterRepetit (String paraula){
        int i =0;
        boolean encontrado =false;

        while(( i < paraula.length()) && (encontrado == false)) {
            if (paraula.indexOf(paraula.charAt(i)) != paraula.lastIndexOf(paraula.charAt(i))) {
                System.out.println("La primera lletra repetida es: " + paraula.charAt(i));
                encontrado = true;
            }else {
                System.out.println("No es repeteix cap.");
            }
            i++;
        }
    }
    static void caracterNoRepetido(String paraula) {
        int i =0;
        boolean encontrado =false;

        while(( i < paraula.length()) && (encontrado == false)) {
            if (paraula.indexOf(paraula.charAt(i)) == paraula.lastIndexOf(paraula.charAt(i))) {
                System.out.println("La primera lletra no repetida es: " + paraula.charAt(i));
                encontrado = true;
            }
            i++;
        }
    }
    static String introInfo(String missatge) {
        Scanner input = new Scanner(System.in);
        System.out.println(missatge);
        return input.nextLine();//Retorna String
    }
}
