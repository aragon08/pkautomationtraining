package com.mainclass;

import java.util.Scanner;

import com.enums.Browsers;

/**
 * @author Carlos Aragon
 *
 */
public class MainSwitchVIf {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		boolean cont = true;
		
//		if(value.equals("Chrome")) {
//			System.out.println("El browser es chrome");
//		}else if(value.equals("Firefox")){
//			System.out.println("El browser elegido es firefoxf");
//		}
		
//		switch(<objeto>) {
//		case <objetotipo1>: Sentencias1;
//		break;
//		case <objetotipo2>: Sentencias2;
//		break;
//		default: sentencia por default;
//		break;
//		}
//		do {
//			System.out.println("ingresar el valor del browser: ");
//			String value  = in.nextLine();
//			switch (value) {
//			case "Chrome":
//				System.out.println("El browser es chrome");
//				break;
//			case "Firefox":
//				System.out.println("El browser es firefox");
//				break;
//
//			default:
//				cont = false;
//				System.out.println("No existe el browser");
//				break;
//			}
//			
//		}while(cont);
//		System.out.println(Browsers.CHROME);
		
		String value2 = Browsers.CHROME.toString();
		System.out.println(value2);
		
		
			}

}
