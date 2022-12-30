import javax.swing.*;
/* EJercicio  1 : Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la
   longitud de sus lados. Los valores de la longitud deberan introducirse por linea de ordenes. Si es cuadrado,
   solo se proporcionara la longuitud de uno de los lados al construcctor */

public class Main {
    public static void main(String[] args) {

        Cuadrilatero c1;
        float lado1,lado2;

        lado1=Float.parseFloat(JOptionPane.showInputDialog("digite el lado 1 del cuadrilatero"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("digite el lado 2 del cuadrilatero"));

        if (lado1 ==lado2){
            c1=new Cuadrilatero(lado1);
        }else{
            c1=new Cuadrilatero(lado1,lado2);
        }

        System.out.println("el perimetro es :"+c1.getPerimetro());
        System.out.println("el area es :"+c1.getArea());
    }
}