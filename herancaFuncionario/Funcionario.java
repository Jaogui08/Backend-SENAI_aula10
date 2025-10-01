package backend.aula10.herancaFuncionario;

public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private String departamento;
	private double salario;
	
	public Funcionario(String nome, String cpf, String cargo, String departamento, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
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
}
