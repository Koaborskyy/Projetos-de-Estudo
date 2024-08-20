public class MinhaClasse {
    public static void main (String[] args) {
       // System.out.print( "Bem vindo ao curso de java bootcamp claro!");

       String primeiroNome = "Octávio";
       String segundoNome = "Diniz";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
