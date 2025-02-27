package service;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {	
	
	@Override
	public boolean add(Integer numero) {
		if(!contains(numero)) {
			return super.add(numero);	
		}
		else {
			return false;
		}
	}	
	
	public int sum() {
		int suma = 0;		
		for(int n:this) {
			suma += n;
		}		
		return suma;		
	}
	
	public double average() {
		int media = 0;		
		for(int n:this) {
			media += n;
		}		
		return media/this.size();		
	}	
}
