/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String cod, ArrayList<Estudiante> ls) {
        super(cod);
        lista = ls;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Estudiante> l) {
        lista = l;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void calcularPromedioMatriculas() {
        double suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getMatricula();
        }

        promedioMatriculas = suma / lista.size();
    }

    @Override
    public String toString() {
        String m = String.format("=============================="
                + "\nReporte Estudiantes (%s):\n",
                codigo);

        for (int i = 0; i < lista.size(); i++) {
            m = String.format("%s\n- Estudiante N°%d, %s\n"
                    + "Matricula: $%.3f",
                    m,
                    i + 1,
                    lista.get(i).getNombre(),
                    lista.get(i).getMatricula());
        }

        m = String.format("%s\n\nPromedio de matriculas: $%.3f\n\n",
                m,
                promedioMatriculas);

        return m;
    }

}
