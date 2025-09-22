import java.util.ArrayList;
import java.util.Scanner;
public class Matricula {
    private Alumno alumno_actual;
    private ArrayList<Curso> cursos_matriculados;

    public Matricula(ArrayList<Alumno> lista_alumnos, ArrayList<Curso> lista_cursos, Scanner sc){
        System.out.println("Ingrese su codigo: ");
        alumno_actual = lista_alumnos.get(sc.nextInt()-1);
        sc.nextLine();
        alumno_actual.CursosMatriculados(cursos_matriculados);
        Curso.mostrarCursos(lista_cursos);
        while (true){
            System.out.println("Ingrese codigo del curso al que desee matricularse: ");
            int curso_seleccionado = sc.nextInt()-1;
            sc.nextLine();
            while(curso_seleccionado < 0 || curso_seleccionado >= lista_cursos.size()){
                System.out.println("Dato no valido, porfavor ingresar de nuevo.");
                curso_seleccionado = sc.nextInt()-1;
                sc.nextLine();
            }
            alumno_actual.CursosMatriculados(cursos_matriculados);
            cursos_matriculados.add(lista_cursos.get(curso_seleccionado));
            System.out.println("¿Desea matricularse a otro curso? (s/n)");
            String rpta = sc.next();
            if (rpta.equalsIgnoreCase("n")){
                break;
            }
        }
        alumno_actual.CursosMatriculados(cursos_matriculados);
    }

// ingresar arrayList codigo ----> Alumno

// bucle{}
// mostrar cursos con codigo
// ingresar arraylist codigo ----> curso

// 

}