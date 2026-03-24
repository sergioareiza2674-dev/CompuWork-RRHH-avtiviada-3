public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected double salario;

    public Empleado(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularDesempeno();

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nombre + " | Salario: " + salario;
    }
}