import java.text.DecimalFormat;

public class ExercicisSenzills6{
    public static void main(String[] args) {

    String ja;
    String frase;
    long temps1;
    long temps2;
    long total;

    DecimalFormat format = new DecimalFormat("00.00");

    System.out.println("Escriu 'Comença' per a que el cronòmetre començi a contar.");
    System.out.println("Has d'escriure el següent: 'Setze jutges d'un jutgat mengen fetge en un penjat'.");

    ja = System.console().readLine();

    
    if (ja.equals("Comença")){
    temps1 = System.currentTimeMillis();
    System.out.println("Escriu-ho!");
    frase = System.console().readLine();
        if (frase.equals("Setze jutges d'un jutgat mengen fetge en un penjat")){
        temps2 = System.currentTimeMillis();
        total=temps2-temps1;
        System.out.println("Has tardat "+format.format((float)total/1000)+" en escriure-ho!");
        }
    else {
    System.out.println("No s'ha pogut calcular.");
         }
    }
    }
}
