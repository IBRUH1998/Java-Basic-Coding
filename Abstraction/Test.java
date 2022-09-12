
package Abstraction;


public class Test {
    public static void main(String[] args) {  
    
        // in this abstract class you can never write any object .but you can write reference variable replace to object over the code.
    
        MobileUser mu ; // referance variable 
 
    mu = new Abdul_Karim();
    mu.call();
    mu.SendMessage();
    
    mu = new Abul_Kaseam();
    mu.SendMessage();
    
    }
    
    
    
}
