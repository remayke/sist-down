package sistdown.action.actions;
import sistdown.service.Util;


/**
 * Classe que finaliza o ciclo das ações, preparando o Sistema para ser reiniciado automicamente. <p>
 */
public class Fim implements Acao {

    
    public void executa() throws Exception {
        Util.inicializacoes.incrementAndGet();
        System.out.println("\n\n\n\n\n\n\n");
    }
    
}
