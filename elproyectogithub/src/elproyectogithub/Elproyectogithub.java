/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elproyectogithub;

/**
 *
 * @author Iván Zarco Pareja
 */
public class Elproyectogithub {
String nombre = " ";
private int notadeseada = 0;
private int notareal = 0;

public static String veredicto(String valor1, String valor2) {
/*Según los valores introducidos, el programa nos devolverá un resultado*/
int notadeseada = 0;
int notareal= 0;

if (notadeseada == notareal){
            return "Perfecto. Has tenido buen criterio.";
        }
        if (notadeseada > notareal){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
            }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La calificación de " + args[0] + " : ");
        
    }
    
}
