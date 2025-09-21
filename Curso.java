import java.util.Scanner;

public class Curso {
    private int código;
    private String nombreCurso;
    private Docente docente;
    public Curso(Scanner sc, int código){
        System.out.println("Ingresar nombre del curso: ");
        nombreCurso = sc.nextLine();
        System.out.println("Ingresar código del curso: ");
        código = sc.nextInt();
        this.código = código;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    public Docente getDocente(){
        return docente;
    }
    public void setApellidos(Docente docente){
        this.docente = docente;
    }
    public int getCódigo(){
        return código;
    }
    public void setCodigo(int código){
        this.código = código;
    }
    public String toString(){
        return "Curso\nNombre:"+nombreCurso+", código: "+código+", docente: "+docente;
    }
}
