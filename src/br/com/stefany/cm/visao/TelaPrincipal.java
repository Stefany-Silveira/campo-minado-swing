package br.com.stefany.cm.visao;

import br.com.stefany.cm.modelo.Tabuleiro;

import javax.swing.*;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 35);
        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
