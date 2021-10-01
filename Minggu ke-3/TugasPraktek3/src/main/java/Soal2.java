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
        
public class Soal2 {
    public static void main(String[] args){
    	Scanner userinput = new Scanner(System.in);
        String[] kata;
        short[] angka;
	kata = new String[3];
	angka = new short[3];
	Scanner userinput2 = new Scanner(System.in);
	kata[0] = userinput2.next();
	angka[0] = userinput2.nextShort();
	kata[1] = userinput2.next();
	angka[1] = userinput2.nextShort();
	kata[2] = userinput2.next();
	angka[2] = userinput2.nextShort();
	userinput2.close();
        System.out.println("================================");
        int i;
		for(i=0;i<=2; i++) {
			
			System.out.printf("%-15s%03d\n", kata[i], angka[i]);
		}
        System.out.println("================================");            
    }    
}
    
