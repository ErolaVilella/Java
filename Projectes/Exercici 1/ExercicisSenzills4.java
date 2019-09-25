import java.text.DecimalFormat;

public class ExercicisSenzills4{
    public static void main(String[] args) {

    String article;
    float preu;
    float desc;
    float total;

    System.out.println("Introdueix el nom de l'article:");
    article = System.console().readLine();

    System.out.println("Introdueix el preu original (€)");
    preu = Float.parseFloat(System.console().readLine());

    System.out.println("Introdueix el descompte a aplicar (%)");
    desc = Float.parseFloat(System.console().readLine());

    total=preu-((desc*preu)/100);


        DecimalFormat format = new DecimalFormat("####.##");

        System.out.println("El preu final de l'article "+article+" és de "+format.format(total)+"€");

    }
}    