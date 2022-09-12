
package project2;

// in this program i will show static method and discussion about restriction  (1) out of 2 .
// in this restriction : A static method can't access non static method but non static can access static method ,variable.
public class StaticFunction {
    void display1() { // non static function 
        display2() ; // 
    System.out.println("Iam Non static function") ;
    } 
    
    static void display2(){ // static function 
       
        System.out.println("Iam Static function") ;
    }
            
}
