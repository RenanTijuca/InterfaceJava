package concessionaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuLista extends JFrame{
    private JButton botaoVoltar;
    private JButton botaoListarMoto;
    private JButton botaoListarCarro;
    private JButton botaoListarCarroMoto;
    private List<Carro> carros;
    private List<Moto> motos;

    public MenuLista(List<Carro> carros, List<Moto> motos){
        this.carros = carros;
        this.motos = motos;

        setTitle("Menu Lista");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelMenuLista = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        botaoListarCarro = new JButton("Lista de Carros");
        botaoListarCarro.addActionListener(e -> botaoIrListaCarro());
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenuLista.add(botaoListarCarro, constraints);

        botaoListarMoto = new JButton("Lista de Motos");
        botaoListarMoto.addActionListener(e -> botaoIrListaMoto());
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenuLista.add(botaoListarMoto, constraints);

        botaoListarCarroMoto = new JButton("Lista de todos os veículo");
        botaoListarCarroMoto.addActionListener(e -> botaoIrListaCarroMoto());
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenuLista.add(botaoListarCarroMoto, constraints);


        botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e-> botaoVoltar());
        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenuLista.add(botaoVoltar, constraints);

        add(painelMenuLista);
        setLocationRelativeTo(null);

    }
    public void botaoIrListaCarro(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            ListaVeiculo janela = new ListaVeiculo(carros, motos, true, false);
            janela.setVisible(true);
        });
    }
    public void botaoIrListaMoto(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            ListaVeiculo janela = new ListaVeiculo(carros, motos, false, true);
            janela.setVisible(true);
        });
    }
    public void botaoIrListaCarroMoto(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            ListaVeiculo janela = new ListaVeiculo(carros, motos, true, true);
            janela.setVisible(true);
        });
    }
    public void botaoVoltar(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            MenuPrincipal janela = new MenuPrincipal(carros, motos);
            janela.setVisible(true);
        });
    }
}
