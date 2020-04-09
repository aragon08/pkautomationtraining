package com.mainclass;

public class MainClassLoops {

	public static void main(String[] args) {
		/*
		 * While
		 * 
		 * Do - While
		 * 
		 * For
		 * 
		 * for mejorado
		 */
		
//		int count = 10;
//		int i = 0;
//		
//		boolean condition =  false;
		
//		while(i<=count) {
//			System.out.println("The value of letter i is: "+ i);
//			i++;
//		}
//		System.out.println("*******************************************************");
//		i = 0;
//		do {
//			System.out.println("The value of letter i is: "+ i);
//			i++;
//		}
//		while(i<= count);
		
//		while(condition) {
//			System.out.println("The value of letter i is: "+ i);
//			i++;
//		}
//		System.out.println("*******************************************************");
//		i = 0;
//		do {
//			System.out.println("The value of letter i is: "+ i);
//			i++;
//		}
//		while(condition);
		
//		System.out.println("*********************for******************************");
//		int increment = 0;
//		int increment2 = 0;
//		
//		for(int i = 0; i<=10; i++) {
////			increment++;
////			++increment2;
////			increment += 3;//incrment =  increment + 3;
////			increment2 =+ 3;
//			
////			System.out.println("The value of letter i is: "+ increment++);
////			System.out.println("The value for var 2 is: "+ ++increment2);
////			System.out.println("The value of letter i is: "+ increment--);
////			System.out.println("The value for var 2 is: "+ --increment2);
//			
//			System.out.println("The value of letter i is: "+ (increment += 3));
//			System.out.println("The value for var 2 is: "+ (increment2 =+ 3));
//		}
		
		String nombre = "Carlos Aragon";
		for(int i = 0; i< nombre.length(); i++) {
			System.out.println("La posicion de i = "+ i +"La letra en esta posición es "+ nombre.charAt(i));
		}
	}

}
