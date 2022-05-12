/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aydin.demoapp1215pm;

/**
 *
 * @author Ilknur AYDIN
 */
public class DemoApp1215PM {
    public static void methodC(){
        int methodCVar = 888;
        System.out.println("methodCVar is "  + methodCVar);
        
    }

    public static void methodB(){
        int methodBVar = 999;
        System.out.println("methodBVar is "  + methodBVar);
        methodC(); // calling methodC
        
    }
      
    public static void methodA(int paramA){
        methodB();
        int localA = 99;
        System.out.println("paramA: " + paramA );
        paramA = 88;
        System.out.println("again paramA: " + paramA );
    }
 
    public static void main(String[] args) {
        int mainVarA = 55;
        System.out.println("mainVarA " + mainVarA);
        methodA(mainVarA);
        System.out.println("again mainVarA " + mainVarA);
        
        
        // demo about local and block variables scope
        /////////////////////////////////////
        /*int a;
        a = 88;
        System.out.println("a is " + a);
        
        if (true){
            int  b = 99;
            System.out.println("b is " + b);
        }
        //System.out.println("a is " + a + "b is " + b);
        */
        
        // demo abbout creating objects from classes
        /////////////////////////////////////
        /*System.out.println("This is a two player computer game, creating players....");
        Player p1 = new Player("Aliza", 0);
        Player p2 = new Player("Stravinsky", 0);
        System.out.println("Created players...");
        System.out.println(p1);
        System.out.println(p2);*/
    }
    
   
}
