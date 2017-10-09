package com.coderbd.specialjava.variablenmethod;

/**
 *
 * @author ANDROID
 */
public abstract class TestVariable {
    //Variable dcclaration
   
    private int x;
    private int y;
      //Variable dcclaration and initalization
    private static int z=10;
    private static int result=0;
   /**
     * Method
     * must have data type 
     * must have a name of method
     * must have terminal like ()
     * may have parameter 
     * method have also body but optional
     * if  type void , then no return
     */
    public static int calculate(){
    return z;
    }
    
    
      public static void calculate(int value){
          System.out.println(value);
    }
      
      
      public static int calculateSum(int s,int e){
          
          for(int i=s; i<=e; i++){
          result += i;
          }
          return result;

      }
      
     abstract void display();
      
    
    public static void main(String[] args) {
        System.out.println(""+calculate());
        calculate();
        int rs=calculateSum(1,10);
        System.out.println(""+rs);
    }
    
}
