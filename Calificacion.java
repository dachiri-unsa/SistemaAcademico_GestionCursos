import java.util.ArrayList;
import java.util.Scanner;

public class Calificacion {
    private Alumno alumno_actual;
    private ArrayList<Curso> cursos_matriculados;
    private static ArrayList<Double> promedio_alumnos;
// codigo alumno
// "" curso
// registrar notas
    public Calificacion(ArrayList<Alumno> lista_alumnos, Scanner sc){
        System.out.println("Ingrese codigo del alumno: ");
        alumno_actual = lista_alumnos.get(sc.nextInt()-1);
        cursos_matriculados=alumno_actual.getCursos_matriculados();
        for (int i=0;i<cursos_matriculados.size();i++){
            System.out.println("Notas del curso de "+cursos_matriculados.get(i));
            cursos_matriculados.get(i).Notas();
            System.out.println("----------------------------------------------------------");
        }
    }
    public Double Promedio(ArrayList<Alumno> lista_alumnos, Scanner sc){
        ArrayList<Double> promedios=new ArrayList<Double>();
        System.out.println("Ingrese codigo del alumno: ");
        alumno_actual = lista_alumnos.get(sc.nextInt()-1);
        Double suma=0.0;
        for (int i=0;i<cursos_matriculados.size();i++){
            promedios.add((cursos_matriculados.get(i).getNota1()+cursos_matriculados.get(i).getNota2()+cursos_matriculados.get(i).getNota3())/3);
        }
        for (int i=0;i<cursos_matriculados.size();i++){
            suma+=promedios.get(i);
        }
        double promedio_final=suma/cursos_matriculados.size();
        promedio_alumnos.add(promedio_final);
        return promedio_final;
    }
}