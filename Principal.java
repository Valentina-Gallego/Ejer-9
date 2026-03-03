

public class Principal {

    public static void main(String[] args) {

        Metodos m = new Metodos();

        Vendedor[] vendedores = m.registrarVendedores();

        m.calcularMejorVendedor(vendedores);
    }
}
