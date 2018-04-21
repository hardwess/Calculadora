package boundary;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Boundary implements ActionListener {

	private JTextField painel = new JTextField();
	private JButton adicaoButton = new JButton("+");
	private JButton subtracaoButton = new JButton("-");
	private JButton divisaoButton = new JButton("/");
	private JButton multiplicacaoButton = new JButton("*");
	private JButton igualButton = new JButton("=");
	private JButton cEButton = new JButton("CE");
	private JButton umButton = new JButton("1");
	private JButton doisButton = new JButton("2");
	private JButton tresButton = new JButton("3");
	private JButton quatroButton = new JButton("4");
	private JButton cincoButton = new JButton("5");
	private JButton seisButton = new JButton("6");
	private JButton seteButton = new JButton("7");
	private JButton oitoButton = new JButton("8");
	private JButton noveButton = new JButton("9");
	private JButton zeroButton = new JButton("0");
	private JButton virgulaButton = new JButton(",");

	public Boundary() {
		JFrame janela = new JFrame("Calculadora");
		JPanel layoutExterno = new JPanel(new BorderLayout());
		JPanel layoutSuperior = new JPanel(new GridLayout(1, 2, 5, 5));
		JPanel layoutInferior = new JPanel(new GridLayout(4, 4, 5, 5));

		layoutSuperior.add(painel);
		layoutSuperior.add(cEButton);
		layoutInferior.add(umButton);
		layoutInferior.add(doisButton);
		layoutInferior.add(tresButton);
		layoutInferior.add(adicaoButton);
		layoutInferior.add(quatroButton);
		layoutInferior.add(cincoButton);
		layoutInferior.add(seisButton);
		layoutInferior.add(subtracaoButton);
		layoutInferior.add(seteButton);
		layoutInferior.add(oitoButton);
		layoutInferior.add(noveButton);
		layoutInferior.add(multiplicacaoButton);
		layoutInferior.add(virgulaButton);
		layoutInferior.add(zeroButton);
		layoutInferior.add(igualButton);
		layoutInferior.add(divisaoButton);

		zeroButton.addActionListener(this);
		umButton.addActionListener(this);
		doisButton.addActionListener(this);
		tresButton.addActionListener(this);
		quatroButton.addActionListener(this);
		cincoButton.addActionListener(this);
		seisButton.addActionListener(this);
		seteButton.addActionListener(this);
		oitoButton.addActionListener(this);
		noveButton.addActionListener(this);
		multiplicacaoButton.addActionListener(this);
		divisaoButton.addActionListener(this);
		adicaoButton.addActionListener(this);
		subtracaoButton.addActionListener(this);
		virgulaButton.addActionListener(this);
		igualButton.addActionListener(this);
		cEButton.addActionListener(this);

		layoutExterno.add(layoutSuperior, BorderLayout.NORTH);
		layoutExterno.add(layoutInferior, BorderLayout.CENTER);
		janela.setContentPane(layoutExterno);

		janela.setSize(200, 250);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("=")) {
			
		} else if (e.getActionCommand().equals("CE")) {
			painel.setText("");
		} else {
			painel.setText(painel.getText() + e.getActionCommand());
		}
	}
}
