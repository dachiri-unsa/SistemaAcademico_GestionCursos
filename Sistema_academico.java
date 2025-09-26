public class Sistema_academico {
    public static void main(String []args) {
        Sistema sistema = new Sistema();
        char continuar = sistema.bienvenida();
        if (continuar == 's' || continuar == 'S') {
            sistema.iniciar();
        } else {
            sistema.despedida();
        }
    }
}