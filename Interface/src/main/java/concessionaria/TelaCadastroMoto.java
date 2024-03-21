package concessionaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaCadastroMoto extends JFrame{
    private JTextField campoMarca;
    private JTextField campoNome;
    private JTextField campoCor;
    private JTextField campoMotor;
    private JTextField campoCilindradas;
    private JCheckBox campoTemCarenagemSim;
    private JCheckBox campoTemCarenagemNao;

    private JButton botaoCadastrar;
    private JButton botaoCancelar;
    private List<Carro> carros;
    private List<Moto> motos;


    public TelaCadastroMoto(List<Carro> carros, List<Moto> motos){
        this.carros = carros;
        this.motos = motos;
        setTitle("Menu botaoCadastrar");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel TelaCadastroCarro = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel labelNome = new JLabel("Digite o modelo da moto:");
        constraints.gridy = 0;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelNome, constraints);

        campoNome = new JTextField(20);
        constraints.gridy = 1;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoNome, constraints);

        JLabel labelMarca = new JLabel("Digite a marca da moto:");
        constraints.gridy = 2;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelMarca, constraints);

        campoMarca = new JTextField(20);
        constraints.gridy = 3;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoMarca, constraints);

        JLabel labelCor = new JLabel("Digite a cor da moto:");
        constraints.gridy = 4;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelCor, constraints);

        campoCor = new JTextField(20);
        constraints.gridy = 5;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoCor, constraints);

        JLabel labelMotor = new JLabel("Digite o tipo do motor da moto:");
        constraints.gridy = 6;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelMotor, constraints);

        campoMotor = new JTextField(20);
        constraints.gridy = 7;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoMotor, constraints);

        JLabel labelCilindradas = new JLabel("Digite a quantidade de cilindradas da moto:");
        constraints.gridy = 8;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelCilindradas, constraints);

        campoCilindradas = new JTextField(20);
        constraints.gridy = 9;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoCilindradas, constraints);


        JLabel labelCarenagem = new JLabel("O Carro possui carenagem?");
        constraints.gridy = 10;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelCarenagem, constraints);

        campoTemCarenagemSim = new JCheckBox("Sim");
        constraints.gridy = 11;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoTemCarenagemSim, constraints);
        campoTemCarenagemNao = new JCheckBox("Nao");
        constraints.gridy = 11;
        constraints.gridx = 1;
        TelaCadastroCarro.add(campoTemCarenagemNao, constraints);


        botaoCadastrar = new JButton("Cadastrar um novo carro");
        botaoCadastrar.addActionListener(e-> botaoCadastrarCarro());
        constraints.gridy = 12;
        constraints.gridx = 0;
        constraints.gridwidth = 0;
        TelaCadastroCarro.add(botaoCadastrar, constraints);

        botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(e-> botaoCancelarOperacao());
        constraints.gridy = 12;
        constraints.gridx = 5;
        constraints.gridwidth = 5;
        TelaCadastroCarro.add(botaoCancelar, constraints);

        add(TelaCadastroCarro);
        setLocationRelativeTo(null);
    }
    public void botaoCadastrarCarro(){
        var moto = new Moto();
        moto.setNome(campoNome.getText());
        moto.setMarca(campoMarca.getText());
        moto.setCor(campoCor.getText());
        moto.setMotor(campoMotor.getText());
        moto.setCilindradas(Integer.valueOf(campoCilindradas.getText()));
        if (campoTemCarenagemSim.isSelected()){
            moto.setCarenagem(true);
        } else {
            moto.setCarenagem(false);
        }

        motos.add(moto);
        this.setVisible(false);
        SwingUtilities.invokeLater(()->{
            MenuPrincipal janela = new MenuPrincipal(carros, motos);
            janela.setVisible(true);
        });
    }
    public void botaoCancelarOperacao(){
        this.setVisible(false);
        SwingUtilities.invokeLater(()->{
            MenuPrincipal janela = new MenuPrincipal(carros, motos);
            janela.setVisible(true);
        });
    }
}
