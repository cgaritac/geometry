
package General;

import Calculos.Circulo;
import Calculos.Cuadrado;
import Impresiones.Dibujo;
import Calculos.Figura;
import Impresiones.Formulas;
import Calculos.Rectangulo;
import Calculos.TrianguloEquilatero;
import java.util.Scanner;

public class MenuGeneral {    

    public void menuPrincipal(){
        
        String txtMenu;
        int selec;   
        
        Figura f;
        Scanner sc = new Scanner(System.in);
        Formulas r = new Formulas();
        Dibujo d = new Dibujo();        

        do {        
        txtMenu = "--------------------------------------------------------------------\n"
                + "Programa para cálculo de áreaa y perímetros de figuras geométricas\n"
                + "--------------------------------------------------------------------\n"
                + "1. Cuadrado\n"
                + "2. Rectángulo\n"
                + "3. Triángulo Equilatero\n"
                + "4. Círculo\n"
                + "5. Salir\n"
                + "--------------------------------------------------------------------\n";

        System.out.print(txtMenu);

        try{
            selec = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException nfe){
            selec = 0;                
        }

            switch (selec){
                case 1:
                    d.cuadrado();
                    r.cuadrado();
                    f = new Cuadrado();
                    System.out.printf("El valor del área del cuadrado es de: %.2f\n",f.getArea());
                    System.out.printf("El valor del perímetro del cuadrado es de: %.2f\n\n",f.getPerimetro());
                    break;                           
                case 2:
                    d.rectangulo();
                    r.rectangulo();
                    f = new Rectangulo();
                    System.out.printf("El valor del área del rectángulo es de: %.2f\n",f.getArea());
                    System.out.printf("El valor del perímetro del rectángulo es de: %.2f\n\n",f.getPerimetro());
                    break;
                case 3:
                    d.trianguloEquilatero();
                    r.trianguloEquilatero();
                    f = new TrianguloEquilatero();
                    System.out.printf("El valor del área del triángulo equilátero es de: %.2f\n",f.getArea());
                    System.out.printf("El valor del perímetro del triángulo equilátero es de: %.2f\n\n",f.getPerimetro());
                    break;
                case 4:
                    d.circulo();
                    r.circulo();
                    f = new Circulo();
                    System.out.printf("El valor del área del círculo es de: %.2f\n",f.getArea());
                    System.out.printf("El valor del perímetro del círculo es de: %.2f\n\n",f.getPerimetro());
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("\nOpción no válida, por favor ingrese un número de opcion del menu\n");
                    break;                
            }             
        }while (selec != 5);  
    }   
        
}
