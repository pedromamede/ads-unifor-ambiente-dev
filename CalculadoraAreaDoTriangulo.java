import Calculadora;

public class CalculadoraAreaDoTriangulo {

    //Ambiente de Samuel Vidal R

    public static void main(String[] args){

        Calculadora calc1 = new Calculadora();

        double base = 10;

        double altura = 20;

        double area = calc1.divisao(calc1.multiplicacao(base , altura), 2);
        
        System.out.println("Area do triangulo de base 10 e altura 20 : "+area);

    }

}