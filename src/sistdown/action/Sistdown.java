package sistdown.action;
import java.util.ArrayList;
import java.util.List;
import sistdown.action.actions.Acao;
import sistdown.action.actions.Atualizacao;
import sistdown.action.actions.Autorizacao;
import sistdown.action.actions.Fim;
import sistdown.action.actions.HandleDownload;
import sistdown.action.actions.HandleHelp;
import sistdown.action.actions.HandleLimpa;
import sistdown.action.actions.Inicializacao;
import sistdown.action.actions.PrintaInicio;
import sistdown.action.actions.Prompt;


/**
 * Função principal que faz a inicialização do <b>Sist-down</b>.<p>
 * Para iniciar o sistema basta rodar o método estático <code>iniciar()</code>
 */
public class Sistdown {

    /** Lista com as ações executadas pelo sistema. */
    private static List<Acao> acoes = new ArrayList<>();
    
    
    /** Cria o encademaneto das ações. */
    static {
        acoes.add(new Atualizacao());
        acoes.add(new Inicializacao());
        acoes.add(new Autorizacao());
        acoes.add(new PrintaInicio());
        acoes.add(new Prompt());
        acoes.add(new HandleHelp());
        acoes.add(new HandleLimpa());
        acoes.add(new HandleDownload());
        acoes.add(new Fim());
    }



    /**
     * Inicia um loop com a chamada dos metodos que fazem o sistema funcionar.     <p>
     * Funciona utilizando os padrões: (i) Chain of Responsability e (ii) Strategy.
     */
    public static void inicia() {
        try {
            while (true) {
                for (Acao acao : acoes)
                    acao.executa();
            }
        } catch (Exception e) {
            System.out.println("\n\n");
            e.printStackTrace();
            System.out.println(" * Problema com o Sistdown. Favor, avisar o vitão.\n\n");
        }
    }

}
