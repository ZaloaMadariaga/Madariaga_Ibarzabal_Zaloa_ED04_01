package com.mycompany.ud4_te1;


public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            miCuenta.retirar(2300);
            System.out.println("El nuevo saldo es: " + miCuenta.estado());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Abono en cuenta");
            miCuenta.ingresar(695);
            System.out.println("El nuevo saldo es: " + miCuenta.estado());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
