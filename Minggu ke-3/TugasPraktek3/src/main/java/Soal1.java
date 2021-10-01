/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan Afifah
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Soal1 {
    public static void main(String args[])
    {
        String A;
        Scanner userinput = new Scanner(System.in);
        
        A = userinput.nextLine();
        /* StringTokenizer object */  
        StringTokenizer st = new StringTokenizer(A," !,?._'@");
        /* Prints the number of tokens present in the String */  
        System.out.println("Total number of Tokens: "+st.countTokens()); 
        /* Checks if the String has any more tokens */  
        while (st.hasMoreTokens()) {    
            /* Prints the elements from the String */  
            System.out.println(st.nextElement());  
        }    
    
    }
}
