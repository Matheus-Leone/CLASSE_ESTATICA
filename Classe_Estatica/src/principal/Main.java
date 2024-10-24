package principal;

//Importa para puxar toda a lógica e os cálculos 
import conversorUnidade.ConversordeUnidades;

//Classe main só para instanciar os métodos
public class Main {

//O valor "50" é um exemplo, é possível trocá-lo, e após isso é só trocar o valor da string para manter o sentido da frase	
	public static void main(String[] args) {
	    
	    double conversaoTemp = ConversordeUnidades.celsiusParaFarenheit(50);
	    System.out.println ("50 graus em Farenheit é: " + conversaoTemp);
	
	    double conversaoDist = ConversordeUnidades.quilometroParaMilhas(50);
	    System.out.println ("50 km em milhas é: " + conversaoDist);
	
	    double conversaoPeso = ConversordeUnidades.gramasParaLibras(50);
	    System.out.println ("50 gramas em libras é: " + conversaoPeso);
	} 
	

}
