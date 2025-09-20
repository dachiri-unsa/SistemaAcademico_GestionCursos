import java.util.*;
public class Sistema_academico {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        boolean bucle = true;
        System.out.println("¡Bienvenido a sistema academico de gestión de cursos!");
        while(bucle){
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Ingresar datos\n2) Mostrar base de datos\n3) Matricular alumno en curso\n4) Registrar notas de alumno\n5) Calcular promedio final de un alumno\n6) Mostrar estadisticas de alumnos\n0) Cerrar");
            try{
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("Dato ingresado no valido. Ingrese una de las opciones disponibles");
                    break;
                default:
                    break;
            }
            }
            catch (InputMismatchException r){
                sc.nextLine();
                System.out.println("Dato ingresado no valido. ¡Solo se permiten numeros!");
            }
        }
        System.out.println("Gracias por usar el sistema academico de gestión de cursos!");
        sc.close();
    }
}