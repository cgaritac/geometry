
package Calculos;

import Excepciones.Excepciones;

public class Cuadrado extends Figura {
    private double lado;        
    private final Excepciones ex = new Excepciones();
 
    public Cuadrado() {
       
       System.out.println("Ingrese el valor del lado del cuadrado:");
                             
       ex.soloNumeros();                                           
       lado = ex.getParametro();              
       
       areaCuadrado();
       perimetroCuadrado();
    }
 
    private void areaCuadrado () {
        area = lado * lado;    
    }
    
    private void perimetroCuadrado () {
        perimetro = 4 * lado;  
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
}
