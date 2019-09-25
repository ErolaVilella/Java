import java.text.DecimalFormat;

public class Calc{
    public static void main(String[] args) {
        final float primer = 2;
        final float segon = 4;

        float resultatSuma;
        resultatSuma=primer+segon;

        float resultatResta;
        resultatResta=primer-segon;

        float resultatDivisio;
        resultatDivisio=primer/segon;

        float resultatMult;
        resultatMult=primer*segon;



        System.out.println("La Suma entre "+primer+" i "+segon+" dóna "+resultatSuma);
        System.out.println("La Resta entre "+primer+" i "+segon+" dóna "+resultatResta);
        System.out.println("La Divisió entre "+primer+" i "+segon+" dóna "+resultatDivisio);
        System.out.println("La Multiplicació entre "+primer+" i "+segon+" dóna "+resultatMult);

    }
}