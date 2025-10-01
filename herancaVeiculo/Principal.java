package backend.aula10.herancaVeiculo;

public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro("Audi", "RS6", 2022, "Cinza", 4, "V8 Biturbo");
		System.out.println("Carro: ");
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Número de portas: " + carro.getNumeroPortas());
		System.out.println("Motor: " + carro.getMotor());
		
		Moto moto = new Moto("Harley-Davidson", "Fat Boy", 2018, "Preta", 1690);
		System.out.println("\nMoto:");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada() + "cc");

	}

}
