public class Calculadora {
  public double soma(double numero1, double numero2){
    return numero1 + numero2;
  }

  public double subtracao(double numero1, double numero2){
    return numero1 - numero2;
  }

  public double divisao(double numero1, double numero2){
    return numero1 / numero2;
  }

  public double multiplicacao(double numero1, double numero2){
    return numero1 * numero2;
  }

  public double exponencial(double numero, double potencia) {
    return Math.pow(numero, potencia);
  }

  public double raizQuadrada(double numero){
    return Math.sqrt(numero);
  }

  public double piso(double numero){
    return Math.floor(numero);
  }   

  public double teto(double numero){
    return Math.ceil(numero);
  }
}
