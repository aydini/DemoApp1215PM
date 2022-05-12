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

    public static void main(String[] args) {
        System.out.println("This is a two player computer game, creating players....");
        Player p1 = new Player("Aliza", 0);
        Player p2 = new Player("Stravinsky", 0);
        System.out.println("Created players...");
        System.out.println(p1);
        System.out.println(p2);
    }
}
