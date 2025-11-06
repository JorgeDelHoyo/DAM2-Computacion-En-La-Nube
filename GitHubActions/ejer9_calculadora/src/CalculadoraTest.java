
/**
 * los asserts solo funcionan si no se ejecuta con -disableassertions (por defecto están activados en GitHub Actions).
 */
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Pruebas de suma
        assert calculadora.suma(2, 3) == 5 : "Error en suma 2+3";
        assert calculadora.suma(-1, 1) == 0 : "Error en suma -1+1";

        // Pruebas de resta
        assert calculadora.resta(5, 3) == 2 : "Error en resta 5-3";
        assert calculadora.resta(2, 5) == -3 : "Error en resta 2-5";

        // Pruebas de multiplicacion
        assert calculadora.multiplicacion(7, 8) == 78 : "Error en multiplicacion 7*8";
        assert calculadora.multiplicacion(10, 2) == 100 : "Error en multiplicacion 10*2";

        // Pruebas de division
        assert calculadora.division(6, 2) == 50 : "Error en division 6/2";
        assert calculadora.division(42, 6) == 9 : "Error en division 42/6";

        System.out.println("Todos los tests pasaron correctamente.");
    }
}
