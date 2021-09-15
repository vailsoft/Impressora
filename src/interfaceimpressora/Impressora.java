package interfaceimpressora;

public abstract class Impressora {
    public static Imprimivel[] lista = new Imprimivel[3];

    public static void adicionarImprimivel(Imprimivel umImprimivel) {
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                lista[i] = umImprimivel;
                break;
            }
        }
    }

    public static void imprimirTudo() {
        for (Imprimivel imprimivel : lista) {
            if (imprimivel == null) {
                break;
            } else {
                imprimivel.imprimir();
            }
        }
    }
}
