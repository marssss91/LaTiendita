public class TiendaMain {
    public static void main(String [] args) {
        Zapatillas miSamba = new Zapatillas("adidas", 120.00);
        Zapatillas tiger = new Zapatillas ("Onitsuka", 95.00);

        Vendedor dependienta = new Vendedor ("Mariam");

        System.out.println("========HOLA HOLA========");

        dependienta.escanearArticulo(miSamba);
        dependienta.escanearArticulo(tiger);

        System.out.println("=======CERRANDO LA TEINDA========");
        dependienta.hacerCierreDeCaja();


    }
}