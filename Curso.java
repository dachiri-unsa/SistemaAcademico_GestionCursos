import java.util.Scanner;
import java.util.ArrayList;
public class Curso {
    private int codigo_curso;
    private String nombre;
    private Docente profesor;
    private static int contadorCursos = 0;
    private int nota1, nota2, nota3;

    public Curso(Scanner sc, ArrayList<Docente> lista_docentes){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresar el nombre del curso: ");
        nombre = sc.nextLine().trim();

        System.out.println("Ingresar el codigo del docente que dicta "+nombre+" : ");
        for (int i = 0; i < lista_docentes.size(); i++){
            if (lista_docentes.get(i).getnombreCurso_dictado() == null){
                System.out.println((i+1)+") "+lista_docentes.get(i));
            }
        }
        while(true){
            int docente_elegido = sc.nextInt()-1;
            sc.nextLine();
            if (docente_elegido < 0 || docente_elegido >= lista_docentes.size()){
                System.out.println("Numero invalido, porfavor ingresar de nuevo");
            }
            else {
                profesor = lista_docentes.get(docente_elegido);
                lista_docentes.get(docente_elegido).setnombreCurso_dictado(nombre);
                break;
            }
        }
        contadorCursos++;
        this.codigo_curso = contadorCursos;
        System.out.println("El codigo del curso sera: "+this.codigo_curso);
    }

    public int getCodigo(){
        return codigo_curso;
    }
    public void setCodigo(int codigo){
        this.codigo_curso = codigo;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota1(int nota){
        this.nota1 = nota;
    }
    public double getNota2(){
        return nota2;
    }
    public void setNota2(int nota){
        this.nota2 = nota;
    }
    public double getNota3(){
        return nota3;
    }
    public void setNota3(int nota){
        this.nota3 = nota;
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
        return nombre+" ("+codigo_curso+")";
    }

    public void Notas(Scanner sc){
        System.out.println("Ingrese sus notas: ");
        System.out.println("Nota 1:");
        nota1=sc.nextInt();
        sc.nextLine();
        while (nota1 < 0 || nota1 > 20) {
            System.out.println("Nota invalida. Ingresar nota entre el 0 y 20");
            nota1=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Nota 2:");
        nota2=sc.nextInt();
        sc.nextLine();
        while (nota2 < 0 || nota2 > 20) {
            System.out.println("Nota invalida. Ingresar nota entre el 0 y 20");
            nota2=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Nota 3:");
        nota3=sc.nextInt();
        sc.nextLine();
        while (nota2 < 0 || nota2 > 20) {
            System.out.println("Nota invalida. Ingresar nota entre el 0 y 20");
            nota2=sc.nextInt();
            sc.nextLine();
        }
    }

    public static void mostrarCursos(ArrayList<Curso> lista_cursos){
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
