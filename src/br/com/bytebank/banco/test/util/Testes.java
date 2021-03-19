package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Testes {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		/*Convertendo Tipo primitivo(29) para Referencia(Integer, Object)*/
		Integer idadeRef = Integer.valueOf(idade);
		
		/*Convertendo Objeto para tipo primitivo*/
		int valor = idadeRef.intValue();
		
		String s = args[0];
		Integer numero = Integer.valueOf(s);
		System.out.println(numero);
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		/*Como o add() adiciona um tipo primitivo se o Eclipse informa esperar uma tipo referencia(Object) ??? */
		/*Isso acontece pq o java converte o o int pelo Integer e da seu value como 29 (AutoBoxing) */
		numeros.add(idadeRef);
		
		
		
		

	}

}
