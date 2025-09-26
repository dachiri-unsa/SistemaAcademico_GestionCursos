import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {
    private ArrayList<Alumno> lista_alumnos ;
    private ArrayList<Docente> lista_docente;
    private ArrayList<Curso> lista_cursos;
    private Calificacion calificaciones;
    private boolean secionActiva;
    private Scanner sc;;

    public Sistema(){
        this.lista_alumnos = new ArrayList<Alumno>();
        this.lista_docente = new ArrayList<Docente>();
        this.lista_cursos = new ArrayList<Curso>();
        this.sc = new Scanner(System.in);
        this.secionActiva = true;
    }
    public char bienvenida(){
        System.out.println("¡Bienvenido a sistema academico de gestión de cursos!");
        System.out.println("¿Desea empezar? (s/n)");
        return sc.nextLine().charAt(0);
    }

    public void iniciar() {
        while(this.secionActiva){
            System.out.println("\n-------MENU PRINCIPAL-------");
            System.out.println("----------------------------------------------------------");
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Ingresar datos\n2) Mostrar base de datos\n3) Matricular alumno en curso\n4) Registrar notas de alumno\n5) Calcular promedio final de un alumno\n6) Mostrar estadisticas de alumnos\n7) Promedio mas alto y estadisticas de todos\n0) Cerrar");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                System.out.println("\n----------MENU INGRESAR DATOS----------");
                System.out.println("Tipo de dato a ingresar:\n1) Alumno\n2) Docente\n3) Cursos\n0) Volver");
                String opcion_1 = sc.nextLine();
                    switch (opcion_1) {
                        case "1":
                            this.lista_alumnos.add(new Alumno(sc));
                            break;
                        case "2":
                            this.lista_docente.add(new Docente(sc));
                            break;
                        case "3":
                            if (this.lista_docente.isEmpty() == false){
                                this.lista_cursos.add(new Curso(sc, this.lista_docente));
                            }
                            else {
                                System.out.println("Aun no tienes docentes registrados.\nPor favor registra almenos uno antes de asignarle un curso.\n\n");
                            }
                            break;
                        case "0":
                            break;
                        default:
                            System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles \n\n");
                            break;
                    }
                    break;
                case "2":
                System.out.println("\n----------MENU MOSTRAR BASE DE DATOS----------");
                System.out.println("Lista de datos que quiere ver:\n1) Alumno\n2) Docente\n3) Cursos\n0) Volver");
                String opcion_2 = sc.nextLine();
                    switch (opcion_2) {
                        case "1":
                            Alumno.mostrarAlumnos(this.lista_alumnos);
                            break;
                        case "2":
                            Docente.mostrarDocentes(this.lista_docente);
                            break;
                        case "3":
                            Curso.mostrarCursos(this.lista_cursos);
                            break;
                        case "0":
                            break;
                        default:
                            System.out.println("\nERROR: \nDato ingresado no valido. Ingrese una de las opciones disponibles\n\n");
                            break;
                    }
                    break;
                case "3":
                    if (this.lista_alumnos.isEmpty() == false && this.lista_cursos.isEmpty() == false){
                        new Matricula(this.lista_alumnos, this.lista_cursos, sc);
                    }
                    else {
                        System.out.println("ERROR\nAun no tienes alumnos o cursos registrados.\nPor favor registra almenos uno de cada antes de matricular a un alumno.\n");
                    }
                    break;
                case "4":
                    if (this.lista_alumnos.isEmpty() == false) {
                        calificaciones.setCalificacion(lista_alumnos, sc);
                    }
                    else {
                        System.out.println("ERROR\nAun no tienes alumnos registrados\nPor favor registra almenos uno antes de registrar sus notas.");
                    }
                    break;
                case "5":
                    if (this.lista_alumnos.isEmpty() == false) {
                        Calificacion.PromediosFinales(lista_alumnos, sc);
                    }
                    else {
                        System.out.println("ERROR\nAun no tienes alumnos registrados\nPor favor registra almenos uno antes de calcular su promedio final.");
                    }
                    break;
                case "6":
                    System.out.println(calificaciones.Promedio(sc));
                    break;
                case "7":
                    if (this.lista_alumnos.isEmpty() == false) {
                        System.out.println("EL alumno con el promedio mas alto es: "+Calificacion.Promedio_Más_Alto(lista_alumnos));
                        Calificacion.Estadisticas(lista_alumnos);
                    }
                    else {
                        System.out.println("ERROR\nAun no tienes alumnos registrados\nPor favor registra almenos uno antes de mostrar datos.");
                    }
                    break;
                case "0":
                    this.secionActiva = false;
                    despedida();
                    break;
                default:
                    System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles");
                    break;
            }
        }
    }

    public void despedida(){
        System.out.println("Gracias por usar el sistema academico de gestión de cursos!");
        sc.close();
    }
}
