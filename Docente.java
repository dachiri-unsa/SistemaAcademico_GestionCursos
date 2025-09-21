import java.util.ArrayList;
import java.util.Scanner;
public class Docente {
    private int dni;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private int años_experiencia;
    private Curso curso_dictado;

    public Docente(Scanner sc){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresar nombres del docente: ");
        nombres = sc.nextLine();
        System.out.println("Ingresar apellidos del docente: ");
        apellidos = sc.nextLine();
        System.out.println("Ingresar el dni del docente: ");
        dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresar especialidad del docente: ");
        especialidad = sc.nextLine();
        System.out.println("Ingresar la cantidad de años de experiencia: ");
        años_experiencia = sc.nextInt();
        sc.nextLine();
        curso_dictado = null;
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
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public int getAños_experiencia(){
        return años_experiencia;
    }
    public void setAños_experiencia(int años_experiencia){
        this.años_experiencia = años_experiencia;
    }
    
    public Curso getCurso_dictado(){ 
        return curso_dictado;
    }
    public void setCurso_dictado(Curso curso){
        this.curso_dictado = curso;
    }
        
    public String toString(){
        if (curso_dictado != null){
            return apellidos+", "+nombres+"("+dni+"). Curso dictado: "+curso_dictado;
        }
        else {
            return apellidos+", "+nombres+"("+dni+"). Sin curso a dictar";
        }
    }

    public static void mostrarDocentes(ArrayList<Docente> lista_docentes){
        System.out.println("----------------------------------------------------------");
        System.out.println("Lista de docentes: ");
        if (lista_docentes.isEmpty() == false){
            for (int i = 0 ; i < lista_docentes.size() ; i++ ){
                System.out.println(lista_docentes.get(i));
            }
        }
        else {
            System.out.println("No hay docentes registrados.");
        }
    }
}
