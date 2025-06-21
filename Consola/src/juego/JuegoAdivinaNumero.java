package juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero {
    private int numeroSecreto;
    private int intentosMaximos;
    private int rangoMin;
    private int rangoMax;
    private Scanner scanner;

    public JuegoAdivinaNumero(int intentosMaximos, int rangoMin, int rangoMax) {
        this.intentosMaximos = intentosMaximos;
        this.rangoMin = rangoMin;
        this.rangoMax = rangoMax;
        this.scanner = new Scanner(System.in);
        generarNumeroSecreto();
    }

    private void generarNumeroSecreto() {
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(rangoMax - rangoMin + 1) + rangoMin;
    }

    public void jugar() {
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Debes adivinar un número entre " + rangoMin + " y " + rangoMax);
        System.out.println("Tienes " + intentosMaximos + " intentos. ¡Buena suerte!");

        for (int i = 1; i <= intentosMaximos; i++) {
            System.out.print("Intento " + i + ": Ingresa tu número: ");
            int intento = scanner.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("🎉 ¡Felicidades! Has adivinado el número correctamente.");
                return;
            } else if (intento < numeroSecreto) {
                System.out.println("🔼 El número es mayor.");
            } else {
                System.out.println("🔽 El número es menor.");
            }
        }

        System.out.println("❌ Se han agotado los intentos. El número era: " + numeroSecreto);
    }
}