package testestudiante;

/**
 *
 * @author joseph
 */

class Estudiante{
    private String nomnbre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;

    public Estudiante() {
    }

    public Estudiante(String nomnbre, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nomnbre = nomnbre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad = universidad;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void CalcularPromedio() {
        this.promedio = (getNota1() + getNota2() + getNota3()) / 3;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nomnbre=" + nomnbre + ", nota1=" + nota1 + ", nota2=" + 
                nota2 + ", nota3=" + nota3 + ", promedio=" + 
                promedio + ", universidad=" + universidad + '}';
    }
    
}

class Universidad{
    private String nombre;
    private String direccion;

    public Universidad() {
    }

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}

public class TestEstudiante {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTPL", "San Cayetano");
        Estudiante estudiante1 = new Estudiante ("Joseph", 8, 9, 10, universidad1);
        estudiante1.CalcularPromedio();
        System.out.println(estudiante1);
    }
    
}
