public abstract class Funcionario {
	
	private String funcao;
	protected double salario;

	public abstract double getSalario();
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public String geNnome() {
		return funcao;
	}
	
	public static void main(String[] args) {
		
		Comissionadotemporario c1 = new Comissionadotemporario();
		Contratadocarteira c2 = new Contratadocarteira();
		System.out.println("Respectivos salarios ");
		
		c1.setSalario(1212.00);
		System.out.println("Comissionado temporario: "+c1.getSalario());
		
		c2.setSalario(1212.00);
		System.out.println("Contratadocarteira: "+c2.getSalario());
	}	
}