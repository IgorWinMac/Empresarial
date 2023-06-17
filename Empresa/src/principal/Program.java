package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		Gerente gerente = new Gerente();
		
		Secretaria secretaria = new Secretaria();
		
		String opcao = "0";
		
		do {
			System.out.println("Escolha uma das opções abaixo");
			System.out.println("1 - Gerente");
			System.out.println("2 - Secretária");
			System.out.println("3 - Sair");
			opcao = sc.nextLine();
		}while(opcao == "3");
		
		switch(opcao){
		case "1":
			System.out.println("Informe o seu  nome: ");
			String nome = sc.nextLine();
			gerente.setNome(nome);
			
			System.out.println("Informe a sua idade: ");
			int idade = sc.nextInt();
			gerente.setIdade(idade);
			
			sc.nextLine();
			
			System.out.println("Informe o sexo: ");
			String sexo = sc.nextLine();
			gerente.setSexo(sexo);
			
			System.out.println("Informe o seu departamento: ");
			String departamento = sc.nextLine();
			gerente.setDepartamento(departamento);
			
			System.out.println("Informe o seu salário: ");
			double salario = sc.nextDouble();
			gerente.bonificacao(salario);
			funcionario.pularLinha();
			System.out.println(gerente);
			break;
		case "2":
			System.out.println("Informe o seu  nome: ");
			nome = sc.nextLine();
			secretaria.setNome(nome);
			
			System.out.println("Informe a sua idade: ");
			idade = sc.nextInt();
			secretaria.setIdade(idade);
			
			sc.nextLine();
			
			System.out.println("Informe o sexo: ");
			sexo = sc.nextLine();
			secretaria.setSexo(sexo);
			
			System.out.println("Informe o seu departamento: ");
			departamento = sc.nextLine();
			secretaria.setDepartamento(departamento);
			
			System.out.println("Informe o seu salário: ");
			salario = sc.nextDouble();
			secretaria.bonificacao(salario);
			funcionario.pularLinha();
			System.out.println(secretaria);
			break;
		case "3":
			System.out.println("Você saiu com sucesso!");
			break;
			default:
				System.out.println("Dígito inválido!");
		}	
	}

}
