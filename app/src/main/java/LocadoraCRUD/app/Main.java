package LocadoraCRUD.app;

import LocadoraCRUD.app.GUI.TelaPrincipal;
import LocadoraCRUD.lib.ConexaoBanco;

public class Main {
    public static void main(String[] args) {
        ConexaoBanco.iniciarBanco("localhost", "5432", "LocadoraCarros", "postgres", "12345");
        
        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
    }
    
}
