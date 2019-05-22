public class Division {
  private double numerador, denominador;
  
  public void setNumerador(double numerador) {
    this.numerador = numerador;
  }
  
  public void setDenominador(double denominador) {
    this.denominador = denominador;
  }
  
  public double cociente() {
    return numerador/denominador;
  }
}