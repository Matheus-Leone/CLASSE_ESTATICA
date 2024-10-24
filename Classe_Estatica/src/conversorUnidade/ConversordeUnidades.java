package conversorUnidade;

public class ConversordeUnidades {

    //Método Estático para realizar a conversão da Temperatura
    //Sendo f = Farenheit
    //Sendo c = Celsius
    public static double celsiusParaFarenheit (double c){
    	double f = (c * 1.8) + 32;
        return f;
    
    }
    
    //Método Estático para realizar a conversão KM para Milhas
    //Sendo k = quilometros
    //Sendo m = Milhas
    public static double quilometroParaMilhas (double k){
    	double m = (k/1.6093);
        return m;
    }
    
    //Método Estático para realizar a conversão g para lb
    //Sendo l = libras
    //Sendo g = gramas
    public static double gramasParaLibras(double g){
    	double l = g/453.6;
        return l;
    
    }
    

} 