/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan Afifah
 **/
        
import java.util.Scanner;   

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    // User Input Dynamic
    System.out.println("Enter the amount number you want to check: ");
    int amount = sc.nextInt();

    for(int i = 0; i < amount; i++){
      try {
        long input = sc.nextLong();
        System.out.println(input + "can be fitted in:");
        if(input >=-128 && input <=127)
          System.out.println("* byte");
        if(input >=-32768 && input <=32767)
          System.out.println("* short");
        if(input >=-2147483648 && input <= 2147483647)
          System.out.println("* int");
        if(input >=-9223372036854775808L && input <= 9223372036854775807L)
          System.out.println("* long");
      } catch (Exception e) {
      
        System.out.println(sc.next()+" can't be fitted anywhere.");
      }
    }
  }
}
    
