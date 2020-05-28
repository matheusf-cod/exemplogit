package com.matheus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				double nmr1, nmr2, res;
				String acao = (" ");
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblchardigitado = new JLabel("chardigitado");
		lblchardigitado.setBounds(0, 0, 120, 14);
		contentPane.add(lblchardigitado);
		
		JButton botao7 = new JButton("7");
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botao7.setBounds(0, 25, 50, 50);
		contentPane.add(botao7);
		
		JButton botao8 = new JButton("8");
		botao8.setBounds(60, 25, 50, 50);
		contentPane.add(botao8);
		
		JButton botao9 = new JButton("9");
		botao9.setBounds(120, 25, 50, 50);
		contentPane.add(botao9);
		
		JButton botao4 = new JButton("4");
		botao4.setBounds(0, 86, 50, 50);
		contentPane.add(botao4);
		
		JButton botao5 = new JButton("5");
		botao5.setBounds(60, 86, 50, 50);
		contentPane.add(botao5);
		
		JButton botao6 = new JButton("6");
		botao6.setBounds(120, 86, 50, 50);
		contentPane.add(botao6);
		
		JButton botao1 = new JButton("1");
		botao1.setBounds(0, 147, 50, 50);
		contentPane.add(botao1);
		
		JButton botao2 = new JButton("2");
		botao2.setBounds(60, 147, 50, 50);
		contentPane.add(botao2);
		
		JButton botao3 = new JButton("3");
		botao3.setBounds(120, 147, 50, 50);
		contentPane.add(botao3);
		
		JButton botao0 = new JButton("0");
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botao0.setBounds(0, 208, 50, 50);
		contentPane.add(botao0);
		
		JButton botaovirgula = new JButton(",");
		botaovirgula.setBounds(60, 208, 50, 50);
		contentPane.add(botaovirgula);
		
		JButton botaoigual = new JButton("=");
		botaoigual.setBounds(120, 208, 50, 50);
		contentPane.add(botaoigual);
		
		JButton botaomais = new JButton("+");
		botaomais.setBounds(180, 208, 50, 50);
		contentPane.add(botaomais);
		
		JButton botaomenos = new JButton("-");
		botaomenos.setBounds(180, 147, 50, 50);
		contentPane.add(botaomenos);
		
		JButton botaovezes = new JButton("*");
		botaovezes.setBounds(180, 86, 50, 50);
		contentPane.add(botaovezes);
		
		JButton botaobarra = new JButton("/");
		botaobarra.setBounds(180, 25, 50, 50);
		contentPane.add(botaobarra);
	}
	
	
	
}
