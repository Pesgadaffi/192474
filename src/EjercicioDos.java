import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //¡No todos los datos vienen como los esperamos! Valida que el sueldo sea positivo, por si acaso hay un rebelde con sueldo negativo
        //Usa una variable tipo double acumuladoSueldos, y cuando imprimas, hazle un casting a float solo por estética.
        //Entre $100 y $300 incluye ambos extremos, no los dejes por fuera como si no importaran.
        //Para separar en rangos, los operadores >= y <= son tu espada y escudo.
        //Si te dan una lista de 10 sueldos y te piden saber cuántos están en cierto rango, no necesitas un array — un contador bien ubicado es suficiente.
        System.out.println("Ingrese sueldo: ");
        int sueldo = scanner.nextInt();
        if (sueldo <= 0) {
            System.out.println("Tiene que ser positivo");
            }
        
        System.out.println("Ingrese sueldo 1");
            else{
                if (sueldo <= 100 || sueldo >= 300) {
                    System.out.println("Tiene que estar entre $100 y $300");
                }
            }
            System.out.println("Ingrese sueldo 1: ");
        }
    }
        

    
