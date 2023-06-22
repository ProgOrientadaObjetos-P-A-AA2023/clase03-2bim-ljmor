package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String cod, ArrayList<Policia> ls) {
        super(cod);
        lista = ls;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public void calcularPromedioEdades() {
        double suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getEdad();
        }

        promedioEdades = suma / lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Policia> l) {
        lista = l;
    }

    @Override
    public String toString() {
        String m = String.format("=============================="
                + "\nReporte Policias (%s):\n",
                codigo);

        for (int i = 0; i < lista.size(); i++) {
            m = String.format("%s\n- Policia N°%d, %s\n"
                    + "Edad: %d",
                    m,
                    i + 1,
                    lista.get(i).getNombre(),
                    lista.get(i).getEdad());
        }

        m = String.format("%s\n\nPromedio de edades: %.3f\n\n",
                m,
                promedioEdades);

        return m;
    }
}
