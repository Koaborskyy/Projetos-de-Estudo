package iphone;

import sistema.navegador.Aba;
import sistema.navegador.Atualizando;
import sistema.navegador.Atualizar;
import sistema.navegador.Navegando;
import sistema.navegador.Navegar;
import sistema.navegador.NovaAba;
import sistema.reprodutor_musical.Pausando;
import sistema.reprodutor_musical.Pausar;
import sistema.reprodutor_musical.Selecionando;
import sistema.reprodutor_musical.Tocando;
import sistema.reprodutor_musical.Tocar;
import sistema.telefone.Atendendo;
import sistema.telefone.Atender;
import sistema.telefone.Correio;
import sistema.telefone.Correiovoz;
import sistema.telefone.Ligacao;
import sistema.telefone.Ligar;

public class InterfaceUsuario {
    public static void main(String[] args) {
        //Player de musica
        Pausar pausando = new Pausando();
        Tocar tocando = new Tocando();
        Selecionando selecao = new Selecionando();

        tocando.tocar();
        pausando.pausar();
        selecao.selecionarMusica();
        
        //Navegador
        Navegar navegando = new Navegando();
        Atualizar atualizando = new Atualizando();
        Aba novaAba = new NovaAba();


        navegando.exibirPagina();
        atualizando.atualizarPagina();
        novaAba.adicionarNovaAba();

        //Sistema de Telefone
        Atender antendendo = new Atendendo();
        Ligar ligacao = new Ligacao();
        Correio correio = new Correiovoz();

        antendendo.atender();
        ligacao.ligar();
        correio.iniciarCorreioVoz();
    }
}
