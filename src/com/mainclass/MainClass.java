package com.mainclass;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class MainClass {
	
	public static void main(String[] args) {
		
		Cat a1 = new Cat("Whyskas");
		Dog a2 = new Dog("Doky");
		a1.setSound("meow");
		a2.setSound("barf");
		System.out.println(a1.getSound());
		System.out.println(a2.getSound());
		
		System.out.println(a2.getDogOwner("Rufo"));
		System.out.println(a1.getOwner("Rufo 2"));
		
		//interfaces
		Ostrich a3 = new Ostrich("Rakan");
		a3.setName("I am a big bird");
		a3.setWingsNumber(2);
		System.out.println(a3.toString());
	}

}
