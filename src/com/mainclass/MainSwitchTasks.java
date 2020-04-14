package com.mainclass;

import java.util.Scanner;

import com.animals.Ostrich;
import com.enums.Days;

public class MainSwitchTasks {
	
	
	public static void main(String[] args) {
		
		Ostrich o = new Ostrich("Rocky");
		
		o.setDayToEat(Days.JUEVES);
		
		Scanner scan = new Scanner(System.in);
		
		boolean control = true;
		
		do {
			System.out.println("ingresa el dia");
			Days day = null;
			Days dayYoEat = o.getDayToEat();
			try {
				//Ejecuta algun codigo que pueda retornar o generar alguna excepcion
				day = Days.valueOf(scan.nextLine());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			if(day.equals(dayYoEat)) {
				System.out.println("si, como el "+ day.name());
				control = false;
			}else {
				System.out.println("no, intentalo otra vez");
			}
		}while(control);
	}

}
