package entities;

public class Gerente extends Funcionario{

	@Override
	public void bonificacao(double salario) {
		super.bonificacao(salario + 500);
		salario = salario + 500;
		System.out.println("Sal�rio com bonifica��o: "+salario);
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}
	
	
	

}
