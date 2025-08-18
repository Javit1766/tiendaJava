package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelProductos extends JPanel {

    public PanelProductos() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2, true)); // borde azul punteado

        JLabel lblProducto = new JLabel("Producto");
        lblProducto.setForeground(Color.RED);
        lblProducto.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel grid = new JPanel(new GridLayout(2, 4, 10, 10));
        grid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 8 cuadros
        for (int i = 0; i < 8; i++) {
            JPanel recuadro = new JPanel();
            recuadro.setPreferredSize(new Dimension(100, 120));
            recuadro.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            grid.add(recuadro);
        }

        add(lblProducto, BorderLayout.NORTH);
        add(grid, BorderLayout.CENTER);
    }
}
