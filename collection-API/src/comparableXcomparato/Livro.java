package comparableXcomparato;

import java.util.Comparator;

class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;


    //Contrutor
     public Livro(String ti, String au, int an) {
         this.titulo = ti;
         this.autor = au;
         this.ano = an;
     }

     //usando para ordenar livros por ano
    public int compareTo(Livro 1){
         return titulo.compareTo(1.titulo);
    }

    //Getters para acessar os dados privados
    public String getTitulo(){
         return titulo;

    }
    public String getAutor(){
         return autor;
    }

    public int getAno(){
         return ano;
    }
}

//Classe para comparar livro por autor
class CompararAutor implements Comparator<Livro> {
    public int compare(Livro 11, Livro 12){
        return Integer.compare(11.getAno(), 12.getAno());
        /*
        if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
         */
    }
}
class CompararAnoAutorTitulo implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0)
            return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0)
            return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}