public class EmpleadoPermanente extends Empleado {

    private double bonificacion;

    public EmpleadoPermanente(String id, String nombre, double salario, double bonificacion) {
        super(id, nombre, salario);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularDesempeno() {
        return (salario + bonificacion) * 0.1;
    }
}