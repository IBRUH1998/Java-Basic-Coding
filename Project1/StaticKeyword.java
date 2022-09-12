
package Project1;

public class StaticKeyword {
    
    String name ;
    int id ;
    static String university = "LU" ;
    
    StaticKeyword(String n,int i){
        name = n ;
        id = i ;
    }
    
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University : "+university);
    }
    
}
