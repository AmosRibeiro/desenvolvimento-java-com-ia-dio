package equipamentos.multifuncional;

import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.Digitalizadora;
import equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("Copiando pela MULTI.");
    }
    public void digitalizar(){
        System.out.println("Digitalizando pela MULTI.");
    }
    public void imprimir(){
        System.out.println("Imprimindo pela MULTI.");
    }
}
