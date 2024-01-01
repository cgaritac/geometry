
package Calculos;

import Excepciones.Excepciones;

public class Rectangulo extends Figura{
    private double largo;
    private double ancho;
    private final Excepciones ex = new Excepciones();

    public Rectangulo() {
       
       do{
           System.out.println("Ingrese el valor del lado largo del rectangulo:");       
      
           ex.soloNumeros();       
           largo = ex.getParametro();
           
           System.out.println("Ingrese el valor del lado corto del rectangulo:");       
       
           ex.soloNumeros();       
           ancho = ex.getParametro();             
           
           if (largo < ancho){
               System.out.println("Relación largo - ancho invalida, favor ingrese un valor de lado largo mayor al valor del lado corto\n");
           }
 
       } while (largo < ancho);
       
       areaRectangulo();
       perimetroRectangulo();
    }
    
    private void areaRectangulo(){
        area = largo * ancho;
    }
    
    private void perimetroRectangulo () {
        perimetro = 2 * largo + 2 * ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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
