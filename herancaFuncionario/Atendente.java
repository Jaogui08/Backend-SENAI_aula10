package backend.aula10.herancaFuncionario;

public class Atendente extends Funcionario{
	private double ajudaCusto;
	
	public Atendente(String nome, String cpf, String cargo, String departamento, double salario,
			double ajudaCusto) {
		super(nome, cpf, cargo, departamento, salario);
		this.ajudaCusto = ajudaCusto;
	}
	
	public double getAjudaCusto() {
		return ajudaCusto;
	}
	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
}
