package enttities;

public class Funcionarios {
	
	int id;
	String nome;
	double salario;
	
	public Funcionarios(int id, String nome, double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
     public double calcula(double percent) {
		
		percent = percent / 100.0;
		salario += salario * percent;
		return salario;		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [id: " + id + ", nome: " + nome + ", salario: " + salario + "]";
	}
	
	
	
	
	

}
