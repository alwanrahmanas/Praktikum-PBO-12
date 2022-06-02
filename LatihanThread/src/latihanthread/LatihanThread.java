/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanthread;

/**
 *
 * @author HP
 */
public class LatihanThread { 
    /** * @param args the command line arguments */ 
    public static void main(String[] args) { 
// TODO code application logic here 
Thread t;
        t = new Thread(new Runnable (){
            @Override
            public void run(){
                for (int i=0; 100>=i;i++){
                    System.out.println("Thread t: "+ i );
                }
            } 
        });
t.start(); 

Thread t2 = new Thread(new threadA());
t2.start();

Thread t3 = new threadB(); 
t3.start();

for (int i=0; i<=100;i++){ 
    System.out.println("Main Thread: "+ i ); 
} 
    } 
}   
           
    
    

