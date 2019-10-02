public class Exercici6 {
    public static void main(String[] args) {

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float nota5;
        float examen;
        float mitjana;
        // float seixanta;
        // float notafinal;


        System.out.println("Quina nota vas obtenir a les cinc primeres proves?");
        nota1=Float.parseFloat(System.console().readLine());
        nota2=Float.parseFloat(System.console().readLine());
        nota3=Float.parseFloat(System.console().readLine());
        nota4=Float.parseFloat(System.console().readLine());
        nota5=Float.parseFloat(System.console().readLine());

        System.out.println("I quina nota vas treure a l'examen final?");
        examen=Float.parseFloat(System.console().readLine());

        mitjana=(nota1+nota2+nota3+nota4+nota5)/5;
        // seixanta=examen*(float)0.6;

        // notafinal=quaranta+seixanta;


        System.out.println((mitjana*0.4)+(examen*0.6));



        

    }
}