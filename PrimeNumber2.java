/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user2
 */
public class PrimeNumber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread P = new Thread(new Prime());
        P.start();
    }
    
}
//Using runnable method to define the prime number
class Prime implements Runnable{

    @Override
    public void run() {
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Prime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
