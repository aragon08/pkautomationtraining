package com.enums;


public enum Days {
	

	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
	
	int day;
	
	Days(int day){
		this.day = day;
	}
	//TODO: 05.- Create a getValue method to get the int for every enum. (this returns day value).
	public int getValue() {
		return day;
	}
}
