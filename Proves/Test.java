public class Test{
    public static void main(String[] args) {
        float v1;
        float v2;

        System.out.println("Introdueix el primer número: ");
        v1 = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix el segon número: ");
        v2 = Float.parseFloat(System.console().readLine());

        System.out.println("El resultat de sumar "+(int)v1+" i "+(int)v2+" és "+(int)(v1+v2));
        System.out.println("El resultat de restar "+v1+" i "+v2+" és "+(v1-v2));
        System.out.println("El resultat de multiplicar "+v1+" i "+v2+" és "+(v1*v2));
        System.out.println("El resultat de dividir "+v1+" i "+v2+" és "+(v1/v2));
    }
}

//Per a instroduir números posarem "Float.parseFloat()".
//Si no volem introduir-ne, posarem "System.console().readLine()".
//Per a treure els decimals en java posarem (int) davant de la variable.