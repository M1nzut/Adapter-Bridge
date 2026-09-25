import javax.swing.*;
import java.awt.*;

public class GymTrackGUI extends JFrame {
    private JTextField txtNombre;
    private JTextField txtPeso;
    private JTextField txtSeries;
    private JTextField txtRepeticiones;
    private JComboBox<String> cbTipo;
    private JComboBox<String> cbVista;
    private JTextArea areaResultado;

    public GymTrackGUI() {
        setTitle("GymTrack");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel principal = new JPanel(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("GYMTRACK - Registro de Entrenamientos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        principal.add(titulo, BorderLayout.NORTH);

        JPanel formulario = new JPanel(new GridLayout(7, 2, 8, 8));

        formulario.add(new JLabel("Ejercicio:"));
        txtNombre = new JTextField();
        formulario.add(txtNombre);

        formulario.add(new JLabel("Peso (kg):"));
        txtPeso = new JTextField();
        formulario.add(txtPeso);

        formulario.add(new JLabel("Series:"));
        txtSeries = new JTextField();
        formulario.add(txtSeries);

        formulario.add(new JLabel("Repeticiones:"));
        txtRepeticiones = new JTextField();
        formulario.add(txtRepeticiones);

        formulario.add(new JLabel("Tipo de entrenamiento:"));
        cbTipo = new JComboBox<>(new String[]{"Hipertrofia", "Fuerza"});
        formulario.add(cbTipo);

        formulario.add(new JLabel("Visualización:"));
        cbVista = new JComboBox<>(new String[]{"Simple", "Detallada"});
        formulario.add(cbVista);

        JButton btnRegistrar = new JButton("Registrar ejercicio");
        JButton btnImportar = new JButton("Importar ejercicio");
        formulario.add(btnRegistrar);
        formulario.add(btnImportar);

        principal.add(formulario, BorderLayout.CENTER);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setPreferredSize(new Dimension(450, 150));
        principal.add(scroll, BorderLayout.SOUTH);

        add(principal);

        btnRegistrar.addActionListener(e -> registrar());
        btnImportar.addActionListener(e -> importar());
    }

    private Visualizacion obtenerVisualizacion() {
        String vista = cbVista.getSelectedItem().toString();
        if (vista.equals("Simple")) {
            return new VistaSimple();
        }
        return new VistaDetallada();
    }

    private Entrenamiento obtenerEntrenamiento(Visualizacion visualizacion) {
        String tipo = cbTipo.getSelectedItem().toString();
        if (tipo.equals("Hipertrofia")) {
            return new Hipertrofia(visualizacion);
        }
        return new Fuerza(visualizacion);
    }

    private void registrar() {
        try {
            String nombre = txtNombre.getText().trim();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingresa el nombre del ejercicio.");
                return;
            }

            double peso = Double.parseDouble(txtPeso.getText());
            int series = Integer.parseInt(txtSeries.getText());
            int repeticiones = Integer.parseInt(txtRepeticiones.getText());

            Ejercicio ejercicio = new Ejercicio(nombre, peso, series, repeticiones);
            Visualizacion visualizacion = obtenerVisualizacion();
            Entrenamiento entrenamiento = obtenerEntrenamiento(visualizacion);

            areaResultado.setText(entrenamiento.mostrar(ejercicio));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Revisa los datos ingresados.");
        }
    }

    private void importar() {
        EjercicioExterno ejercicioExterno =
            new EjercicioExterno("Hip Thrust", 110, 4, 8);

        EjercicioAdapter adapter = new EjercicioAdapter();
        Ejercicio ejercicio = adapter.adaptar(ejercicioExterno);

        txtNombre.setText(ejercicio.getNombre());
        txtPeso.setText(String.valueOf(ejercicio.getPeso()));
        txtSeries.setText(String.valueOf(ejercicio.getSeries()));
        txtRepeticiones.setText(String.valueOf(ejercicio.getRepeticiones()));

        Visualizacion visualizacion = obtenerVisualizacion();
        Entrenamiento entrenamiento = obtenerEntrenamiento(visualizacion);

        areaResultado.setText(
            "Ejercicio importado mediante Adapter\n\n" +
            entrenamiento.mostrar(ejercicio)
        );
    }
}
