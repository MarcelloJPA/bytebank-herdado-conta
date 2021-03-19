package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
			
		
			Integer idadeRef = Integer.valueOf(29); //Primitivo para Objeto referencia -> AutoBoxing
			System.out.println(idadeRef.intValue());//Objeto referencia para primitivo -> Unboxing
			
			Double dRef = Double.valueOf(23.98);  	//AutoBoxing
			System.out.println(dRef.doubleValue()); //Unboxing
			
			Boolean bRef = Boolean.FALSE;
			System.out.println(bRef.booleanValue());
			
			
			
			/*Number é a classe mãe de Integer, Double, Float, Long, Short, Byte */
			Number refNumero = Integer.valueOf(29);
			System.out.println(refNumero.doubleValue());
			
			/*Uma lista que armazena qualquer tipo de Number(Integer, Float, Long, Short, Byte)*/
			
			List<Number> qualquerNumero = new ArrayList<Number>();
			
			qualquerNumero.add(10);
			qualquerNumero.add(322.50);
			qualquerNumero.add(888888);
			
			int i = 0;
			
			for(Number n : qualquerNumero) {
				System.out.println("Item "+i++ + " "+ n);
			}
	}

}
