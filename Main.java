import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GymTrackGUI ventana = new GymTrackGUI();
            ventana.setVisible(true);
        });
    }
}
