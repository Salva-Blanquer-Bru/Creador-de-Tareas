/**
 * 
 */
package Entregable3_SalvaBlanquer;
import java.util.Date;
/**
 * @author salva
 *
 */
public class Tareas {

	
	public String toString (){
        String Tarea = titulo;
        return Tarea + Fecha;
    }
	
	private String titulo;
	private Date Fecha;
	private boolean estado;

	
	/**
	 *  Creacion del metodo constructor Jugadores
	 * @param Turno
	 * @param Persona
	 */
	
	public Tareas (String Titulo, Date fecha, boolean Estado){
		  
		this.titulo = Titulo;
		this.Fecha  = fecha;
		this.estado = Estado;
		
	  }
		
	
	  public String getTitulo() {
		   return titulo; 
	   }
	
	  /**
	   *  Creacion del metodo getNoTurno  para utilizar el metodo privado Noturno
	   * @return
	   */
	  
	  public Date getfecha() {
		   return Fecha; 
	   }
	  
	  /**
	   * Creacion del metodo getTurno  para utilizar el metodo privado Turno
	   * @return
	   */
	  
	  public boolean getEstado() {
		   return estado; 
	   }
	  
	  /**
	   * Creacion del metodo getPersona  para utilizar el metodo privado Persona
	   * @return
	   */
	
	  
	  public void setTitulo(String titulo) { 
			this.titulo = titulo;          
	   }	  
	  
	  /**
	   * Creacion del metodo setNoTurno  para modificar el metodo privado NoTurno
	   * @return
	   */
	  
	  public void setFecha(Date Fecha) { 
			this.Fecha = Fecha;          
	   }
	  
	  /**
	   * Creacion del metodo setTurno  para modificar el metodo privado Turno
	   * @return
	   */
	  
	  public void setEstado(boolean Estado) { 
			this.estado = Estado;          
	   }
}
	 
	
