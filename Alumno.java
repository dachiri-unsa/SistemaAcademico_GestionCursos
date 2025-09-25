import java.util.Scanner;
import java.util.ArrayList;
public class Alumno {
    private String nombres;
    private String apellidos;
    private int codigo_alumno;
    private static int contadorAlumnos = 0;
    private ArrayList<Curso> cursos_matriculados;
    private String aprueba;

    public Alumno(Scanner sc){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresar nombres: ");
        nombres = sc.nextLine();
        System.out.println("Ingresar apellidos: ");
        apellidos = sc.nextLine();
        contadorAlumnos++;
        codigo_alumno = contadorAlumnos;
        System.out.println("EL codigo de este alumno sera: "+codigo_alumno);
    }

    public void CursosMatriculados(ArrayList<Curso> lista_cursos) {
        this.cursos_matriculados=lista_cursos;
    }
    public ArrayList<Curso> getCursos_matriculados(){
        return cursos_matriculados;
    }

    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public int getCodigo(){
        return codigo_alumno;
    }
    public void setCodigo(int codigo){
        this.codigo_alumno = codigo;
    }
    public String toString(){
        return apellidos+", "+nombres+" ("+codigo_alumno+")";
    }

    public static void mostrarAlumnos(ArrayList<Alumno> lista_alumnos){
        System.out.println("----------------------------------------------------------");
        System.out.println("Lista de alumnos: ");
        if (lista_alumnos.isEmpty() == false){
            for (int i = 0 ; i < lista_alumnos.size() ; i++ ){
                System.out.println(lista_alumnos.get(i));
            }
        }
        else {
            System.out.println("No hay alumnos registrados.");
        }
    }
}
