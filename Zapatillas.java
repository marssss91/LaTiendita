public class Zapatillas {
   private String marca;
   private double precio;

   public Zapatillas(String marca, double precio) {
      this.marca = marca;
      this.precio = precio;
   }
   public double getPrecio() {
      return this.precio;

   }
   public String getMarca() {
      return this.marca;
   }
}