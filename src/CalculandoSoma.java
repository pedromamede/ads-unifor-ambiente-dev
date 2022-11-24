import Calculadora;

public class CalculandoSoma{
    public static void main(String args []){
      Calculadora calc = new Calculadora();

      double resultadoSoma = calc.soma(900,100);

      System.out.println("Mostrando resultado da soma de 900 + 100:");
      System.out.println(resultadoSoma);
    }
  }