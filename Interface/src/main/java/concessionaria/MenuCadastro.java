package concessionaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuCadastro extends JFrame{
    private JButton botaoCadastroCarro;
    private JButton botaoCadastroMoto;
    private JButton botaoVoltar;

    private List<Carro> carros;
    private List<Moto> motos;

    public MenuCadastro(List<Carro> carros, List<Moto> motos){
        this.carros = carros;
        this.motos = motos;
        setTitle("Menu Cadastro");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelMenu = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        botaoCadastroCarro = new JButton("Cadastrar um novo carro");
        botaoCadastroCarro.addActionListener(e-> botaoIrCadastroCarro());
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 0;
        painelMenu.add(botaoCadastroCarro, constraints);

        botaoCadastroMoto = new JButton("Cadastrar uma nova moto");
        botaoCadastroMoto.addActionListener(e-> botaoIrCadastroMoto());
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenu.add(botaoCadastroMoto, constraints);

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e-> botaoIrMenuPrincipal());
        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 5;
        painelMenu.add(botaoVoltar, constraints);

        add(painelMenu);
        setLocationRelativeTo(null);
    }



    public void botaoIrCadastroCarro(){
        this.setVisible(false);
        SwingUtilities.invokeLater(()->{
            TelaCadastroCarro janela = new TelaCadastroCarro(carros, motos);
            janela.setVisible(true);
        });

    }
    public void botaoIrCadastroMoto(){
        this.setVisible(false);
        SwingUtilities.invokeLater(()->{
            TelaCadastroMoto janela = new TelaCadastroMoto(carros, motos);
            janela.setVisible(true);
        });
    }
    public void botaoIrMenuPrincipal(){
        this.setVisible(false);
        SwingUtilities.invokeLater(()->{
            MenuPrincipal janela = new MenuPrincipal(carros, motos);
            janela.setVisible(true);
        });
    }
}
