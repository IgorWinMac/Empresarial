package entities;

public class Secretaria extends Funcionario{

	@Override
	public void bonificacao(double salario) {
		super.bonificacao(salario + 150);
		salario = salario + 150;
		System.out.println("Sal�rio com bonifica��o: "+salario);
	}

	@Override
	public String toString() {
		return "Secretaria [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}
	
	
	
}
