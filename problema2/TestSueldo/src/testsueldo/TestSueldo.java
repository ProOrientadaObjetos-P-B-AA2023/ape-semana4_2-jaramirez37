package testsueldo;

/**
 *
 * @author joseph
 */
class Profesor {

    private String nombre;
    private String Apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;

    public Profesor() {
    }

    public Profesor(String nombre, String Apellido, double sueldoBasico, String cedula, Provincia provincia) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void CalcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.20);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    

    @Override
    public String toString() {
        return String.format("Profesor"
                + "\nNombre: %s"
                + "\nApellido: %s"
                + "\nSueldo Basico: %.2f"
                + "\nSueldo Total: %.2f"
                + "\nCedula: %s"
                +"\nProvincia: %s",
                this.getNombre(), this.getApellido(),
                this.getSueldoBasico(), this.getSueldoTotal(),
                this.getCedula(), this.getProvincia());
    }

}

class Provincia {

    private String nombreProvincia;
    private int numeroHabitantes;

    public Provincia() {
    }

    public Provincia(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return String.format( "\nNombre de la Provincia: %s"
                + "\nNumero Habitantes: %d",
                this.getNombreProvincia(), 
                this.getNumeroHabitantes());
    }

}

public class TestSueldo {

    public static void main(String[] args) {
        Provincia provincia1 = new Provincia("Loja", 8000);
        Profesor profesor1 = new Profesor("Joseph", "Ramirez", 400, "1900775972", provincia1);
        profesor1.CalcularSueldoTotal();
        System.out.println(profesor1);
    }

}
