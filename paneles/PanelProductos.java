package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelProductos extends JPanel {

    public PanelProductos() {
        setLayout(new BorderLayout());

        JLabel lblProducto = new JLabel("Producto");
        lblProducto.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel grid = new JPanel(new GridLayout(2, 4, 10, 10));

        // 8 cuadros en gris
        for (int i = 0; i < 8; i++) {
            JPanel recuadro = new JPanel();
            recuadro.setPreferredSize(new Dimension(100, 120));
            recuadro.setBackground(Color.LIGHT_GRAY); 
            grid.add(recuadro);
        }

        add(lblProducto, BorderLayout.NORTH);
        add(grid, BorderLayout.CENTER);
    }
}
