

package com.mycompany.laboratoriopolimorfismo;

import javax.swing.JOptionPane;


public class Clientes {

    public static void main(String[] args) {
        
        CalculadoraNormal cal = new CalculadoraNormal();
        CalculadoraEspecial cal2 = new CalculadoraEspecial();
        int opcion;
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para calculadora normal\nDigite 2 para calculadora Especial \n0 para salir"));
        
        
        switch(opcion){
        
        case 1:
        JOptionPane.showInternalMessageDialog(null,"Estas son las operaciones de la calculadora normal");
        JOptionPane.showInternalMessageDialog(null, "La suma es: "+cal.sumarEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La resta es: "+cal.restarEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La multiplicacion es: "+cal.multiplicarEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La division es: "+cal.dividirEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La raiz Cuadrada es: "+cal.calcularRaizCuadrada(numero1));
        break;
        
        
        
        case 2:
        JOptionPane.showInternalMessageDialog(null,"Estas son las operaciones de la calculadora Especial");
        JOptionPane.showInternalMessageDialog(null, "La suma es: "+cal2.sumarEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La resta es: "+cal2.restarEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La multiplicacion es: "+cal2.multiplicarEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La division es: "+cal2.dividirEnteros(numero1, numero2));
        JOptionPane.showInternalMessageDialog(null, "La raiz Cuadrada es: "+cal2.calcularRaizCuadrada(numero1));
        break;
        case 0:
           JOptionPane.showInternalMessageDialog(null,"Saliendo del sistema");
           break;
  
    }
}while (opcion >=1 || opcion<0);
    }
}
