package com.enums;

public enum Browsers {
	CHROME("Chrome"), FIREFOX("Firefox"), SAFARI("Safari"), 
	EDGE("Edge"), IE("IE");
	
	String value;
	
	Browsers(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
