/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhadling;

import java.util.Scanner;

/**
 *
 * @author Harsimran singh
 */
 public class ExceptionHadling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        // TODO code application logic here
        
            Scanner a= new Scanner(System.in);
            
            try
            {
                
                a.nextInt();
                
                
                
            }
            
            catch(ArithmeticException e)
            {
                
            }
            catch(Exception e)
            {
                System.out.println("HELLO");
            }
            
        
        
        
        
    }
    
}
