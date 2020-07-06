package ejercicio1;

import java.util.Scanner;

public class primerEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer nombre");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese segundo nombre");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese mes en que se conocieron");
        String mes = sc.nextLine();
        System.out.println(nombre1 + " y " + nombre2 + " se conocieron en " + mes);
    }
}
