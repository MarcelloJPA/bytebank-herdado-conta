package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

        public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 11);
      
        lista.add(cc);
        
        //O m�todo contains verifica se cont�m cc2 na lista R:false, a referencia cc2 realmente n�o est� na lista, 
        //por�m o numero da conta � o mesmo que cc, isso acontece porque o contains utiliza o equals, e ele compara as referencias 
        //e n�o as propriedades devemos implementar nossa regra de negocio. Implementando um sobrescrita de equals na classe Conta
        boolean existe = lista.contains(cc2); 
      
        System.out.println(existe);
        
        
                 
        
         for(Conta conta : lista) {
                System.out.println(conta);
         
        }
    }
}