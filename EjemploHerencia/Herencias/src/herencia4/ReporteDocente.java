package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String cod, ArrayList<Docente> ls) {
        super(cod);
        lista = ls;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public void calcularPromedioSueldos() {
        double suma = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getSueldo();
        }
        
        promedioSueldos = suma/lista.size();
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Docente> p) {
        lista = p;
    }

    @Override
    public String toString() {
        String m = String.format("=============================="
                + "\nReporte Docentes (%s):\n", 
                codigo);
        
        for (int i = 0; i < lista.size(); i++) {
            m = String.format("%s\n- Docente N°%d, %s\n"
                    + "Sueldo: $%.3f", 
                    m,
                    i+1,
                    lista.get(i).getNombre(),
                    lista.get(i).getSueldo());
        }
        
        m = String.format("%s\n\nPromedio de sueldos: $%.3f\n\n",
                m,
                promedioSueldos);
        
        return m;
    }
    
    
    
    
}
