package com.everis.funcional;

import java.util.Arrays;
import java.util.List;

public class Practica {
	
	public  static void main(String[] args) {
		List<String> colors = Arrays.asList("yellow","red","green");
		System.out.println("Has color red?: " + colors.stream().anyMatch(s -> s.equals("red")));
		
		
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		Long count =  numbers.stream().filter(s -> s>10).count();
		//System.out.println("Numeros mayores que 10:" + numbers.stream().filter(s -> s>10).count());
		System.out.println("Numeros mayores que 10 funcional: " + count);
		
		int contador = 0;
		for(int numeros : numbers) {
			if(numeros > 10) {
				contador++;
			}
		}
		System.out.println("Numeros mayores que 10 imperativa: " + contador);
	}

}
