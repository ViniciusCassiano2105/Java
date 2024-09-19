package br.com.imperial_flix_menu;

import br.com.imperial_flix_io.LeitorArquivo;
import br.com.imperial_flix_principal.Principal;

public class Menu {

    public static void main(String[] args) throws InterruptedException {

        LeitorArquivo.leitor("Relatorio");
        Principal menu = new Principal();
        menu.menu();
    }
}
