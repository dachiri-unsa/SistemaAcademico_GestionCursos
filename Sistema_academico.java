import java.util.*;
public class Sistema_academico {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> lista_alumnos = new ArrayList<Alumno>();
        ArrayList<Docente> lista_docentes = new ArrayList<Docente>();
        ArrayList<Curso> lista_cursos = new ArrayList<Curso>();

        System.out.println("¡Bienvenido a sistema academico de gestión de cursos!");
        boolean bucle = true;
        while(bucle){
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Ingresar datos\n2) Mostrar base de datos\n3) Matricular alumno en curso\n4) Registrar notas de alumno\n5) Calcular promedio final de un alumno\n6) Mostrar estadisticas de alumnos\n0) Cerrar");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                System.out.println("----------------------------------------------------------");
                System.out.println("Tipo de dato a ingresar:\n1) Alumno\n2) Docente\n3) Cursos\n0) Volver");
                String opcion_1 = sc.nextLine();
                    switch (opcion_1) {
                        case "1":
                            lista_alumnos.add(new Alumno(sc));
                            break;
                        case "2":
                            lista_docentes.add(new Docente(sc));
                            break;
                        case "3":
                            if (lista_docentes.isEmpty() == false){
                                lista_cursos.add(new Curso(sc, lista_docentes));
                            }
                            else {
                                System.out.println("Aun no tienes docentes registrados.\nPor favor registra almenos uno antes de asignarle un curso.");
                            }
                            break;
                        case "0":
                            break;
                        default:
                            System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles");
                            break;
                    }
                    break;
                case "2":
                System.out.println("Lista de datos que quiere ver:\n1) Alumno\n2) Docente\n3) Cursos\n0) Volver");
                String opcion_2 = sc.nextLine();
                    switch (opcion_2) {
                        case "1":
                            Alumno.mostrarAlumnos(lista_alumnos);
                            break;
                        case "2":
                            Docente.mostrarDocentes(lista_docentes);
                            break;
                        case "3":
                            Curso.mostrarCursos(lista_cursos);
                            break;
                        case "0":
                            break;
                        default:
                            System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles");
                            break;
                    }
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "0":
                    bucle = false;
                    break;
                default:
                    System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles");
                    break;
            }
            System.out.println("----------------------------------------------------------");
        }
        System.out.println("Gracias por usar el sistema academico de gestión de cursos!");
        sc.close();
    }
}