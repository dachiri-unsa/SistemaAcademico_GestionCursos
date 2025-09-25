import java.util.ArrayList;
import java.util.Scanner;

public class Calificacion {
    private Alumno alumno_actual;
    private ArrayList<Curso> cursos_matriculados;
    private static ArrayList<Double> promedio_alumnos = new ArrayList<>();
// codigo alumno
// "" curso
// registrar notas
    public Calificacion(){
        
    }

    public void setCalificacion(ArrayList<Alumno> lista_alumnos, Scanner sc){
        System.out.println("Ingrese codigo del alumno: ");
        alumno_actual = lista_alumnos.get(sc.nextInt()-1);
        cursos_matriculados=alumno_actual.getCursos_matriculados();
        for (int i=0;i<cursos_matriculados.size();i++){
            System.out.println("Notas del curso de "+cursos_matriculados.get(i));
            cursos_matriculados.get(i).Notas(sc);
            System.out.println("----------------------------------------------------------");
        }
    }
    public static void PromediosFinales(ArrayList<Alumno> lista_alumnos, Scanner sc){
        ArrayList<Double> promedios=new ArrayList<Double>();
        for(int i=0;i<lista_alumnos.size();i++){
            Alumno alumno_aRevisar = lista_alumnos.get(i);
            Double suma=0.0;
            for (int j=0;j<alumno_aRevisar.getCursos_matriculados().size();j++){
                promedios.add((alumno_aRevisar.getCursos_matriculados().get(j).getNota1()+alumno_aRevisar.getCursos_matriculados().get(j).getNota2()+alumno_aRevisar.getCursos_matriculados().get(j).getNota3())/3);
            }
            for (int j=0;j<alumno_aRevisar.getCursos_matriculados().size();j++){
                suma+=promedios.get(j);
            }
            double promedio_final=suma/alumno_aRevisar.getCursos_matriculados().size();
            promedio_alumnos.add(promedio_final);
        }
    }
    public Double Promedio(Scanner sc){
        ArrayList<Double> promedios=new ArrayList<Double>();
        System.out.println("Ingrese codigo del alumno: ");
        int a=sc.nextInt()-1;
        return promedios.get(a);
    }
    public static String Promedio_Más_Alto (ArrayList<Alumno> lista_alumnos) {
        double mayorPromedio=promedio_alumnos.get(0);
        int indiceMayorPromedio=0;
        for(int i= 1 ; i < promedio_alumnos.size(); i++) {
            if (mayorPromedio<promedio_alumnos.get(i)){
                indiceMayorPromedio=i;
                mayorPromedio=promedio_alumnos.get(i);
            }
        }
        Alumno mayor=lista_alumnos.get(indiceMayorPromedio);
        return mayor.getNombres();
    }
    public static void Estadisticas(ArrayList<Alumno> lista_alumnos) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Lista de aprobados y desaprobados: ");
        if (lista_alumnos.isEmpty() == false){
            for (int i = 0 ; i < lista_alumnos.size() ; i++ ){
                System.out.print(lista_alumnos.get(i));
                if (promedio_alumnos.get(i)>=11) {
                    System.out.println("    Aprobado!!");
                }
                else {
                    System.out.println("    Desaprobado :( )");
                }
            }
        }
        else {
            System.out.println("No hay alumnos registrados.");
        }
    }
}