package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelBuscar extends JPanel {
    private JTextField txtBuscar;

    public PanelBuscar() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.RED)); // borde rojo para ver limites

        JLabel lblBuscar = new JLabel("Buscar");
        lblBuscar.setForeground(Color.RED);
        lblBuscar.setFont(new Font("Arial", Font.BOLD, 14));

        txtBuscar = new JTextField();
        txtBuscar.setBorder(BorderFactory.createLineBorder(Color.RED));

        JPanel contenedor = new JPanel(new GridLayout(2, 1, 5, 5));
        contenedor.add(lblBuscar);
        contenedor.add(txtBuscar);

        add(contenedor, BorderLayout.NORTH);
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }
}
