import Calculadora;

public class CalculandoSubtracao{
    public static void main(String args []){
      Calculadora calc = new Calculadora();

      double resultadoSubtracao = calc.subtracao(1000,300);

      System.out.println("Mostrando resultado da substração de 1000 - 300:");
      System.out.println(resultadoSubtracao);
    }
  }