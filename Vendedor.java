

public class Vendedor {

    private String nombre;
    private double[] ventas; // 12 meses

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.ventas = new double[12];
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getVentas() {
        return ventas;
    }

    public void setVenta(int mes, double valor) {
        ventas[mes] = valor;
    }

    public double calcularTotalAnual() {
        double suma = 0;

        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }

        return suma;
    }
}
