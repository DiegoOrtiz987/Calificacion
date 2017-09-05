
/**
 * -------------------------
 * Fecha: 4/09/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package calificaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;


public class ObjetoRobot {
    
    public boolean pedirNuevamente=true; 
	
	public int Leer ()
	{
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
			if (valorConvertido<=0) {
				System.out.println("	MENSAJE: El numero ingresado debe ser mayor a Cero(0).");
				System.out.println("                 *****************************         \n");
				pedirNuevamente = !pedirNuevamente;
			}
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	
	public int Leer2 ()
	{
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero Entero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	

	public float Leer3 ()
	{
		String  valorObtenido;
		float valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Float.parseFloat(valorObtenido);
			pedirNuevamente= false; 
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	
	

	// Leer Texto
	public String Leer4 ()
	{
		String  valorObtenido="";
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			
			pedirNuevamente= false; 
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}	
		return valorObtenido;
	}
    
    
    
    
    public double leer5 (String alumno){
		
		String valorObtenidoDelTeclado = "";
		double valorRetornado = 0;
                boolean val =false;
                
                do{
		try{
                        val =false;
			/*//Este objeto es para inicializar el teclado del sistema
			InputStreamReader io = new InputStreamReader(System.in);
			
			//Este objeto me permitira obtener los valores ingresados desde el teclado
			BufferedReader buffer = new BufferedReader(io);*/
			
			valorObtenidoDelTeclado = (JOptionPane.showInputDialog(null," Digite la nota del/a alumno/a " + alumno));
			valorRetornado = Double.parseDouble(valorObtenidoDelTeclado);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"Ingreso un valor incorrecto" );
                        val=true;
			
		}
                }while (val);
         // TODO: handle exception
		
		return valorRetornado;    
    
}

}




