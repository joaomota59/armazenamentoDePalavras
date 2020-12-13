package Questao11e12;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JInternalFrame;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Questao11e12 - Estrutura de dados II");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TrabalhoFinalpart2 oi = new TrabalhoFinalpart2();//instacia o objeto onde tem as classes dos botões
		
		 // Cria uma tela com uma panel vazia dentro. Usa esta panel para definir
        // o tamanho mínimo e preferencial da janela.
        JFrame frame = new JFrame("Gráficos");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel raiz = new JPanel();
        Dimension tamanho = new Dimension(700, 440);
        raiz.setPreferredSize(tamanho);
        raiz.setMinimumSize(tamanho);
        frame.getContentPane().add(raiz);
        frame.pack();
        Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((sd.width - frame.getWidth()) / 2, (sd.height - frame.getHeight()) / 2);

        // Cria o painel aonde o gráfico será mostrado.
        JPanel primeiroGrafico = new JPanel();
        Dimension tamanhoArea = new Dimension(700, 650);
        primeiroGrafico.setPreferredSize(tamanhoArea);
        primeiroGrafico.setMinimumSize(tamanhoArea);
        
        raiz.add(primeiroGrafico, BorderLayout.CENTER);
		JButton button = new JButton("ArrayList");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.arrayList1(textField.getText()));
				}
				catch(Exception e1){
					
				}

			}
		});
		button.setBounds(178, 82, 127, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("HashSet");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,oi.hashSet1(textField.getText()));
				} catch (Exception e1) {
					
				}

			}
		});
		button_1.setBounds(315, 82, 127, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("LinkedList");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				JOptionPane.showMessageDialog(null,oi.linkedList1(textField.getText()));
				}
				catch(Exception e1){
					
				}
				
			}
		});
		button_2.setBounds(41, 82, 127, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("LinkedHashSet");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.linkedHashSet1(textField.getText()));
				}
				catch(Exception e1){
					
				}
			}
		});
		button_3.setBounds(41, 127, 127, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("TreeSet");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.treeSet1(textField.getText()));
				}
				catch(Exception e1){
					
				}
			}
		});
		button_4.setBounds(178, 127, 127, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("HashMap");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.hashMap1(textField.getText()));
				}
				catch(Exception e1){
					
				}
			}
		});
		button_5.setBounds(315, 127, 127, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("BTree");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.bTree1(textField.getText()));
				}
				catch(Exception e1){
					
				}
			}
		});
		button_6.setBounds(315, 176, 127, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("TreeMap");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.treeMap1(textField.getText()));
				}
				catch(Exception e1){
					
				}
			}
		});
		button_7.setBounds(178, 176, 127, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("LinkedHashMap");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				JOptionPane.showMessageDialog(null,oi.linkedHashMap1(textField.getText()));
				}
				catch(Exception e1){
					
				}
			}
		});
		button_8.setBounds(41, 176, 127, 23);
		contentPane.add(button_8);
		
		JLabel label = new JLabel("Selecione as estruturas abaixo no qual deseja gerar o gr\u00E1fico!");
		label.setBounds(37, 245, 405, 23);
		contentPane.add(label);
		
		JRadioButton radioButton = new JRadioButton("HashSet");
		radioButton.setBounds(333, 267, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("HashMap");
		radioButton_1.setBounds(333, 294, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("ArrayList");
		radioButton_2.setBounds(196, 267, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("TreeSet");
		radioButton_3.setBounds(196, 293, 109, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("LinkedList");
		radioButton_4.setBounds(41, 267, 127, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("LinkedHashSet");
		radioButton_5.setBounds(41, 294, 127, 23);
		contentPane.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("LinkedHashMap");
		radioButton_6.setBounds(41, 320, 127, 23);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("TreeMap");
		radioButton_7.setBounds(196, 319, 109, 23);
		contentPane.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("Btree");
		radioButton_8.setBounds(333, 320, 109, 23);
		contentPane.add(radioButton_8);
		
		int flag1=0;//ver se precisa fazer uma nova TS da Linked List
		int flag2=0;//ver se precisa fazer uma nova TS do Array List
		JButton button_9 = new JButton("Gerar Gr\u00E1fico");
		button_9.addActionListener(new ActionListener() {
			private int flag1=0;
			private int flag2=0;
			public void actionPerformed(ActionEvent e) {
				try {
					oi.setdsdefault();//zera as coordenadas
					if(radioButton_4.isSelected()) {//linkedlist
						LinkedList<String> k = null;
						if (flag1 == 0) {
						k = oi.retornatabela1();
						this.flag1++;
						}
						oi.grafico1(k);
					}
					if(radioButton_2.isSelected()) {//ArrayList
							ArrayList<String> k = null;
							if (flag2 == 0) {//então é pq a tabela ainda n foi criada
							k = oi.retornatabela2();
							this.flag2++;
							}
							oi.grafico2(k);
					}
					if(radioButton.isSelected()) {//HashSet
						oi.grafico3();
					}
					if(radioButton_5.isSelected()) {
						oi.grafico4();
					}
					if(radioButton_3.isSelected()) {
						oi.grafico5();
					}
					if(radioButton_1.isSelected()) {
						oi.grafico6();
					}
					if(radioButton_6.isSelected()) {
						oi.grafico7();
					}
					if(radioButton_7.isSelected()) {
						oi.grafico8();
					}
					if(radioButton_8.isSelected()) {
						oi.grafico9();
					}
					JFreeChart grafico = ChartFactory.createLineChart("Tempo de execução do leipzig100k.txt \ncom mais 140.000 palavras em relação a uma estrutura", "Colletions API e Btree", 
						    "Tempo de execução(ns)", oi.getds(), PlotOrientation.VERTICAL, true, true, false);
		            ChartPanel chartPanel = new ChartPanel(grafico);
		            primeiroGrafico.add(chartPanel);
		            primeiroGrafico.validate();;
		         // Mostra a tela.
		            frame.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		button_9.setBounds(178, 350, 127, 23);
		contentPane.add(button_9);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(10, 6, 2, 228);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBounds(41, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteAPalavra = new JLabel("Digite a palavra que deve se buscada no \u201Cleipzig100k.txt\", em seguida");
		lblDigiteAPalavra.setBounds(41, 6, 413, 23);
		contentPane.add(lblDigiteAPalavra);
		
		JLabel lblEmQualEstrutura = new JLabel("clique em qual estrutura deseja buscar.");
		lblEmQualEstrutura.setBounds(41, 23, 276, 20);
		contentPane.add(lblEmQualEstrutura);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(452, 6, 2, 228);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 232, 445, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 6, 445, 2);
		contentPane.add(separator_3);
	}
}
