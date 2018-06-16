import java.io.Serializable;

//import java.util.ArrayList;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private float valor;
	private int estoque;
	private int estoqueMinimo;
	private static int numeroProdutos = 0;
	//private ArrayList<Veiculo> modelosCompativeis;
	
	public Produto() {
		id = numeroProdutos++;
		//modelosCompativeis = new ArrayList<Veiculo>();
	}
	
	public Produto(int estoqueMinimo, int estoque, float valor, String nome) {
		this();
		this.estoqueMinimo = estoqueMinimo;
		this.estoque = estoque;
		this.valor = valor;
		this.nome = nome.toUpperCase();
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public static int getNumeroProdutos() {
		return numeroProdutos;
	}
	
	public static void setNumeroProdutos(int numeroProdutos) {
		Produto.numeroProdutos = numeroProdutos;
	}
	
	public boolean checarEstoqueMinimo() { // Retorna true se o estoqueAtual esta menor que o estoqueMinimo. False caso contrario
		if (estoque < estoqueMinimo) {
			return true;
		}
		return false;
	}
	
	public boolean checarEstoque(int q) {
		if(q<=this.estoque) return true;
		return false;
	}
	
	public void aumentarEstoque(int quantia) {
		estoque += quantia;
	}
	
	public boolean diminuirEstoque(int quantia) { // Retorna false se o estoque for menor que a quantia removida. Retorna true se houver diminuicao de estoque e avisa quando o estoque minimo eh atingido
		if (estoque >= quantia) {
			estoque -= quantia;
			return true;
		}
		return false;
	}
}
