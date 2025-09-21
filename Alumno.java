import java.util.Scanner;
public class Alumno {
    private String nombres;
    private String apellidos;
    private int codigo;

    public Alumno(Scanner sc, int codigo){
        System.out.println("Ingresar nombres: ");
        nombres = sc.nextLine();
        System.out.println("Ingresar apellidos: ");
        apellidos = sc.nextLine();
        this.codigo = codigo;
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
}
