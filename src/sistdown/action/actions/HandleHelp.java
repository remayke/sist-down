package sistdown.action.actions;
import sistdown.model.PromptInputs;
import sistdown.service.Caminho;
import sistdown.service.Util;


/**
 * Funcionalidade - Limpa <p>
 * Classe que permite que o usuário limpe os trechos que estão armazenados na maquina local.
 */
public class HandleHelp implements Acao {

    
    public void executa() throws Exception {

        if (PromptInputs.isEmpty()) {
            System.out.println("\n\n\n\n\n\n\n\n\n ");
            System.out.println(" NENHUM COMANDO DIGITADO.");
            System.out.println(" Se precisar de ajuda, digite 'AJUDA' ou 'HELP'   Exemplo:\n  > ajuda");
        }


        if (PromptInputs.foiSolicitadoAjuda()) {
            System.out.println("\n\n");
            System.out.println("==============================================");
            System.out.println(" SISTDOWN");
            System.out.println(" Versão:  " + Util.getSistdownVersion());
            System.out.println(" Server:  " + Util.getAuthenticationIP());
            System.out.println(" Root:    " + Caminho.TARGET_DOWNLOAD);
            System.out.println(" Banco:   " + Caminho.PATH_BANCO);
            System.out.println();
            System.out.println(" COMANDOS:");
            System.out.println(" Para baixar trechos, digite os ids separado por virgula ou espaco. Exemplo:\n   > 1234,1235,1236,1237 1238");
            System.out.println();
            System.out.println(" Para limpar o sist-down, basta digitar 'limpa' Exemplo:\n   > limpa");
            System.out.println();
            System.out.println(" Para limpar e baixar trechos, faça o seguinte:\n   > limpa, 1234, 1235, 1236, 1237");
            System.out.println();
            System.out.println(" Para colocar o sistlev na rede ou na local, siga os seguinte passo a passo:");
            System.out.println("  (i)   Abre a pasta do sistlev : Botao direito no sist-lev: 'Abrir local do arquivo'");
            System.out.println("  (ii)  Edite o arquivo: SistLevEscritorio.exe.config");
            System.out.println("  (iii) Altene [\"raizVideos\" value=] entre  \\\\10.100.10.219\\Videos   ou   D:\\sist-down\\Videos");
        }
    }




}
