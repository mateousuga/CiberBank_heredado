public class TestFuncionario {
    public static void main(String[] args) {
        // Funcionario sergio = new Funcionario();
        Gerente gerente = new Gerente();

        gerente.setSalario(1500);
        gerente.setClave("clave");
        gerente.setTipo(1);

        System.out.println(gerente.getSalario());
        System.out.println(gerente.iniciarSesion("clave"));
    }
}
