package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		/*Tipo primitivo -> 29 fazendo um autoboxing para tipo referencia -> Integer idadeRef{value:29} [autoboxing]*/
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		/*Tipo referencia ->idadeRef{ value:29 } fazendo um unboxing para tipo primitivo -> int 29 [unboxing] */
		int valor = idadeRef.intValue(); //unboxing
		String s = args[0];//"10"
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
	}

}
