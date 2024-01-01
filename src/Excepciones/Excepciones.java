
package Excepciones;

import java.util.Scanner;

public class Excepciones {
    private double parametro;
    
    public void soloNumeros(){
        Scanner sc = new Scanner(System.in);
        do {       
            try{
                parametro = Double.parseDouble(sc.nextLine());
                if (parametro <= 0){
                    System.out.println("Valor no válido, por favor ingrese el valor nuevamente");
                    parametro = -1;
                }
        }catch (NumberFormatException nfe){
            System.out.println("Valor no válido, por favor ingrese el valor nuevamente");
            parametro = -1;                
        }            
        }while (parametro == -1);     
        setParametro(parametro);
    }  

    public double getParametro() {
        return parametro;
    }

    private void setParametro(double parametro) {
        this.parametro = parametro;
    }    
}
