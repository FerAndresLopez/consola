package juego;

import juego.JuegoAdivinaNumero;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    JuegoAdivinaNumero juego = new JuegoAdivinaNumero(5, 1, 100);
                    juego.jugar();
                    break;
                case 2:
                    continuar = false;
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }

	}


