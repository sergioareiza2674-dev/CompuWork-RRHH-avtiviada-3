import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String id;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en el departamento " + nombre);
            return;
        }

        System.out.println("\nEmpleados en " + nombre + ":");
        for (Empleado e : empleados) {
            System.out.println("- " + e + " | Desempeño: " + e.calcularDesempeno());
        }
    }
}