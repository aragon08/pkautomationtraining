package com.mainclass;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class Arrays {

	public static void main(String[] args) {
		Ostrich o = new Ostrich("Rocky");
		Ostrich o2 = new Ostrich("Aunt");
		Ostrich o3 = new Ostrich("Mother");
		Ostrich o4 = new Ostrich("Father");
		
		Dog doggy = new Dog("Docky");
		Cat catty = new Cat("cute");
		
		Ostrich [] arreglo = new Ostrich[4];
		
		Animal [] listaAnimales = new Animal[6];
		
//		arreglo[0] = o;
//		arreglo[1] = o2;
//		arreglo[2] = o3;
//		arreglo[3] = o4;
		
//		for (int i = 0; i < arreglo.length; i++) {
//			System.out.println("El avestruz dentro de la posicion "+i+" es: "+arreglo[i].getName());
//		}
//		
//		for (Ostrich ostrich : arreglo) {
//			System.out.println("El avestruz dentro de la posicion  es: "+ostrich.getName());
//		}
		
		listaAnimales[0]= o;
		listaAnimales[1]= o2;
		listaAnimales[2]= o3;
		listaAnimales[3]= o4;
		listaAnimales[4]= doggy;
		listaAnimales[5]= catty;
		
		for (Animal animal : listaAnimales) {
			System.out.println("El animal es: "+ animal.getName());
		}

	}

}

