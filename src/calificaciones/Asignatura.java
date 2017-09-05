
/**
 * -------------------------
 * Fecha: 4/09/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package calificaciones;


public class Asignatura {

    private String nombreAsignatura="";
    private int codigoAsignatura=0;
    private int nota=0;

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
   
}




