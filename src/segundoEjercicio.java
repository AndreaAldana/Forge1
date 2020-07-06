import java.util.Scanner;

public class segundoEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su salario mensual");
        int salario = sc.nextInt();
        System.out.println(nombre + " sus ingresos anuales son " + salario*12 + " sus ingresos en 5 años serán " + salario*60 + " y sus ingresos en en 10 años serán " + salario*120);
    }
}
