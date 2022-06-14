package git;
/**
 * Clase main
 * @author pccasa
 * @since 14-06-2022
 */
public class Main {
	/**
	 * Método main, crea una cuenta y le asigna valores nuevos
	 * @param args
	 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

    }
	/**Método para probar operaciones en la cuenta
	 * @param cuenta1
	 * @param cantidad
	 */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
