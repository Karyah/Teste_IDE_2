package br.com.dio;

import java.util.Scanner;
import br.com.dio.model.*;

public class Principal {
	
	public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("digite o seu nome:");
		func.nome = ent.next();
		System.out.println("seu nome:"+func.nome);
		
		System.out.println("digite o cpf:");
		func.cpf = ent.nextInt();
		System.out.println("seu cpf:" + func.cpf);

		
	}
	
}
