package backend.aula10.herancaFuncionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Brian", "432.692.582-98", "Funcionario", "Principal", 2500);
		System.out.println("Funcionário:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		System.out.println("Salário: R$" + funcionario.getSalario());

		Atendente atendente = new Atendente("Zacky", "457.295.257-34", "Atendente", "Secundário", 3500, 2000);
		System.out.println("\nAtendente:");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF: " + atendente.getCpf());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Salário: R$" + atendente.getSalario());
		System.out.println("Ajuda de Custo: R$" + atendente.getAjudaCusto());

		Gerente gerente = new Gerente("Matthew", "287.429.296-32", "Gerente", "Principal", 6000,
				"Plano de saúde gratuito", 10000);
		System.out.println("\nGerente:");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Salário: R$" + gerente.getSalario());
		System.out.println("Benefícios: " + gerente.getBeneficios());
		System.out.println("Premiamção: R$" + gerente.getPremiacao());
	}

}
