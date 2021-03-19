package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(22, 33);
		conta.deposita(333.0);

		Conta conta2 = new ContaPoupanca(22, 44);
		conta2.deposita(444.0);

		Conta conta3 = new ContaCorrente(22, 11);
		conta3.deposita(111.0);

		Conta conta4 = new ContaPoupanca(22, 22);
		conta4.deposita(222.0);
		
		
		List<Conta> lista = new ArrayList<>();
		lista.add(conta);
		lista.add(conta2);
		lista.add(conta3);
		lista.add(conta4);	
		
		for(Conta c : lista) {
			System.out.println(c);
		}
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(comparator);
		
		
		System.out.println("===================");
		for(Conta c:lista) {
			System.out.println(c);
		}
		

	}
}
	 class NumeroDaContaComparator implements Comparator<Conta>{
		
		@Override
		public int compare(Conta conta1, Conta conta2) {
			//retorna 0 para numeros iguais -1 negativo +1 positivo
			return Integer.compare(conta1.getNumero(), conta2.getNumero());
			
		}
	}


