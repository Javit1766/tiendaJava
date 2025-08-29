package ventanas;

import javax.swing.*;
import java.awt.*;
import paneles.PanelBuscar;
import paneles.PanelProductos;

public class Dashboard extends JFrame {

    public Dashboard(String listaProductos ) {
        setTitle("Tienda Fake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        // Layout principal
        setLayout(new BorderLayout());

        // Panel de búsqueda (izquierda)
        PanelBuscar panelBuscar = new PanelBuscar();
        panelBuscar.setPreferredSize(new Dimension(300, getHeight()));

        // Panel de productos (derecha)
        PanelProductos panelProductos = new PanelProductos( listaProductos);

        add(panelBuscar, BorderLayout.WEST);
        add(panelProductos, BorderLayout.CENTER);
    }
}
