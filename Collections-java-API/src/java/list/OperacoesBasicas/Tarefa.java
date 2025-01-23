package java.list.OperacoesBasicas;

import java.lang.reflect.Constructor;

public class Tarefa {
    //atributo

    private String descricao;

  @Override
    public String toString() {
        
        return "Tarefa{" + "descricao='" + descricao + '\'' + '}';
    }

public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
      return descricao;
  }
}
