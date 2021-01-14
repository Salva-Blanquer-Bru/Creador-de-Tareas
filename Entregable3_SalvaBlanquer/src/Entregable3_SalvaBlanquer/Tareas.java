/**
 * 
 */
package Entregable3_SalvaBlanquer;
import java.util.Date;

public class Tareas {
	
	
	
	private   Date FechayHora;
	private  String Titulo;
	private  boolean Estado;
	
	/**
	 *  Creacion del metodo constructor Jugadores
	 * @param Turno
	 * @param Persona
	 */
	
	public Tareas(String Titulo, Date fecha, boolean Estado){
		  
		this.Titulo = Titulo;
		this.Estado = Estado;
		this.FechayHora = fecha;
		
	  }
		
	
	  public  String getTitulo() {
		   return Titulo; 
	   }
	
	  /**
	   *  Creacion del metodo getNoTurno  para utilizar el metodo privado Noturno
	   * @return
	   */
	  
	  public  boolean getEstado() {
		   return Estado; 
	   }
	  
	  /**
	   * Creacion del metodo getTurno  para utilizar el metodo privado Turno
	   * @return
	   */
	  
	  public  Date getFechayHora() {
		   return FechayHora; 
	   }
	  
	  /**
	   * Creacion del metodo getPersona  para utilizar el metodo privado Persona
	   * @return
	   */
	  
	 
	  
	  public void setTitulo(String Titulo) { 
			this.Titulo = Titulo;          
	   }	  
	  
	  /**
	   * Creacion del metodo setNoTurno  para modificar el metodo privado NoTurno
	   * @return
	   */
	  
	   public   void setEstado(boolean Estado) { 
		this.Estado = Estado;          
	   }
	  
	
	  /**
	   * Creacion del metodo setTurno  para modificar el metodo privado Turno
	   * @return
	   */
	  
	 
	  public void setFechayHora(Date FechayHora) { 
			this.FechayHora = FechayHora;          
	   }
	  public String toString() {
		  return Titulo+" "+FechayHora+" "+Estado;
	  }
}

