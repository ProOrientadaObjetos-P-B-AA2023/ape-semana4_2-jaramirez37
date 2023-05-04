package testbanco;

/**
 *
 * @author joseph
 */
class Banco {

    private String nombreBanco;
    private int numeroSucursales;
    private double valorCheque;
    private double comision;
    private Cliente cliente;

    public Banco() {
    }

    public Banco(int numeroSucursales, String nombreBanco, double valorCheque,
            Cliente cliente) {
        this.numeroSucursales = numeroSucursales;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        this.cliente = cliente;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void CalcularComision() {
        this.comision = this.valorCheque * 0.00003;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("Banco"
                + "\nCliente: %s"
                + "\nNombre Banco: %s"
                + "\nNumero de sucursales: %s"
                + "\nValor Cheque: %.2f"
                + "\nValor Comision: %.2f",
                this.getCliente(),
                this.getNombreBanco(), this.getNumeroSucursales(),
                this.getValorCheque(), this.getComision());
    }

}

class Cliente {

    private String nombre;
    private String apellido;
    private String cedula;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return String.format("\nNombre: %s"
                + "\nApellido: %s"
                + "\nCedula: %s",
                this.getNombre(),
                this.getApellido(),
                this.getCedula());
    }
}

public class TestBanco {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joseph", "Ramirez", "1900775972");
        Banco cheque1 = new Banco(4, "Banco de Loja", 20000, cliente1);
        cheque1.CalcularComision();
        System.out.println(cheque1);
    }

}
