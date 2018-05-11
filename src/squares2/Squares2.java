/*
 * Seth James England
 * 08/05/18
 * squares2.Java
 * this is a program that displays the squared value of numbers all the way to 9
 */

package squares2;
import java.util.*;
/**
 * Seth James England
 */

public class Squares2 {
    public static void main(String[] args) {
         ArrayList <Integer> squaresSquared = new ArrayList();
      Collections.addAll(squaresSquared, 0, 1, 4, 16, 25, 36, 49, 64, 81);
      System.out.println("Squares \n************************\n");
      for (int i = 0; i < squaresSquared.size(); i++) {
        System.out.println ("Original Number:" + i);
        System.out.println ("Squared:" + squaresSquared.get(i));
    } 
    }
    
    
}
