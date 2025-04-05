/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo;
import java.util.Scanner;

/**
 */
public class Ciclo {

    public static void main(String[] args) {

        double nota1 = 0, nota2 = 0, nota3 = 0;
        boolean ciclo = true;
        
        Scanner lectura = new Scanner(System.in);

        while (ciclo) {
            System.out.println("MENU PRINCIPAL:");
            System.out.println("1. Digitar Nota 1");
            System.out.println("2. Digitar Nota 2");
            System.out.println("3. Digitar Nota 3");
            System.out.println("4. Calcular Nota Final");
            System.out.println("5. Salir");

            System.out.print("DIGITA UNA OPCION: ");
            int opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la Nota 1: ");
                    nota1 = lectura.nextDouble();
                    if (nota1 > 5) {
                        System.out.println("Error: La nota no puede ser mayor a 5.");
                        nota1 = 0;
                    }
                    break;

                case 2:
                    System.out.print("Ingresa la Nota 2: ");
                    nota2 = lectura.nextDouble();
                    if (nota2 > 5) {
                        System.out.println("Error: La nota no puede ser mayor a 5.");
                        nota2 = 0;
                    }
                    break;

                case 3:
                    System.out.print("Ingresa la Nota 3: ");
                    nota3 = lectura.nextDouble();
                    if (nota3 > 5) {
                        System.out.println("Error: La nota no puede ser mayor a 5.");
                        nota3 = 0; 
                    }
                    break;

                case 4:
                    if (nota1 > 0 && nota2 > 0 && nota3 > 0) {
                        double notaFinal = (nota1 + nota2 + nota3) / 3;
                        System.out.println("La Nota Final es: " + notaFinal);
                    } else {
                        System.out.println("Error: No se puede calcular la nota final porque alguna nota es inválida.");
                    }
                    break;

                case 5:
                    System.out.println("Bye Bye !!");
                    ciclo = false;
                    break;
            }
        }
    }
}