package Entregable3_SalvaBlanquer;

//Importacion de librerias necesarias 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Salvador
 */
public class Bloc_de_notas {
static Tareas[]ArrayTareas = new Tareas[10];

static int autoincremental = 0;

public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);// transcibe lo que escribas en el teclado al terminal
	boolean repite;
	while (repite = true) { // Bucle para repetir el menu hasta que el usuario lo detenga
		try {
			System.out.println("");
			System.out.println("Escoga una opcion ");
			System.out.println("");
			System.out.println("1. Escribir nuevas tareas");
			System.out.println("2. Mirar tareas");
			System.out.println("3. Completar tareas pendientes");
			System.out.println("4. Salir");

			int opcion = teclado.nextInt();
			switch (opcion) { // Declaracion de acciones en el menu

			case 1: // Crear Tareas
				System.out.println("titulo de la nueva tarea");
				CrearTareas();
				
				break;

			case 2: // Ver las tareas pendientes
				
				LeerTareas();
				break;

			

			case 3: // Completar Tareas

				CompletarTareas();
				
				break;

			case 4: // Finaliza el programa
				System.out.println("Hasta Luego");
				GuardarArchivo();
				repite = false;
				
				return;
			}
		} catch (InputMismatchException e) { // Control de una excepcion en concreto
			System.out.println("Escriba un caracter valido");
			teclado.nextLine();
		}
	}
}
				public static void LeerTareas() { //Lee y separa las tareas en pendientes y completadas
			System.out.println("Tareas Pendientes");
			for (int i = 0; i < autoincremental; i++) {
				if (ArrayTareas[i].getEstado() == false) {
					System.out.println(ArrayTareas[i]);
				}
			}
			System.out.println("Tareas Completadas");
			for (int i = 0; i < autoincremental; i++) {
				if (ArrayTareas[i].getEstado() == true) {
					System.out.println(ArrayTareas[i]);
				}
			}
		
		}
		
	public static void CrearTareas() { // Creacion de Tareas
		
		Scanner Teclado = new Scanner(System.in);
		String tarea = Teclado.nextLine();
		ArrayTareas[autoincremental++]= new Tareas(tarea, new Date(), false);
		
				
				
				
	}
	
	public static void CompletarTareas() { // Cuando introducimos un titulo que es igual al titulo de una tarea, el estado de la tarea cambia a true
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿QUE TAREA DESEAS COMPLETAR?");
		String EscogerTarea = teclado.nextLine();
	for (int i = 0; i < autoincremental; i++) {
		if (ArrayTareas[i].getTitulo().equals(EscogerTarea)) {
			ArrayTareas[i].setEstado(true);
		}
		
	}
		
	}
	
	public static void GuardarArchivo() {// Al Finalizar el programa, las tareas creadas se pasan al documento de texto
		try {
			FileWriter doc = new FileWriter  ("src\\Entregable3_SalvaBlanquer\\Tareas");
			PrintWriter pw = new PrintWriter (doc);
			for (int i = 0; i < autoincremental; i++) {
				String Guardado = ArrayTareas[i].getTitulo()+ ArrayTareas[i].getFechayHora()+ ArrayTareas[i].getEstado();
				pw.println(Guardado);
				
			}
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No hay archivo");
			e.printStackTrace();
		}
	}
}