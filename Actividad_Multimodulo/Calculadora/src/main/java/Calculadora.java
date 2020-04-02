public class Calculadora {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Resta resta = new Resta();
        Division division = new Division();
        Multiplicacion multiplicacion = new Multiplicacion();

        System.out.println(suma.suma(1,2));
        System.out.println(resta.resta(1,2));
        System.out.println(division.dividir(1,2));
        System.out.println(multiplicacion.multiplicar(1,2));
    }
}
