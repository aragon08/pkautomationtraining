package com.mainclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class Lists {

	public static void main(String[] args) {
		
//		List <Object> lista = new ArrayList<>();
//		
//		lista.add("primer elemento");
//		lista.add(100);
//		lista.add('c');
//		lista.add(2.43);
		
//		List <String> lista2 = new ArrayList<>();
//		
//		lista2.add("String");
////		lista2.add(2);
//		
//		List <Animal> listaAnimales = new ArrayList<Animal>();
//		
//		Ostrich avestruz1 = new Ostrich("Rocky");
//		listaAnimales.add(avestruz1);
		
		Ostrich avestruz = new Ostrich("Rocky");
		Dog perro = new Dog("Dog");
		Cat gato = new Cat("Cat");
		
		List <Animal> lista = new ArrayList<Animal>();
		
		lista.add(avestruz);
		lista.add(perro);
		lista.add(gato);
		
		Scanner scan = new Scanner(System.in);
		boolean controlador = true;
		
//		do {
//			System.out.println("Estos son los animales actuales: ");
//			System.out.println(getNamesInList(lista));
//		}while(controlador);
		
		do {
			System.out.println("Estos son los animales actuales: ");
			System.out.println(getNamesInList(lista));
			System.out.println("¿Qué acción quieres hacer? "
					+ "1.- Agregar animal"
					+ "2.- Eliminar animal"
					+ "3.- Salir del Ciclo");
			
			int opcion;
			try {

				opcion = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				continue;
			}
			
			switch (opcion) {
			case 1:
				System.out.println("¿Qué tipo de animal quieres agregar? "
						+ "1.- Avestruz"
						+ "2.- Perro"
						+ "3.- Gato"
						+ "4.- Cancelar");
				int opcion2;
				try {
					opcion2 = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					continue;
				}
				
				switch (opcion2) {
				case 1:
					System.out.println("Ingrese el nombre del Avestruz");
					Ostrich o = new Ostrich(scan.nextLine());
					lista.add(o);					
					break;
				case 2:
					System.out.println("Ingrese el nombre del Perro");
					Dog dog = new Dog(scan.nextLine());
					lista.add(dog);					
					break;
				case 3:
					System.out.println("Ingrese el nombre del Perro");
					Cat cat = new Cat(scan.nextLine());
					lista.add(cat);					
					break;
				case 4:
					continue;				
				default:
					break;
				}
				
				
				break;
			case 2:
				System.out.println("ingrese el nombre del o la posicion del animal a eliminar");
				String eliminar = scan.nextLine();
				int integerToDelete = 0;
				boolean isString = true;
				try {
					integerToDelete = Integer.parseInt(eliminar);
					isString = false;
				} catch (NumberFormatException e) {
					
				}		
				boolean isInTheList = false;
				
				if (isString) {
					int index;
					for (index = 0; index < lista.size(); index++) {
						if (lista.get(index).getName().equals(eliminar)) {
							isInTheList = true;
							break;
						}
					}
					if (isInTheList) {
						lista.remove(index);
					}else {
						System.out.println("Ese nombre no existe");
					}
					
				}else {
					try {
						lista.remove(integerToDelete);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				break;

			case 3:
				controlador = false;
				break;

			default:
				break;
			}
			
			
		}while(controlador);
			
		
//		System.out.println("********************************************");
//		
//		for (Object objetos : lista) {
//			System.out.println(objetos);
//		}
//		
//		System.out.println("********************************************");
//		
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
//		
//		System.out.println("********************************************");
//		
//		Iterator<Object> iterator = lista.iterator();
//		
//		while(iterator.hasNext()) {
//			Object actualObject = iterator.next();
//			System.out.println(actualObject);
//		}
		
		

	}
	public static String getNamesInList(List<Animal> lista) {
		String retorno = "";
		
		for (int i = 0; i < lista.size(); i++) {
			retorno = retorno + lista.get(i).getName() + " Index: ["+ i +"] + Class: " + lista.get(i).getClass() + "\n";
			}
		return retorno;
	}

}
