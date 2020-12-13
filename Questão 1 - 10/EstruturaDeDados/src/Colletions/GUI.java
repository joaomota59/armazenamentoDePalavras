package Colletions;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class GUI extends JFrame {

	private JPanel contentPane;

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
		setTitle("Quest\u00E3o 1-10 Estrutura de Dados II Guilherme e Jo\u00E3o Lucas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TrabalhoFinalpart1 oi = new TrabalhoFinalpart1();//instacia o objeto onde tem as classes dos botões
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
		
		JButton btnNewButton = new JButton("LinkedList");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.linkedList()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton.setBounds(24, 72, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ArrayList");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.arrayList()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_1.setBounds(161, 72, 127, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HashSet");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.hashSet()+" segundos!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_2.setBounds(298, 72, 127, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LinkedHashSet");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.linkedHashSet()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_3.setBounds(24, 117, 127, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("TreeSet");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.treeSet()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_4.setBounds(161, 117, 127, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("HashMap");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.hashMap()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_5.setBounds(298, 117, 127, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("LinkedHashMap");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.linkedHashMap()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_6.setBounds(24, 166, 127, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("TreeMap");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.treeMap()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_7.setBounds(161, 166, 127, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("BTree");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null,"O tempo foi de: "+oi.bTree()+" segundos!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					
				}
			}
		});
		btnNewButton_8.setBounds(298, 166, 127, 23);
		contentPane.add(btnNewButton_8);
		
		JLabel lblLeituraDoArquivo = new JLabel("Tempo de execu\u00E7\u00E3o da \r\nleitura do arquivo: \u201Cleipzig100k.txt\u201D");
		lblLeituraDoArquivo.setBounds(34, 11, 348, 50);
		contentPane.add(lblLeituraDoArquivo);
		
		
		JLabel lblSelecioneAsEstruturas = new JLabel("Selecione as estruturas abaixo no qual deseja gerar o gr\u00E1fico!");
		lblSelecioneAsEstruturas.setBounds(20, 235, 405, 23);
		contentPane.add(lblSelecioneAsEstruturas);
		
		JRadioButton rdbtnLinkedlist = new JRadioButton("LinkedList");
		rdbtnLinkedlist.setBounds(24, 257, 127, 23);
		contentPane.add(rdbtnLinkedlist);
		
		JRadioButton rdbtnArraylist = new JRadioButton("ArrayList");
		rdbtnArraylist.setBounds(179, 257, 109, 23);
		contentPane.add(rdbtnArraylist);
		
		JRadioButton rdbtnHashset = new JRadioButton("HashSet");
		rdbtnHashset.setBounds(316, 257, 109, 23);
		contentPane.add(rdbtnHashset);
		
		JRadioButton rdbtnLinkedhahset = new JRadioButton("LinkedHashSet");
		rdbtnLinkedhahset.setBounds(24, 284, 127, 23);
		contentPane.add(rdbtnLinkedhahset);
		
		JRadioButton rdbtnTreeset = new JRadioButton("TreeSet");
		rdbtnTreeset.setBounds(179, 283, 109, 23);
		contentPane.add(rdbtnTreeset);
		
		JRadioButton rdbtnHashmap = new JRadioButton("HashMap");
		rdbtnHashmap.setBounds(316, 284, 109, 23);
		contentPane.add(rdbtnHashmap);
		
		JRadioButton rdbtnLinkedhashmap = new JRadioButton("LinkedHashMap");
		rdbtnLinkedhashmap.setBounds(24, 310, 127, 23);
		contentPane.add(rdbtnLinkedhashmap);
		
		JRadioButton rdbtnTreemap = new JRadioButton("TreeMap");
		rdbtnTreemap.setBounds(179, 309, 109, 23);
		contentPane.add(rdbtnTreemap);
		
		JRadioButton rdbtnBtree = new JRadioButton("Btree");
		rdbtnBtree.setBounds(316, 310, 109, 23);
		contentPane.add(rdbtnBtree);
		
		JButton btnNewButton_9 = new JButton("Gerar Gr\u00E1fico");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					oi.setdsdefault();//zera as coordenadas
					if(rdbtnLinkedlist.isSelected()) {
						oi.grafico1();
					}
					if(rdbtnArraylist.isSelected()) {
						oi.grafico2();
					}
					if(rdbtnHashset.isSelected()) {
						oi.grafico3();
					}
					if(rdbtnLinkedhahset.isSelected()) {
						oi.grafico4();
					}
					if(rdbtnTreeset.isSelected()) {
						oi.grafico5();
					}
					if(rdbtnHashmap.isSelected()) {
						oi.grafico6();
					}
					if(rdbtnLinkedhashmap.isSelected()) {
						oi.grafico7();
					}
					if(rdbtnTreemap.isSelected()) {
						oi.grafico8();
					}
					if(rdbtnBtree.isSelected()) {
						oi.grafico9();
					}
					JFreeChart grafico = ChartFactory.createBarChart3D("Tempo de execução do leipzig100k.txt \ncom mais 140.000 palavras em relação a uma estrutura", "Colletions API e Btree", 
						    "Tempo de execução(s)", oi.getds(), PlotOrientation.VERTICAL, true, true, false);
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
		btnNewButton_9.setBounds(161, 340, 127, 23);
		contentPane.add(btnNewButton_9);
		
		
	}
}
