
public class Paciente {
	
	double peso;
	double altura;
	
	Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC() {
		double imc = peso / (altura * altura);
		System.out.printf("Imc = %.2f\n",imc);
		return imc;

	}
	
	void diagnostico() {
		
		double imc = calcularIMC();
		String aviso = "";
		
		if (imc < 16) {
			aviso = "Baixo peso muito grave";
		}else if( imc >= 16 && imc <= 16.99 ){
			aviso = "Baixo peso grave";

		}else if( imc >= 17 && imc <= 18.49 ){
			aviso = "Baixo peso";

		}else if( imc >= 18.50 && imc <= 24.99 ){
			aviso = "Peso normal";

		}else if( imc >= 25 && imc <= 29.99 ){
			aviso = "Sobrepeso";

		}else if( imc >= 30 && imc <= 34.99 ){
			aviso = "Obesidade grau I";

		}else if( imc >= 35 && imc <= 39.99 ){
			aviso = "Obesidade grau II";

		}else if( imc >= 40 ){
			aviso = "Obesidade grau III (obesidade mórbida)";

		}
		
		System.out.println(aviso);
		
	}
	
	
	
	
	
	

}
