public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;

        numero = - numero;
        System.out.println(numero);

        // numero = + numero; não funciona pois o sinal de + vai fazer a concatenação e teria que fazer conforme abaixo multiplicando por -1
        numero = numero * -1;
        System.out.println(numero);
    

    }
}
