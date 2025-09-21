import java.util.Scanner;
import java.util.ArrayList;
public class Alumno {
    private String nombres;
    private String apellidos;
    private int codigo;

    public Alumno(Scanner sc, int codigo){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresar nombres: ");
        nombres = sc.nextLine();
        System.out.println("Ingresar apellidos: ");
        apellidos = sc.nextLine();
        this.codigo = codigo;
        System.out.println("EL codigo de este alumno sera: "+this.codigo);
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
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String toString(){
        return apellidos+", "+nombres+" ("+codigo+")";
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
