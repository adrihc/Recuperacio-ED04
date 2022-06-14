package git;

 /**Clase que declara una cuenta
  * @author pccasa
  * @since 14-06-2022
  */
public class CCuenta {


    /**
     * Introduce variable del nombre de la cuenta
     */
    private String nombre;
    /**
     * Introduce variable de numero de cuenta
     */
    private String cuenta;
    /**
     * Introduce variable del saldo de la cuenta
     */
    private double saldo;
    /**
     * Introduce variable del tipo de inter�s
     */
    private double tipoInteres;

    public CCuenta()
    {
    }
    
    /**M�todo para darle valores a una cuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * M�todo para saber cuanto saldo existe en la cuenta
     * @return Devuelve el saldo
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * M�todo para ingresar dinero a tu cuenta
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
    	//Si cantidad es menor a 0 lanza una excepci�n
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * M�todo para retirar dinero de tu cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
    	//Si cantidad es menor o igual a 0 lanza una excepci�n
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        //Si estado es menor que cantidad lanza una excepci�n
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    //Setters y getters de los atributos de CCuenta
	/**Getter de cuenta
	 * @return valor cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**Setter de cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**Getter de nombre
	 * @return valor nombre
	 */
	private String getNombre() {
		return nombre;
	}
	/**Setter de nombre
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**Getter de saldo
	 * @return valor saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**Setter de saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**Getter de tipo de inter�s
	 * @return valor tipo de inter�s
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**Setter de tipo de inter�s
	 * @param tipoInteres
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
