public class ReporteDesempeno {

    public void generarReporteIndividual(Empleado e) {
        System.out.println("\nREPORTE INDIVIDUAL");
        System.out.println("Empleado: " + e.getNombre());
        System.out.println("Salario: " + e.getSalario());
        System.out.println("Desempeño: " + e.calcularDesempeno());
    }

    public void generarReporteDepartamento(Departamento d) {

        if (d.getEmpleados().isEmpty()) {
            System.out.println("No hay empleados en el departamento.");
            return;
        }

        System.out.println("\nREPORTE DEL DEPARTAMENTO: " + d.getNombre());

        double total = 0;

        for (Empleado e : d.getEmpleados()) {
            total += e.calcularDesempeno();
        }

        double promedio = total / d.getEmpleados().size();

        System.out.println("Total empleados: " + d.getEmpleados().size());
        System.out.println("Promedio desempeño: " + promedio);
    }
}