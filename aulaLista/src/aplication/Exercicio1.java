package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enttities.Funcionarios;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Informe a quantidade de funcionarios que deseja cadastrar: ");
		int quant = sc.nextInt();
		
		List<Funcionarios> func = new ArrayList<>();
		
		for (int x = 0; x < quant; x++) {
		
		System.out.println("Funcionario " + (x + 1) + ":");
		System.out.println("informe o id do funcionario: ");
		int id = sc.nextInt();
		System.out.println("informe o nome do funcionario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Informe o salario do funcionario: ");
		Double salario = sc.nextDouble();		
		func.add(new Funcionarios(id, nome, salario));
		System.out.println(func);
		}
		
		System.out.println("Informe o id do funcionarios que receber� aumento: ");
		int id = sc.nextInt();
		
		Funcionarios funcionarios = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (funcionarios == null) {
			
			System.out.println("Funcionario n�o existe!");
			 
		}else {
			System.out.println("Informe a porcentagem de aumento de sal�rio: ");
			double percent = sc.nextDouble();
			funcionarios.calcula(percent);
			
		}
		 
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for (Funcionarios obj: func) {
			System.out.println(obj);
		}
		
		
		
		
		sc.close();

	}

}
