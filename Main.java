import control.TiendaFake;
import ventanas.Dashboard;

public class Main {
    public static void main(String[] args) {

        try {
            String urlApi = "https://jsonplaceholder.typicode.com/posts/99";
            String respuesta = TiendaFake.obtenerProductos(urlApi);

            for (int i = 0; i < respuesta.length(); i++) {
                String letra = "" + respuesta.charAt(i);
                System.out.print(letra);
            }

        } catch (Exception e) {
        }
    }
}
