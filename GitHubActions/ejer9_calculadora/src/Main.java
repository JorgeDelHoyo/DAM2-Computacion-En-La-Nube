public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int suma = calculadora.suma(10, 5);
        int resta = calculadora.resta(10, 5);
        double multiplicacion = calculadora.multiplicacion(9, 3);
        float division = calculadora.division(56, 8);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division: "+division);
    }
}
