package testautomotor;

/**
 *
 * @author joseph
 */
class Automotor {

    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor() {
    }

    public Automotor(String cedula, String marca, int anioFabricacion, double valorVehiculo,
            Fabricante fabricante) {
        this.cedula = cedula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.fabricante = fabricante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void CalcularValorMatricula() {
        this.valorMatricula = (this.valorVehiculo * 0.00002) * this.anioFabricacion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    

    @Override
    public String toString() {
        return String.format("Automotor"
                + "\nCedula: %s"
                + "\nMarca: %s"
                + "\nFabricante: %s"
                + "\nAnio Fabricacion: %d"
                + "\nValor Vehiculo: %.2f"
                + "\nValor Matricula: %.2f",
                this.getCedula(), this.getMarca(),
                this.getFabricante(),
                this.getAnioFabricacion(), this.getValorVehiculo(),
                this.getValorMatricula());
    }

}

class Fabricante {

    private String nombreFabricante;
    private String ciudadOrigen;

    public Fabricante() {
    }

    public Fabricante(String nombreFabricante, String ciudadOrigen) {
        this.nombreFabricante = nombreFabricante;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    @Override
    public String toString() {
        return String.format("\nNombre del Fabricante: %s"
                + "\nCiudad de Origen: %s",
                this.getNombreFabricante(),
                this.getCiudadOrigen());
    }
}

public class TestAutomotor {

    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Joseph","Loja");
        Automotor automotor1 = new Automotor("1900775972", "Nissan", 2000, 30000, fabricante1);
        automotor1.CalcularValorMatricula();
        System.out.println(automotor1);
    }

}
