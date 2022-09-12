
package Inheritance;


public class Inherited_person_class extends person {
    // by inherit we can access name,age from person class 
    
    String qualification ;
    
    void displayFunction2(){
        displayfunction1();
        System.out.println("Qualification :"+qualification);
    }
    
}
