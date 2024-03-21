package concessionaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaCadastroCarro extends JFrame{
    private JTextField campoMarca;
    private JTextField campoNome;
    private JTextField campoCor;
    private JTextField campoMotor;
    private JTextField campoPorta;
    private JTextField campoCambio;
    private JCheckBox campoTemAlarmeSim;
    private JCheckBox campoTemAlarmeNao;
    private JCheckBox campoTemTurboSim;
    private JCheckBox campoTemTurboNao;
    private JButton botaoCadastrar;
    private JButton botaoCancelar;
    private List<Carro> carros;
    private List<Moto> motos;


    public TelaCadastroCarro(List<Carro> carros, List<Moto> motos){
        this.carros = carros;
        this.motos = motos;
        setTitle("Menu botaoCadastrar");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel TelaCadastroCarro = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel labelNome = new JLabel("Digite o modelo do Carro:");
        constraints.gridy = 0;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelNome, constraints);

        campoNome = new JTextField(20);
        constraints.gridy = 1;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoNome, constraints);

        JLabel labelMarca = new JLabel("Digite a marca do Carro:");
        constraints.gridy = 2;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelMarca, constraints);

        campoMarca = new JTextField(20);
        constraints.gridy = 3;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoMarca, constraints);

        JLabel labelCor = new JLabel("Digite a cor do Carro:");
        constraints.gridy = 4;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelCor, constraints);

        campoCor = new JTextField(20);
        constraints.gridy = 5;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoCor, constraints);

        JLabel labelMotor = new JLabel("Digite o tipo do motor do Carro:");
        constraints.gridy = 6;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelMotor, constraints);

        campoMotor = new JTextField(20);
        constraints.gridy = 7;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoMotor, constraints);

        JLabel labelPorta = new JLabel("Digite a quantidade de portas do Carro:");
        constraints.gridy = 8;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelPorta, constraints);

        campoPorta = new JTextField(20);
        constraints.gridy = 9;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoPorta, constraints);

        JLabel labelCambio = new JLabel("Digite o tipo de câmbio do Carro:");
        constraints.gridy = 10;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelCambio, constraints);

        campoCambio = new JTextField(20);
        constraints.gridy = 11;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoCambio, constraints);

        JLabel labelAlarme = new JLabel("O Carro possui alarme?");
        constraints.gridy = 12;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelAlarme, constraints);

        campoTemAlarmeSim = new JCheckBox("Sim");
        constraints.gridy = 13;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoTemAlarmeSim, constraints);
        campoTemAlarmeNao = new JCheckBox("Nao");
        constraints.gridy = 13;
        constraints.gridx = 1;
        TelaCadastroCarro.add(campoTemAlarmeNao, constraints);

        JLabel labelTurbo = new JLabel("O Carro possui turbo?");
        constraints.gridy = 14;
        constraints.gridx = 0;
        TelaCadastroCarro.add(labelTurbo, constraints);

        campoTemTurboSim = new JCheckBox("Sim");
        constraints.gridy = 15;
        constraints.gridx = 0;
        TelaCadastroCarro.add(campoTemTurboSim, constraints);
        campoTemTurboNao = new JCheckBox("Nao");
        constraints.gridy = 15;
        constraints.gridx = 1;
        TelaCadastroCarro.add(campoTemTurboNao, constraints);

        botaoCadastrar = new JButton("Cadastrar um novo carro");
        botaoCadastrar.addActionListener(e-> botaoCadastrarCarro());
        constraints.gridy = 16;
        constraints.gridx = 0;
        constraints.gridwidth = 0;
        TelaCadastroCarro.add(botaoCadastrar, constraints);

        botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(e-> botaoCancelarOperacao());
        constraints.gridy = 17;
        constraints.gridx = 5;
        constraints.gridwidth = 5;
        TelaCadastroCarro.add(botaoCancelar, constraints);

        add(TelaCadastroCarro);
        setLocationRelativeTo(null);
    }
    public void botaoCadastrarCarro(){
        var carro = new Carro();
        carro.setNome(campoNome.getText());
        carro.setMarca(campoMarca.getText());
        carro.setCor(campoCor.getText());
        carro.setMotor(campoMotor.getText());
        carro.setPortas(Integer.valueOf(campoPorta.getText()));
        carro.setCambio(campoCambio.getText());
        if (campoTemAlarmeSim.isSelected()){
            carro.setAlarme(true);
        } else {
            carro.setAlarme(false);
        }
        if (campoTemTurboSim.isSelected()){
            carro.setTurbo(true);
        } else {
            carro.setTurbo(false);
        }

        carros.add(carro);
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
