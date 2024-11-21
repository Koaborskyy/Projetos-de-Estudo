package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}
