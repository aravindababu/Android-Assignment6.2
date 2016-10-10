/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user2
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //A number which is devisible by 1 or itself is called a Prime Number
        
        Thread P = new Thread(new Prime());
        P.start();
    }
}

//class Prime number Extending Thread class
class Prime extends Thread{
    
    //implementing run() method which is obtained from Thread
    
    public void run(){
       
        
        //Prime number
        for(int i=2;i<=100;i++){
            
            for(int j=2;j<=i;j++){
                //when i==j we can call it as a Prime number
                if(i==j){
                    System.out.println(i);//Printing out the value of i
                }
                if(i%j==0){
                    break;  
                }
            }
   
        }
        //Slleping the Thread for 2000milliseconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Prime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}