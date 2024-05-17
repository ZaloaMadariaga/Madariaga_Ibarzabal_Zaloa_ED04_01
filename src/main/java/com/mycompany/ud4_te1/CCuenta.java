package com.mycompany.ud4_te1;

/**
La clase CCuenta representa una cuenta bancaria y contiene métodos para realizar operaciones como ingresar o retirar dinero. 
* La cuenta tiene un nombre, un número de cuenta, un saldo, un tipo de interés y una comisión fija para retirar dinero. 
* Los métodos permiten consultar y modificar estos atributos, así como realizar operaciones de ingreso y retirada de dinero,  
* 
* @version  10.0
 *
 * @author Zaloa Madariaga Ibarzabal
 */
public class CCuenta {

    private String nombre; // Nombre del titular de la cuenta
    private String cuenta; // Número de cuenta
    private double saldo; // Saldo actual de la cuenta
    private double tipoInteres; // Tipo de interés asociado a la cuenta
    private static final int COMISION = 2; // Valor constante para la comisión por retirar dinero

    
      /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

   /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
      public double getSaldo() {
        return saldo;
    }
       

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
      /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }
    

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés
     */
    public void setTipoInteres(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }
    
  
    /**
     *
     */
    
    public CCuenta() {
    }

     /**
     * Constructor parametrizado de la clase CCuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;

    }
    

     /**
     * Método para realizar un depósito en la cuenta.
     * @param cantidad Cantidad a depositar.
     * @throws Exception Si la cantidad a depositar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }
    

    /**
     * Método para realizar un retiro de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad a retirar es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }
    
}
