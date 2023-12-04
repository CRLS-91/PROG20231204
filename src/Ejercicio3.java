import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int nAlumnos = sc.nextInt();

			String[] nombres = new String[nAlumnos];
			float[] notas = new float[nAlumnos * 3];

			for (int i = 0; i < nAlumnos; i++) {
				nombres[i] = sc.nextLine();
				notas[i * 3] = sc.nextFloat();
				notas[i * 3 + 1] = sc.nextFloat();
				notas[i * 3 + 2] = sc.nextFloat();
			}

			mostrarTabla(nombres, notas);
		}
	}

	private static void mostrarTabla(String[] nombres, float[] notas) {

		System.out.println("| Nombre | BD | LM | FH | Media |");

		for (int i = 0; i < nombres.length; i++) {

			float notaMedia = (notas[i * 3] + notas[i * 3 + 1] + notas[i * 3 + 2]) / 3;

			String nombreFormateado = nombres[i].substring(0, 7) + "...";
			String notaBDFormateada = String.format("%.2f", notas[i * 3]);
			String notaLMFormateada = String.format("%.2f", notas[i * 3 + 1]);
			String notaFHFormateada = String.format("%.2f", notas[i * 3 + 2]);
			String notaMediaFormateada = String.format("%.4f", notaMedia);

			System.out.println(String.format("| %-10s | %-5s | %-5s | %-5s | %-5s |", nombreFormateado,
					notaBDFormateada, notaLMFormateada, notaFHFormateada, notaMediaFormateada));
		}
	}
}
