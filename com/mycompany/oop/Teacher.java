
package com.mycompany.oop;


public class Teacher {
    String name,gender ;
    int number,id;
    
    // construction 
    Teacher(String n,String g,int p,int d){
    name = n ;
    gender = g ;
    number = p ;
    id = d ;
  
    }
    
     void displayinformation(){
         System.out.println("Name: "+name);
         System.out.println("Gender:"+gender);
         System.out.println("Phone:"+number);
         System.out.println("ID: "+id);
         
     }
}
