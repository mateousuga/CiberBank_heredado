public class SistemaInterno {
    private String clave = "clave";
    public boolean autentica(Autenticable gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Inicio exitoso");
            return true;
        } else {
            System.out.println("Error en el inicio de sesion");
            return false;
        }
    }
}
