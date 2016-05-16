/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihilo1;

/*
        la  planificación  de  los hilos se realiza en base a la prioridad 
        relativa de un hilo frente a las prioridades de otros. 
        
        La prioridad de un hilo es un valor entero (cuanto mayor es el número, 
        mayor es la prioridad), que puede asignarse con el método setPriority()
        
        PSVM{
          t.setPriority(1);
           t.setPriority(MIN_PRIORITY);
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        }
        */
public class Hilos {
    public static void main(String[] args) {
        MiHilo1 h1 =new MiHilo1();
        //dar nombre por hilo
        h1.setName("Hilo1");
        
        MiHilo1 h2 =new MiHilo1();
        //dar nombre por hilo
        h2.setName("Hilo2");
        
        MiHilo1 h3 =new MiHilo1();
        //dar nombre por hilo
        h3.setName("Hilo3");
        
        
        
        h1.setPriority(1);
        h2.setPriority(3);
        h3.setPriority(5);
        
        h1.start();
        h2.start();
        h3.start();
    }
            
    
}
