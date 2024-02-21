import java.net.spi.InetAddressResolver;

//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato
// calcolaArea().Crea poi due sottoclassi Rettangolo e Triangolo che implementano
// Forma ed implementano il metodo per il calcolo dell'area.
public class Main {
    public static void main(String[] args) {
        RectangleArea rectangleForm = new RectangleArea(5, 5);
        TriangleArea triangleForm = new TriangleArea(10, 4);
        TrapezoidArea trapezoidForm = new TrapezoidArea(23, 3);
        System.out.println("The area of the rectangleForm si : " + rectangleForm.calculateAreaMethode());
        System.out.println("The area of the triangleForm si : " + triangleForm.calculateAreaMethode());
        System.out.println("The area of the trapezoidForm si : " + trapezoidForm.calculateAreaMethode());
    }
}
