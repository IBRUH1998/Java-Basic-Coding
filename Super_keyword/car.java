
package Super_keyword;

public class car extends Vehicle {
    int gear ;
    
    car(String c,double w,int g){
        super(c,w) ;
        gear = g ;
    }
    @Override
    void displayFunction(){
        super.displayFunction();
        System.out.println("Gear : "+gear);
        
    }
    
}
