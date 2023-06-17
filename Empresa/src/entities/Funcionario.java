package entities;

public class Funcionario {
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected String departamento;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void pularLinha() {
		System.out.println();
	}
	
	public void bonificacao(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}
}
