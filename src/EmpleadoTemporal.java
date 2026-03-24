public class EmpleadoTemporal extends Empleado {

    private String fechaFinContrato;

    public EmpleadoTemporal(String id, String nombre, double salario, String fechaFinContrato) {
        super(id, nombre, salario);
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public double calcularDesempeno() {
        return salario * 0.08;
    }
}