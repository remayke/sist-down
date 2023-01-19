package sistdown.action.actions;
import sistdown.service.LogsDownloads;
import sistdown.service.Util;


/**
 * Faz o print na tela dos textos de inicialização.      <p>
 * Printa a logo de inicio ou a logo de reinicializacao,
 * bem como também printa os trechos que foram baixados.
 */
public class PrintaInicio implements Acao {
    
    
    public void executa() throws Exception {
        if (Util.verificaSeEhAPrimeiraVezRodandoOPrograma()) {
            System.out.println("");
            System.out.println(" SISTDOWN: " + Util.getVersion());
        }
        LogsDownloads.printaTrechosQueEstaoNaMaquinaLocal();
        System.out.print(" FLY-now> ");
    }



}
