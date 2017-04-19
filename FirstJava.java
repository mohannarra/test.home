
package com.enums;

public enum Currency {
       PEENY(1),DICE(5),NICKLE(15),QUARTER(25);
	
	private int values;
	
	Currency(int values){
		this.values = values;
	}
       
	public int getValues(){
		return values;
	}
}
