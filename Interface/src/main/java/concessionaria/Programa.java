package concessionaria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Programa extends JFrame{
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();

        javax.swing.SwingUtilities.invokeLater(()->{
            MenuPrincipal janela = new MenuPrincipal(carros, motos);
            janela.setVisible(true);
        });
        carros.forEach(System.out::println);
    }
}
