import java.util.Scanner;

public class tercerEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese precio de automovil");
        double precio = sc.nextInt();
        System.out.println("Ingrese año de fabricación");
        int añoFabricacion = sc.nextInt();
        int diferencia = 2020 - añoFabricacion;
        double precioActual = (diferencia*0.10) * precio;
        System.out.println("El valor actual del automovil es de " + precioActual);

    }
}
