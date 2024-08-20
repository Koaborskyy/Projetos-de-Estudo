public class TiposVariaveis {

    public static void main(String[] args) {

        double salarioMinimo = 2500;

        String meuNome = "Octávio Diniz";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; java ele tem seus tipos pré-definidos
        short numeroCurto3 = (short)numeroNormal;
        System.out.println(numeroCurto3);

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);
    }
    
}
