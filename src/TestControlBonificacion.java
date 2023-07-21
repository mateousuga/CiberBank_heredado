public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(3000);

        Gerente laidy = new Gerente();
        laidy.setSalario(5000);

        Contador juan = new Contador();
        juan.setSalario(6000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(laidy);
        controlBonificacion.registrarSalario(juan);
    }
}
