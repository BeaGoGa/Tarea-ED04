package Cuentas;

/**
 * Esta clase representa una cuenta bancaria y contiene información sobre el nombre del titular,
 * el número de cuenta, el saldo y el tipo de interés
 * @author Beatriz González
 *
 */
public class CCuenta {
	
	/**
	 * Aquí se definen los atributos. Son privados para que se accedan a ellos mediante métodos
	 * Nombre para el titular de la cuenta
	 * Cuenta para el número de cuenta
	 * Saldo nos muestra el saldo actual de la cuenta
	 * TipoInterés nos muestra el tipo de interés asociado a la cuenta
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor CCuenta sin parámetros
     * El constructor  CCuenta() se llama automáticamente cuando se crea un objeto de la clase CCuenta y no requiere ningún argumento. 
     * Este constructor crea un objeto de la clase sin inicializar los valores de los atributos.
     */
    public CCuenta()
    {
    }
    
    /**
     * El constructor con parámetros CCuenta permite inicializar los valores de los atributos al momento de crear el objeto. 
     * @param nom 
     * @param cue 
     * @param sal 
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método estado
     * @return el saldo actual en la cuenta
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Método ingresa: ingresa una cantidad en la cuenta. Lanza una excepción si la cantidad es negativa
     * @param cantidad
     * @throws Exception si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
    	//Aquí se utiliza la estructura if para establecer una condicion
        if (cantidad<0)
        	//Aquí se define una excepcion. Si se cumple la condición del if se imprime un mensaje por pantalla
            throw new Exception("No se puede ingresar una cantidad negativa");
        /*
         * Si la condición no se cumple, se ejecuta este código que nos muestra el nuevo saldo.
         */
        saldo = saldo + cantidad;
    }
    
    /**
     * Método retirar: Retirar una cantidad de la cuenta. 
     * @param cantidad
     * @throws Exception hay dos excepciones que controlan que no se puedan retirar valores negativos ni superiores al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
    	//Aquí se vuelve a utilizar la estructura if. 
        if (cantidad <= 0)
        	//Si se intenta retirar una cantidad menor o igual que 0, se lanza una excepción con un mensaje
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
        	//Si se intenta retirar una cantidad mayor del saldo disponible, se lanza una excepción con un mensaje
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Aquí se implata el método get() que muestra el valor del atributo.
     * @return el valor actual del atributo 
     */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Aquí se implanta el metodo set() que da un valor al atributo.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;

	}
}
