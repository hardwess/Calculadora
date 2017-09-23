package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Control {
	
	private JTextField Painel = new JTextField();
	private JButton AdicaoButton = new JButton("+");
	private JButton SubtracaoButton = new JButton("-");
	private JButton DivisaoButton = new JButton("/");
	private JButton MultiplicacaoButton = new JButton("*");
	private JButton IgualButton = new JButton("=");
	private JButton CEButton = new JButton("CE");
	private JButton UmButton = new JButton("1");
	private JButton DoisButton = new JButton("2");
	private JButton TresButton = new JButton("3");
	private JButton QuatroButton = new JButton("4");
	private JButton CincoButton = new JButton("5");
	private JButton SeisButton = new JButton("6");
	private JButton SeteButton = new JButton("7");
	private JButton OitoButton = new JButton("8");
	private JButton NoveButton = new JButton("9");
	private JButton ZeroButton = new JButton("0");
	private JButton VirgulaButton = new JButton(",");
	
	public Control() {
		JFrame Janela = new JFrame("Calculadora");
		JPanel LayoutExterno = new JPanel(new BorderLayout());
		JPanel LayoutSuperior = new JPanel(new GridLayout(1, 2, 5, 5));
		JPanel LayoutInferior = new JPanel(new GridLayout(4, 4, 5, 5));
		
		LayoutSuperior.add(Painel);
		LayoutSuperior.add(CEButton);
		LayoutInferior.add(UmButton);
		LayoutInferior.add(DoisButton);
		LayoutInferior.add(TresButton);
		LayoutInferior.add(AdicaoButton);
		LayoutInferior.add(QuatroButton);
		LayoutInferior.add(CincoButton);
		LayoutInferior.add(SeisButton);
		LayoutInferior.add(SubtracaoButton);
		LayoutInferior.add(SeteButton);
		LayoutInferior.add(OitoButton);
		LayoutInferior.add(NoveButton);
		LayoutInferior.add(MultiplicacaoButton);
		LayoutInferior.add(VirgulaButton);
		LayoutInferior.add(ZeroButton);
		LayoutInferior.add(IgualButton);
		LayoutInferior.add(DivisaoButton);
		
		LayoutExterno.add(LayoutSuperior, BorderLayout.NORTH);
		LayoutExterno.add(LayoutInferior, BorderLayout.CENTER);
		Janela.setContentPane(LayoutExterno);
	
		Janela.setSize(200, 250);
		Janela.setVisible(true);
		Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
