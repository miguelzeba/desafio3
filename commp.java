

	import java.util.Scanner;

	public class commp {

	    // Función f(x) = ln(x)
	    public static double funcion(double x) {
	        return Math.log(x);
	    }

	    // Primera derivada f'(x) = 1/x
	    public static double primeraDerivada(double x) {
	        return 1 / x;
	    }

	    // Segunda derivada f''(x) = -1/x^2
	    public static double segundaDerivada(double x) {
	        return -1 / Math.pow(x, 2);
	    }

	    // Tercera derivada f'''(x) = 2/x^3
	    public static double terceraDerivada(double x) {
	        return 2 / Math.pow(x, 3);
	    }

	    // Aproximación de primer orden
	    public static double aproximacionPrimerOrden(double x0, double h) {
	        return funcion(x0) + primeraDerivada(x0) * h;
	    }

	    // Aproximación de segundo orden
	    public static double aproximacionSegundoOrden(double x0, double h) {
	        return funcion(x0) + primeraDerivada(x0) * h + (segundaDerivada(x0) * Math.pow(h, 2)) / 2;
	    }

	    // Aproximación de tercer orden
	    public static double aproximacionTercerOrden(double x0, double h) {
	        return funcion(x0) + primeraDerivada(x0) * h + (segundaDerivada(x0) * Math.pow(h, 2)) / 2
	                + (terceraDerivada(x0) * Math.pow(h, 3)) / 6;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Leer x0 y x1
	        System.out.print("Introduce el valor de x0: ");
	        double x0 = sc.nextDouble();

	        System.out.print("Introduce el valor de x1: ");
	        double x1 = sc.nextDouble();

	        System.out.println("valor de f(x1): "+Math.log(x1));

	        // Calcular h
	        double h = x1 - x0;

	        // Calcular las aproximaciones
	        double aproxPrimerOrden = aproximacionPrimerOrden(x0, h);
	        double aproxSegundoOrden = aproximacionSegundoOrden(x0, h);
	        double aproxTercerOrden = aproximacionTercerOrden(x0, h);

	        // Mostrar resultados
	        System.out.println("Aproximación de primer orden: " + aproxPrimerOrden);
	        System.out.println("Aproximación de segundo orden: " + aproxSegundoOrden);
	        System.out.println("Aproximación de tercer orden: " + aproxTercerOrden);

	        sc.close();
	    }
	
	}

