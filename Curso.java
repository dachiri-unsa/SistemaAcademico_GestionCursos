import java.util.Scanner;
import java.util.ArrayList;
public class Curso {
    private int codigo;
    private String nombre;
    private Docente profesor;

    public Curso(Scanner sc, int codigo, ArrayList<Docente> lista_docentes){
        if (lista_docentes.isEmpty() == false){
            System.out.println("Ingresar el nombre del curso: ");
            nombre = sc.nextLine();
            System.out.println("Ingresar el codigo del docente que dicta "+nombre+" : ");
            profesor = lista_docentes.get(sc.nextInt()-1);
            sc.nextLine();
            this.codigo = codigo;
            System.out.println("EL codigo del curso sera: "+this.codigo);
        }
        else{
            System.out.println("Aun no tienes docentes registrados.\nPor favor registra almenos uno antes de asignarle un curso.");
        }
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDocente_nombre(){
        return profesor.getNombres();
    }

    public String toString(){
        return nombre+" ("+codigo+")";
    }

    public static void mostrarCursos(ArrayList<Docente> lista_cursos){
        System.out.println("----------------------------------------------------------");
        System.out.println("Lista de cursos: ");
        if (lista_cursos.isEmpty() == false){
            for (int i = 0 ; i < lista_cursos.size() ; i++ ){
                System.out.println(lista_cursos.get(i));
            }
        }
        else {
            System.out.println("No hay cursos registrados.");
        }
    }
}
