/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanthread;

/**
 *
 * @author HP
 */
public class threadA implements Runnable{
    @Override public void run() { 
        for (int i=0; i<=100;i++){ 
            System.out.println("Thread A: "+ i ); 
        } 
    }
    
}
