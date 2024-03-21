package concessionaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ListaVeiculo extends JFrame {
    private int index = 0;
    private JButton botaoVoltar;
    private boolean carroExibir;
    private boolean motoExibir;
    private List<Carro> carros;
    private List<Moto> motos;

    public ListaVeiculo(List<Carro> carros, List<Moto> motos, boolean carroExibir, boolean motoExibir){
        this.carros = carros;
        this.motos = motos;

        setTitle("Lista Carro");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelListaVeiculos = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        if (carroExibir) {
            if (this.carros.size() != 0) {
                for (int i = index; i < this.carros.size(); i++) {
                    JLabel labelCarro = new JLabel(String.valueOf(this.carros.get(i)));
                    constraints.gridy = i;
                    constraints.gridx = 0;
                    painelListaVeiculos.add(labelCarro, constraints);
                    if (i == this.carros.size() - 1){
                        index = i + 1;
                    }
                }
            } else {
                JLabel labelCarro = new JLabel("Não existem carros cadastrados");
                constraints.gridy = index;
                constraints.gridx = 0;
                painelListaVeiculos.add(labelCarro, constraints);
                index += 1;
            }
        }
        if (motoExibir) {
            if (this.motos.size() != 0) {
                for (int i = index; i < this.motos.size() + index; i++) {
                    System.out.println(i);
                    JLabel labelMoto = new JLabel(String.valueOf(this.motos.get(i - index)));
                    constraints.gridy = i;
                    constraints.gridx = 0;
                    painelListaVeiculos.add(labelMoto, constraints);
                    if (i == this.motos.size() - 1 + index){
                        index = i + 1;
                        break;
                    }
                }
            } else {
                JLabel labelMoto = new JLabel("Não existem Motos cadastradas");
                constraints.gridy = index;
                constraints.gridx = 0;
                painelListaVeiculos.add(labelMoto, constraints);
                index += 1;
            }
        }

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e-> botaoVoltar());
        constraints.gridy = index;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelListaVeiculos.add(botaoVoltar, constraints);

        add(painelListaVeiculos);
        setLocationRelativeTo(null);
    }

    public void botaoVoltar(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            MenuLista janela = new MenuLista(carros, motos);
            janela.setVisible(true);
        });
    }
}
