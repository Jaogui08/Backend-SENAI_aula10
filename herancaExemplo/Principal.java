package backend.aula10.herancaExemplo;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João Sales", "(15)99999-9999");
		System.out.println("Pessoa:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("João Sales", "(15)99999-9999", "123.456.789-08", "12.345.678-9");
		System.out.println("\nPessoa Física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(15)98989-8888", "12.345.678/0001-25");
		System.out.println("\nPessoa Jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
	}

}
