public class Vendedor {
    private String nombre;
    private int horasSemanales;
    private double salarioMensual;
    private double ventasDelTurno;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.horasSemanales = 30;
        this.salarioMensual = 1200.00;
        this.ventasDelTurno = 0.0;
    }

    public void escanearArticulo(Zapatillas articulo) {
        double precio = articulo.getPrecio();
        this.ventasDelTurno = this.ventasDelTurno + precio;

        System.out.println(this.nombre + "ha escaneado unas" + articulo.getMarca()+ "por" + precio + "€");
    }
    public void hacerCierreDeCaja() {
        System.out.println("Cierre de turno. Total vendidopor"+ this.nombre + ":" +this.ventasDelTurno + "€");
    }
}
