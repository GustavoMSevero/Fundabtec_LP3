package ead.fundatec.org.br.lp3.exec;

import java.util.Scanner;

import ead.fundatec.org.br.lp3.TelaA;
import ead.fundatec.org.br.lp3.TelaB;

public class ExecutaTela {

	public static void main(String[] args) {
		int i = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma tela: (1 - tela A / 2- tela B)");
		i = ler.nextInt();
		
		if(i == 1){
			TelaA ta = new TelaA();
			ta.mostraTela("A");
		}else if(i == 2){
			TelaB tb = new TelaB();
			tb.mostraTela("B");
		}else{
			System.out.println("Opção inexistente");
		}

	}

}
