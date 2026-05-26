import java.util.Scanner;
public class Zapatillas {

 private String marca;
 private String modelo;
 private int talla;
 private double costoFabricacion;

 public Zapatillas(String marca, String modelo, int talla){
    this.marca = marca;
    this.modelo = modelo;
    this.talla = talla;
    this.calcularCostoFabricacion();
 }

 public void setTalla(int nuevaTalla){
      if(nuevaTalla >= 35 && nuevaTalla <= 45){
         this.talla = nuevaTalla;
         System.out.println("Talla actualizada a: " + nuevaTalla);
      } else {
         System.out.println("Talla no valida, ingresa una talla entre 35 y 45");
      }
   }

 private void calcularCostoFabricacion() {
    this.costoFabricacion = 25.50;
 }

 public void mostrarDetalles(){
      System.out.println("Zapatillas: " + marca + " " + modelo + " Talla: " + talla);
 }
 public static void main(String[] args){
    Zapatillas miSamba = new Zapatillas("Adidas", "Samba", 38);
   
   Scanner teclado = new Scanner(System.in);

   System.out.println("Su talla actualmente es:" +miSamba.talla);
   System.out.println("Porfavor ingresa la talla que estas busacando: ");

   int tallaQueBusco = teclado.nextByte();
   miSamba.setTalla(tallaQueBusco);
   teclado.close();

   System.out.println("Detalles de Busqueda:");
   miSamba.mostrarDetalles();
 }
}