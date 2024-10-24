package principal;

import conversorUnidade.ConversordeUnidades;

public class Main {

	
	public static void main(String[] args) {
	    
	    double conversaoTemp = ConversordeUnidades.celsiusParaFarenheit(50);
	    System.out.println ("50 graus em Farenheit é: " + conversaoTemp);
	
	    double conversaoDist = ConversordeUnidades.quilometroParaMilhas(50);
	    System.out.println ("50 km em milhas é: " + conversaoDist);
	
	    double conversaoPeso = ConversordeUnidades.gramasParaLibras(50);
	    System.out.println ("50 gramas em libras é: " + conversaoPeso);
	} 
	

}
