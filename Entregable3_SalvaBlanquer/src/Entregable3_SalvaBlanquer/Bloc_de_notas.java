/**
 * 
 */
package Entregable3_SalvaBlanquer;

import java.io.File;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entregable3_SalvaBlanquer.*;

/**
 * @author Salvador
 *
 */
public class Bloc_de_notas {

	
	public static void main(String[] args)  {

		Scanner teclado = new Scanner(System.in);// transcibe lo que escribas en el teclado al terminal

		Tareas tarea1;
		boolean repite;
		boolean TareasCompletadas = false;

		while (repite = true) {
			System.out.println("");
			System.out.println("Escoga una opcion ");
			System.out.println("");
			System.out.println("1. Escribir nuevas tareas");
			System.out.println("2. Mirar tareas pendientes");
			System.out.println("3. Mirar tareas completadas");
			System.out.println("4. Completar tareas pendientes");
			System.out.println("5. Salir");

			int opcion = teclado.nextInt();

			switch (opcion) {

			case 1: // Crear Tareas
				System.out.println("titulo de la nueva tarea");

				tarea1 = CrearTarea();

				try {
					File myFile = new File("src\\Entregable3_SalvaBlanquer\\Tareas");

					PrintWriter pw = new PrintWriter(new FileWriter(myFile, true)); // Escritura del documento
					pw.println(tarea1);

					pw.close();

				} catch (Exception e) { // Control de excepciones
					System.out.println("Revisa el codigo");
					e.printStackTrace(); // imprime el error

					break;

				}
			case 2: // Tareas Pendientes

				break;

			case 3: // Tareas Completadas

				break;

			case 5: // Finalizar programa
				System.out.println("Hasta Luego");
				repite = false;
				return;

			case 4: // Completar Tareas

				// String eleccion = teclado.nextLine();
				System.out.println("¿Esta Completada? (SI/NO)");
				String respuesta = teclado.next();

				if (respuesta.equals("SI")) {
					
					try {
						String myStr1 = "SI";
					File myFile = new File("src\\Entregable3_SalvaBlanquer\\Tareas Completadas");

					PrintWriter pw = new PrintWriter(new FileWriter(myFile, true)); // Escritura del documento
					pw.println("Completada");
					pw.close();
						
					} catch (Exception e) {
						// TODO: handle exception
					
					
				
				}
					
				if (respuesta.equals("NO")) {
					
				try {
					String myStr2 = "NO";
					File myFile = new File("src\\Entregable3_SalvaBlanquer\\Tareas Pendientes");
					
					PrintWriter pw = new PrintWriter(new FileWriter(myFile, true)); // Escritura del documento
					pw.println("Pendiente");
					pw.close();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
					

					
				}
				break;
			}

			try {
				File myFile = new File("src\\Entregable3_SalvaBlanquer\\Tareas Completadas"); // Declaracion y ruta del documento

				Scanner doc = new Scanner(myFile);// Lectura del documento
				while (doc.hasNextLine()) {
					String Tareas = doc.nextLine();

				}
			} catch (Exception e) { // Control de excepciones
				System.out.println("Revisa el codigo");
				e.printStackTrace(); // imprime el error
			}
		}}

	}



public static Tareas CrearTarea() {
	Scanner sc = new Scanner(System.in);
	String Titulo = sc.nextLine();
	boolean Estado = false;
	Date fecha = new Date();
	return new Tareas(Titulo,fecha,Estado);
	
	
	
	
}
}

