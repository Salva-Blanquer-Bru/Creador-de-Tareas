/**
 * 
 */
package Entregable3_SalvaBlanquer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Salvador
 *
 */
public class Tiempo_Tareas {

	/**
	 * 
	 */
	
	public static void main(String[] args) {
		
	
	
		Date date = new Date();

		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
		
		System.out.println(hourdateFormat.format(date));
	}}

