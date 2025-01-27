package sistdown.action.actions;
import java.util.Scanner;
import sistdown.model.PromptInputs;


/**
 * Cria na tela um prompt pedindo inputs de:
 * (i)  Trechos para baixar na maquina local,
 * (ii) Tags de funcionalidades que manipulam o Sistdown.
 */
public class Prompt implements Acao {
    

    @SuppressWarnings({ "resource" })
    public void executa() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PromptInputs.adicionaInputs(input);
    }

}