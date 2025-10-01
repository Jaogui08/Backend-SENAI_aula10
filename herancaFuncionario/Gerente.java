package backend.aula10.herancaFuncionario;

public class Gerente extends Funcionario {
	private String beneficios;
	private double premiacao;

	public Gerente(String nome, String cpf, String cargo, String departamento, double salario,
			String beneficios, double premiacao) {
		super(nome, cpf, cargo, departamento, salario);
		this.beneficios = beneficios;
		this.premiacao = premiacao;
	}
	
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
	public double getPremiacao() {
		return premiacao;
	}
	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}
}