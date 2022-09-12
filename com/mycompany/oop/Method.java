
package com.mycompany.oop;


public class Method {
    public static void main(String[] args) {
        Teacher mentor1 = new Teacher();
        mentor1.name = "jubiden";
        mentor1.id = 90544 ;
        mentor1.number =848489984 ;
        mentor1.gender = "male" ;
        mentor1.displayinformation() ;
        
        System.out.println("Here is another mentor information");
        
         Teacher mentor2 = new Teacher();
        mentor2.name = "Fatima";
        mentor2.id = 544 ;
        mentor2.number =848489984 ;
        mentor2.gender = "Female" ;
        mentor2.displayinformation();
    }
    
}
