/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Asignatura materia = new Asignatura();
        ObjetoRobot robot = new ObjetoRobot();
        
        String [] alumnos;
        double [] notas;
        double suma=0,media=0;
        int cantAlumnos=0;
        
        materia.setNombreAsignatura(robot.Leer("Digite el nombre de la asignatura: "));
        cantAlumnos=robot.Leer2("Digite la cantidad de alumnos a calificar: ");
        
        alumnos= new String [cantAlumnos]; 
        notas= new double [cantAlumnos]; 
        
        for (int i = 0; i < cantAlumnos; i++) {        
 
            alumnos [i]= robot.Leer(" Digite el nombre del alumno No " + (i+1)+ ":");
            notas [i]= robot.leer5(alumnos [i]);  
            suma+=notas[i];
        }
        
        media=materia.obtenerMedia(suma, cantAlumnos);
        
        JOptionPane.showMessageDialog(null," La media de la asignatura de " + materia.getNombreAsignatura() + " es de: " + media);
        JOptionPane.showMessageDialog(null," Los/as siguientes alumnos/as tienen notas superiores a la media");
           
        for (int a = 0; a < cantAlumnos; a++) {
            
            if (notas[a]>media)
 
            JOptionPane.showMessageDialog(null, "Alumno/a " + alumnos [a] + " con una nota de " + notas [a]);
        }
       
        JOptionPane.showMessageDialog (null,"Fin del listado");
    }
    
}
