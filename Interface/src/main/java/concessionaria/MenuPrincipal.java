package concessionaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuPrincipal extends JFrame{
    private JButton botaoCadastro;
    private JButton botaoListar;
    private List<Carro> carros;
    private List<Moto> motos;

    public MenuPrincipal(List<Carro> carros, List<Moto> motos){
        this.carros = carros;
        this.motos = motos;

        setTitle("Menu Veículos");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelMenu = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        botaoCadastro = new JButton("Mostrar veículos");
        botaoCadastro.addActionListener(e-> botaoIrLista());
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 0;
        painelMenu.add(botaoCadastro, constraints);

        botaoListar = new JButton("Cadastrar um novo veículo");
        botaoListar.addActionListener(e-> botaoIrCadastro());
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenu.add(botaoListar, constraints);

        add(painelMenu);
        setLocationRelativeTo(null);
    }
    public void botaoIrCadastro(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            MenuCadastro janela = new MenuCadastro(carros, motos);
            janela.setVisible(true);
        });
    }
    public void botaoIrLista(){
        this.setVisible(false);
        javax.swing.SwingUtilities.invokeLater(()->{
            MenuLista janela = new MenuLista(carros, motos);
            janela.setVisible(true);
        });
    }

}
