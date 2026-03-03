

import java.util.Scanner;

public class Metodos {

    Scanner teclado = new Scanner(System.in);

    public Vendedor[] registrarVendedores() {

        Vendedor[] vendedores = new Vendedor[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Nombre del vendedor " + (i + 1) + ": ");
            String nombre = teclado.nextLine();

            vendedores[i] = new Vendedor(nombre);

            System.out.println("Ingrese ventas de los 12 meses:");

            for (int j = 0; j < 12; j++) {

                System.out.print("Mes " + (j + 1) + ": ");
                double venta = Double.parseDouble(teclado.nextLine());

                vendedores[i].setVenta(j, venta);
            }
        }

        return vendedores;
    }

    public void calcularMejorVendedor(Vendedor[] vendedores) {

        double mayor = 0;
        int posicion = 0;

        for (int i = 0; i < vendedores.length; i++) {

            double total = vendedores[i].calcularTotalAnual();

            System.out.println("Total anual de " + vendedores[i].getNombre() + ": " + total);

            if (i == 0 || total > mayor) {
                mayor = total;
                posicion = i;
            }
        }

        System.out.println("\nEl vendedor que más vendió fue:");
        System.out.println("Nombre: " + vendedores[posicion].getNombre());
        System.out.println("Total anual: " + mayor);
    }
}
