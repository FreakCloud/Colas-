
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Provar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int eleccion = 1;
        Colas<String> cola = new Colas<>();
        
        while(eleccion != 0){
            do{
                eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer? "+"\n"+"0-Salir\n"+"1-enqueue\n"+"2-isEmpty\n"+"3-lenght\n"+"4-dequeue\n"+"5- Imprimir cola"));
            } while ((eleccion !=0)&&(eleccion !=1)&&(eleccion !=2)&&(eleccion !=3)&&(eleccion!=4)&&(eleccion!=5));
            switch(eleccion){
                case 0: System.out.println("Gracias por usar el programa colas!");
                    break;
                case 1: String x; x = JOptionPane.showInputDialog("¿Qué persona llego a la cola?");
                      cola.enqueue(x);System.out.println(cola.toString()+"\n"); break; 
                case 2: System.out.println("¿La cola esta vacia?: " + cola.isEmpty()); break;
                case 3:  System.out.println("Tamanio de la cola: " + cola.lenght()); break; 
                case 4:  cola.dequeue(); System.out.println(cola.toString()); break;
                case 5: System.out.println(cola.toString()); break;
            }
        }
        
    }
    
}
