
public class FuncionarioHorario extends Funcionario {
	

	private Double valor_hora;
	private Integer qtd_hora;
	
	public Double getValor_hora() {
		return valor_hora;
	}
	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}
	public Integer getQtd_hora() {
		return qtd_hora;
	}
	public void setQtd_hora(Integer qtd_hora) {
		this.qtd_hora = qtd_hora;
	}

	public FuncionarioHorario(String CPF, String nome, Integer idade, Double salario, Double valor_hora, Integer qdt_hora) {
		super(CPF, nome, idade, salario);
		this.setValor_hora(valor_hora);
		this.setQtd_hora(qdt_hora);
	}
}
