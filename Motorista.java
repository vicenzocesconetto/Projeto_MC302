import java.util.ArrayList;

public class Motorista extends Cliente {
	private ArrayList<Veiculo> veiculos;

	
	public Motorista(String nome, String telefone, String email, Endereco endereco, Veiculo veiculo, int km) {
		super(nome, telefone, email, endereco);
		this.veiculos = new ArrayList<Veiculo>();
		this.veiculos.add(veiculo);	
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}	
	
	public void addVeiculo (Veiculo novo) {
		this.veiculos.add(novo);
	}
}