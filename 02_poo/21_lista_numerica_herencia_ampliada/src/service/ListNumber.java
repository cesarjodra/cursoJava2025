package service;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
	
	public void eliminarDatos(Predicate<Integer> cond) {
		for(Integer n:this) {
			if(cond.test(n)) {
				remove(n);
			}
		}
	}
	
	public void procesaDatos(Consumer<Integer> op) {
		for(Integer n:this) {			
			op.accept(n);			
		}
	}
}
