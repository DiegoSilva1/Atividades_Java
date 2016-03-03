
public class Funcionario {

	
	private String CPF;
	private String nome;
	private Integer idade;
	private Double salario;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Funcionario(String CPF, String nome, Integer idade, Double salario){
		
			this.setCPF(CPF);
			this.setNome(nome);
			this.setIdade(idade);
			this.setSalario(salario);
	}
	
	
}
