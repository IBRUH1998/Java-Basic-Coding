
package com.mycompany.oop;


public class function_Overloading {
        
        void add(int a,int b){
        System.out.println(a+b);
        }
        void add(double a,double b){
            System.out.println(a+b);
        }
        void add(int a,int b,int c){
            System.out.println(a+b+c);
        }
 
        public static void main(String[] args) {
             function_Overloading v1 = new function_Overloading() ;                          
              v1.add(10,20) ; 
        }
}
        
            
      
        
      