package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    float resultado;

    public static void main(String[] args) {
        Scanner objScaner = new Scanner(System.in);
        System.out.println("Teclea importe en euros");
        float euro = objScaner.nextFloat();
        System.out.println("Teclea tipo de hoy");
        float precioDolar = objScaner.nextFloat();
        float cambio = euro * precioDolar;
        System.out.println("El cambio euro a dolar = " + cambio);
    }

}
