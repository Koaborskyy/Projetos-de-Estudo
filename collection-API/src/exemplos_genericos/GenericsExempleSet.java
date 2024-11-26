package exemplos_genericos;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        //Exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);


        //exemplo com Generics
        Set<String> conjuntoComGenerics = new HashSet<>();
        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");

        //Interando sobre o conjunto com Generics
        for (String elemento: conjuntoComGenerics){
            System.out.println(elemento);
        }

        //Interando sobre conjunto sem Generics
        for (Object elemento: conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
