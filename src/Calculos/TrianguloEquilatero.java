
package Calculos;

import Excepciones.Excepciones;

public class TrianguloEquilatero extends Figura{
    private double lado;
    private final Excepciones ex = new Excepciones();

    public TrianguloEquilatero() {
        
       System.out.println("Ingrese el valor del lado del triángulo equilátero:");
                      
       ex.soloNumeros();                                           
       lado = ex.getParametro();                        
       
       areaTriangulo();
       perimetroTriangulo();
    }
    
    private void areaTriangulo (){
        area = 0.4330127 * lado * lado;
    }
    
    private void perimetroTriangulo (){
        perimetro = 3 * lado;
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
