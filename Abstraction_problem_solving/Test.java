
package Abstraction_problem_solving;


public class Test  {
    public static void main(String[] args) {
        Shape Shape ;
        Shape = new Rectangle(20,30);
        Shape.area() ;
                
        Shape = new Triangle(20,30);
        Shape.area();
        
        Shape = new Circle(12);
        Shape.area();
    }
    
}
