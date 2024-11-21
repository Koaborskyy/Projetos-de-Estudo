package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional  implements Digitalizadora, Copiadora, Impressora{
    public void copiar(){
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }
    
    public void imprimir(){
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
    }
    
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
    }
}
