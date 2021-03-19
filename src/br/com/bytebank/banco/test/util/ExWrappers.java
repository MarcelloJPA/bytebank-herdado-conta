package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class ExWrappers {

	public static void main(String[] args) {
		
		/*Objeto tipo Integer*/
		Integer idadeRef = 29;
		
		/*Objeto para primitivo Unboxing*/
		int primitivo = new Integer(21);
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(idadeRef);
		lista.add(primitivo); /*AutoBoxing primitivo para Objeto*/
		
		int i1 = lista.get(0); 	   /*Unboxing*/
		Integer i2 = lista.get(1);/*OK, ja é um objeto*/
		
		System.out.println(i1);
		System.out.println(i2);

	}

}
