public class TestGerente {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalario(2000);
        gerente.setTipo(1);
        System.out.println(gerente.getSalario());
    }
}
