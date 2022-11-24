public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.soma(2,3);
        System.out.println(resultado);
    }
}
