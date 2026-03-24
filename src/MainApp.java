import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {

    private Departamento dept = new Departamento("D1", "RRHH");
    private ReporteDesempeno reporte = new ReporteDesempeno();

    public MainApp() {
        setTitle("CompuWork - Sistema RRHH");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnAgregar = new JButton("Agregar Empleado");
        JButton btnMostrar = new JButton("Mostrar Empleados");
        JButton btnReporte = new JButton("Generar Reporte");

        // 🔥 BOTÓN MEJORADO (AQUÍ VA TU CÓDIGO)
        btnAgregar.addActionListener(e -> {
            try {
                String nombre = JOptionPane.showInputDialog(this, "Ingrese nombre:");
                String salarioStr = JOptionPane.showInputDialog(this, "Ingrese salario:");
                String tipo = JOptionPane.showInputDialog(this, "Tipo (1= Permanente, 2= Temporal):");

                if (nombre == null || salarioStr == null || tipo == null) {
                    return;
                }

                double salario = Double.parseDouble(salarioStr);

                Empleado emp;

                if (tipo.equals("1")) {
                    String bonStr = JOptionPane.showInputDialog(this, "Ingrese bonificación:");
                    double bon = Double.parseDouble(bonStr);

                    emp = new EmpleadoPermanente(
                            "E" + (int)(Math.random() * 1000),
                            nombre,
                            salario,
                            bon
                    );

                } else {
                    String fecha = JOptionPane.showInputDialog(this, "Fecha fin contrato:");

                    emp = new EmpleadoTemporal(
                            "E" + (int)(Math.random() * 1000),
                            nombre,
                            salario,
                            fecha
                    );
                }

                dept.agregarEmpleado(emp);
                JOptionPane.showMessageDialog(this, "Empleado agregado correctamente.");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos ingresados.");
            }
        });

        btnMostrar.addActionListener(e -> dept.mostrarEmpleados());

        btnReporte.addActionListener(e -> reporte.generarReporteDepartamento(dept));

        add(btnAgregar);
        add(btnMostrar);
        add(btnReporte);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp().setVisible(true));
    }
}