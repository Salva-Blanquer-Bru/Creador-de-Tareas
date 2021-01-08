/**
 * 
 */
package Entregable3_SalvaBlanquer;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entregable3_SalvaBlanquer.Tiempo_Tareas;

/**
 * @author Salvador
 *
 */
public class Bloc_de_notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);// transcibe lo que escribas en el teclado al terminal
		
		Tareas tareas1 = null;
		boolean repite;

		while (repite = true) { 
			System.out.println("");
			System.out.println("Escoga una opcion ");
			System.out.println("");
			System.out.println("1. Escribir nuevas tareas");
			System.out.println("2. Mirar tareas pendientes");
			System.out.println("3. Mirar tareas completadas");
			System.out.println("4. Salir");

			int opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("titulo de la nueva tarea");
				
			 tareas1= CrearTarea();
			 
			 try {
					File myFile = new File("src\\Entregable3_SalvaBlanquer\\Tareas");

							
					PrintWriter pw = new PrintWriter(new FileWriter(myFile, true)); //Escritura del documento
					pw.println(tareas1);
					
					pw.close();
			 } catch (Exception e) { // Control de excepciones
					System.out.println("Revisa el codigo");
					e.printStackTrace(); // imprime el error
				}
				break;

			case 2:
				System.out.println("tareas pendientes ");
				

				break;

			case 3:
				System.out.println("tareas completadas ");
				

				break;

			case 4:
				System.out.println("Hasta Luego");
				repite = false;
				return;
				
			}

			try {
				File myFile = new File("src\\Entregable3_SalvaBlanquer\\Tareas");

						
				PrintWriter pw = new PrintWriter(new FileWriter(myFile, true)); //Escritura del documento
				pw.println(tareas1);
				
				pw.close();
    
				Scanner doc = new Scanner(myFile);// Lectura del documento
				while (doc.hasNextLine()) {
					String Tareas = doc.nextLine();
					System.out.println(Tareas);
					
				}
			} catch (Exception e) { // Control de excepciones
				System.out.println("Revisa el codigo");
				e.printStackTrace(); // imprime el error
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

