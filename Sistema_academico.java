import java.util.*;
public class Sistema_academico {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> lista_alumnos = new ArrayList<Alumno>();
        int contador_codigo= 1;
        ArrayList<Docente> lista_docente = new ArrayList<Docente>();
        System.out.println("¡Bienvenido a sistema academico de gestión de cursos!");
        boolean bucle = true;
        while(bucle){
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Ingresar datos\n2) Mostrar base de datos\n3) Matricular alumno en curso\n4) Registrar notas de alumno\n5) Calcular promedio final de un alumno\n6) Mostrar estadisticas de alumnos\n0) Cerrar");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                System.out.println("Tipo de dato a ingresar:\n1) Alumno\n2) Docente\n3) Cursos\n0) Volver");
                String opcion_1 = sc.nextLine();
                    switch (opcion_1) {
                        case "1":
                            lista_alumnos.add(new Alumno(sc, contador_codigo));
                            contador_codigo++;
                            break;
                        case "2":
                            lista_docente.add(new Docente(sc));
                            break;
                        case "3":

                            break;
                        case "0":
                            break;
                        default:
                            System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles");
                            break;
                    }
                    break;
                case "2":

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
        }
        System.out.println("Gracias por usar el sistema academico de gestión de cursos!");
        sc.close();
    }
}