/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioridadoperadoresjava;

/**
 *
 * @author Walter Galdamez
 */
public class PrioridadOperadoresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Presedencia de Operadores");
        int x=5;
        int y=10;
        int z= ++x * y--;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

        System.out.println("\nEjemplo Evaluacion");
        System.out.println(4+5*6/3);
        System.out.println((4+5)*(6/3));

        System.out.println("\nOtro Ejemplo de Evaluacion");
        System.out.println(1+2-3*4/5);
        System.out.println(1+2-(3*(4/5)));

        System.out.println("\nOtro Ejemplo");
        //Si detecta una cadena lo demas se convierte en cadena
        System.out.println("1+2= "+1+2);
        //Los parentecis rompen esta regla ya que tienen mayor prioridad
        System.out.println("1+2= "+(1+2));

        System.out.println("\nOtro Ejemplo");
        //El operador + es asociativo a la izquierda
        System.out.println(1+2+"abc");//Detecta una operacion primero
        System.out.println("abc"+1+2);//Detecta una cadena primero
    }
    
}
