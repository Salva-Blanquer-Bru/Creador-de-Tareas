/**
 * 
 */
package Entregable3_SalvaBlanquer;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
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
		
 
	System.out.println("Escoga una opcion");
	System.out.println("1. Escribir nuevas tareas");
	System.out.println("2. Mirar tareas completadas");
	 int opcion = teclado.nextInt();
		
	switch (opcion) {
	
	case 1:
		System.out.println("titulo de la nueva tarea ");
		
		break;
		
	case 2:
		System.out.println("tareas completadas ");
		
		break;
	}
		
	
	
				
				try {	
	     	File myFile = new File("C:\\Users\\salva\\Desktop\\de salva\\Programas Camarafp\\Programas Eclipse\\Entregable3_Salva_Blanquer\\Entregable3\\Entregable3_SalvaBlanquer\\src\\Entregable3_SalvaBlanquer\\Tareas");

					
			PrintWriter pw = new PrintWriter((myFile));//Escritura del documento
			pw.println("");
			pw.close();	
			
			Scanner doc = new Scanner(myFile);//Lectura del documento
			while (doc.hasNextLine()) {
				String Tareas = doc.nextLine();
				System.out.println(Tareas );
			

			}
		} catch (Exception e) { //Control de excepciones
			System.out.println("Revisa el codigo");
			e.printStackTrace(); //imprime el error
		}
			
	}
	
}

