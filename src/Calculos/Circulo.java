
package Calculos;

import Excepciones.Excepciones;

public class Circulo extends Figura {
    private double radio;       
    private final Excepciones ex = new Excepciones();

    public Circulo() {        
        
        System.out.println("Ingrese el valor del radio del círculo:");
       
        ex.soloNumeros();                                    
        radio = ex.getParametro();                     
               
        areaCirculo();           
        perimetroCirculo();
    }
    
    private void areaCirculo (){
        area = 3.14159265359 * radio*radio;
    }
    
    private void perimetroCirculo (){
        perimetro = 2 * 3.14159265359 * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
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
