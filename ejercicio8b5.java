package daw1.comienzo;

import java.util.Scanner;

public class ejercicio8b5 {

	public static void main(String[] args) {
		  
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce altura:");
	    int n = sc.nextInt();
	    
	    System.out.println("Introduce carácter de relleno:");
	    String r = sc.next();
	    
	    for (int i = 1; i <= n; i++) {
	      for (int j = 1; j <= n-i; j++) { 
	            System.out.print(" ");
	          }  	
	      for (int k = 1; k <= (i*2)-1; k++) {
	    		  System.out.print(r);
	      }
	      System.out.println();
	    }
	  }
}
