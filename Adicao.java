public class Adicao {

	int soma(int n1, int n2) {
		return n1+n2;
	}
	
	int somar(int n1, int n2, float n3) {
		return (int) (n1+n2+n3);
	}
	
	public static void main(String[]args) {
		Adicao s = new Adicao();
		int soma = s.soma(10, 20);
		float somaf = s.somar(10, 20, 10);
		System.out.println("soma numeros inteiros: "+soma);
		System.out.println("soma de numeros reais: "+somaf); 
	}
}
