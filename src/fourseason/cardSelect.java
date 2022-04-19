package fourseason;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.SwingConstants;

import fourseason.Result;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class cardSelect implements ActionListener {

	
	private JLabel w1;
	private JLabel cardW;
	private JLabel predicLabel;
	private JLabel labelW;
	private JLabel lblWork1;
	private JLabel backWork;
	private JLabel backMain1;
	private JLabel lblNewLabel_11;
	private JLabel preW1,preW2,preW3,preW4,preW5,preW6;
	private JLabel preM1,preM2,preM3,preM4,preM5,preM6;
	private JLabel preH1,preH2,preH3,preH4,preH5,preH6;
	private JLabel preL1,preL2,preL3,preL4,preL5,preL6;
	private JLabel preWcard,preMcard,preHcard,preLcard;
	
	private LinkedQueue queue = new LinkedQueue();
	private LinkedList linkedlist = new LinkedList();
	private JFrame J4;
	private Result result;
	private Course course;
	private CardLayout cardlay;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cardSelect window = new cardSelect();
					window.J4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cardSelect() {
		initialize();
		readFormResultFile();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		J4 = new JFrame();
		J4.setBounds(100, 100, 1369, 746);
		J4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J4.setTitle("ไม่งมงายทำนายดวงซะตา");
		 
		
		panel = new JPanel();
		J4.getContentPane().add(panel,BorderLayout.CENTER);
		cardlay = new CardLayout(0, 0);
		panel.setLayout(cardlay);
		
		JPanel main = new JPanel();
		panel.add(main, "name_345957565225500");
		main.setLayout(null);
		
		JButton btnStart = new JButton("ทำนาย");
		btnStart.setFont(new Font("SOV_Assadong_C", Font.BOLD, 40));
		btnStart.setBounds(685, 555, 209, 97);
		main.add(btnStart);
		btnStart.addActionListener(this);
		
		JLabel backMain = new JLabel("");
		backMain.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/S__65888303 (1).jpg")));
		backMain.setBounds(0, -28, 1355, 1062);
		main.add(backMain);
		
		JPanel work = new JPanel();
		panel.add(work, "name_346068073456000");
		work.setLayout(null);
		
		JLabel lblNewLabel_1;
		w1 = new JLabel("");
		w1.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/w.png")));
		w1.setBounds(232, 232, 177, 259);
		work.add(w1);
		
		JLabel w2 = new JLabel("");
		w2.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/w.png")));
		w2.setBounds(475, 232, 177, 259);
		work.add(w2);
		
		JLabel w3 = new JLabel("");
		w3.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/w.png")));
		w3.setBounds(715, 232, 177, 259);
		work.add(w3);
		
		JLabel w4 = new JLabel("");
		w4.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/w.png")));
		w4.setBounds(958, 232, 177, 259);
		work.add(w4);
		
		JButton btnW1 = new JButton("W1");
		btnW1.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnW1.setBounds(273, 512, 86, 40);
		work.add(btnW1);
		btnW1.addActionListener(this);
		
		JButton btnW2 = new JButton("W2");
		btnW2.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnW2.setBounds(520, 512, 86, 40);
		work.add(btnW2);
		btnW2.addActionListener(this);
		
		JButton btnW3 = new JButton("W3");
		btnW3.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnW3.setBounds(762, 512, 86, 40);
		work.add(btnW3);
		btnW3.addActionListener(this);
		
		JButton btnW4 = new JButton("W4");
		btnW4.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnW4.setBounds(1006, 512, 86, 40);
		work.add(btnW4);
		btnW4.addActionListener(this);
		
		JLabel lblWork = new JLabel("กรุณาเลือกไพ่ด้านการงาน");
		lblWork.setForeground(Color.WHITE);
		lblWork.setFont(new Font("SOV_Assadong_C", Font.BOLD, 99));
		lblWork.setHorizontalAlignment(SwingConstants.CENTER);
		lblWork.setBounds(312, 52, 780, 145);
		work.add(lblWork);
		
		JLabel backWork = new JLabel("");
		backWork.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/backall.jpg")));
		backWork.setBounds(0, -108, 1355, 817);
		work.add(backWork);
		
		JPanel money = new JPanel();
		money.setLayout(null);
		panel.add(money, "name_346632596494500");
		
		JLabel m1 = new JLabel("");
		m1.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/m.png")));
		m1.setBounds(224, 228, 177, 259);
		money.add(m1);
		
		JLabel m2 = new JLabel("");
		m2.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/m.png")));
		m2.setBounds(467, 228, 177, 259);
		money.add(m2);
		
		JLabel m3 = new JLabel("");
		m3.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/m.png")));
		m3.setBounds(707, 228, 177, 259);
		money.add(m3);
		
		JLabel m4 = new JLabel("");
		m4.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/m.png")));
		m4.setBounds(950, 228, 177, 259);
		money.add(m4);
		
		JButton btnM1 = new JButton("M1");
		btnM1.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnM1.setBounds(265, 508, 86, 40);
		money.add(btnM1);
		btnM1.addActionListener(this);
		
		JButton btnM2 = new JButton("M2");
		btnM2.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnM2.setBounds(512, 508, 86, 40);
		money.add(btnM2);
		btnM2.addActionListener(this);
		
		JButton btnM3 = new JButton("M3");
		btnM3.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnM3.setBounds(754, 508, 86, 40);
		money.add(btnM3);
		btnM3.addActionListener(this);
		
		JButton btnM4 = new JButton("M4");
		btnM4.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnM4.setBounds(998, 508, 86, 40);
		money.add(btnM4);
		btnM4.addActionListener(this);
		
		JLabel lblMoney = new JLabel("กรุณาเลือกไพ่ด้านการเงิน");
		lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoney.setForeground(Color.WHITE);
		lblMoney.setFont(new Font("SOV_Assadong_C", Font.BOLD, 99));
		lblMoney.setBounds(293, 40, 780, 145);
		money.add(lblMoney);
		
		JLabel backMoney = new JLabel("");
		backMoney.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/backall.jpg")));
		backMoney.setBounds(0, -114, 1355, 862);
		money.add(backMoney);
		
		JPanel health = new JPanel();
		health.setLayout(null);
		panel.add(health, "name_346725168234000");
		
		JLabel h1 = new JLabel("");
		h1.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/h.png")));
		h1.setBounds(226, 232, 177, 259);
		health.add(h1);
		
		JLabel h2 = new JLabel("");
		h2.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/h.png")));
		h2.setBounds(469, 232, 177, 259);
		health.add(h2);
		
		JLabel h3 = new JLabel("");
		h3.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/h.png")));
		h3.setBounds(709, 232, 177, 259);
		health.add(h3);
		
		JLabel h4 = new JLabel("");
		h4.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/h.png")));
		h4.setBounds(952, 232, 177, 259);
		health.add(h4);
		
		JButton btnH1 = new JButton("H1");
		btnH1.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnH1.setBounds(267, 512, 86, 40);
		health.add(btnH1);
		btnH1.addActionListener(this);
		
		JButton btnH2 = new JButton("H2");
		btnH2.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnH2.setBounds(514, 512, 86, 40);
		health.add(btnH2);
		btnH2.addActionListener(this);
		
		JButton btnH3 = new JButton("H3");
		btnH3.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnH3.setBounds(756, 512, 86, 40);
		health.add(btnH3);
		btnH3.addActionListener(this);
		
		JButton btnH4 = new JButton("H4");
		btnH4.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnH4.setBounds(1000, 512, 86, 40);
		health.add(btnH4);
		btnH4.addActionListener(this);
		
		JLabel lblHealth = new JLabel("กรุณาเลือกไพ่ด้านสุขภาพ");
		lblHealth.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealth.setForeground(Color.WHITE);
		lblHealth.setFont(new Font("SOV_Assadong_C", Font.BOLD, 99));
		lblHealth.setBounds(296, 44, 780, 145);
		health.add(lblHealth);
		
		JLabel backHealth = new JLabel("");
		backHealth.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/backall.jpg")));
		backHealth.setBounds(0, -137, 1355, 862);
		health.add(backHealth);
		
		JPanel love = new JPanel();
		love.setLayout(null);
		panel.add(love, "name_346830852660200");
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/l.png")));
		l1.setBounds(222, 256, 177, 259);
		love.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/l.png")));
		l2.setBounds(465, 256, 177, 259);
		love.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/l.png")));
		l3.setBounds(705, 256, 177, 259);
		love.add(l3);
		
		JLabel l4 = new JLabel("");
		l4.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/l.png")));
		l4.setBounds(948, 256, 177, 259);
		love.add(l4);
		
		JButton btnL1 = new JButton("L1");
		btnL1.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnL1.setBounds(263, 536, 86, 40);
		love.add(btnL1);
		btnL1.addActionListener(this);
		
		JButton btnL2 = new JButton("L2");
		btnL2.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnL2.setBounds(510, 536, 86, 40);
		love.add(btnL2);
		btnL2.addActionListener(this);
		
		JButton btnL3 = new JButton("L3");
		btnL3.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnL3.setBounds(752, 536, 86, 40);
		love.add(btnL3);
		btnL3.addActionListener(this);
		
		JButton btnL4 = new JButton("L4");
		btnL4.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 40));
		btnL4.setBounds(996, 536, 86, 40);
		love.add(btnL4);
		btnL4.addActionListener(this);
		
		JLabel lblLove = new JLabel("กรุณาเลือกไพ่ด้านความรัก");
		lblLove.setHorizontalAlignment(SwingConstants.CENTER);
		lblLove.setForeground(Color.WHITE);
		lblLove.setFont(new Font("SOV_Assadong_C", Font.BOLD, 99));
		lblLove.setBounds(295, 75, 780, 145);
		love.add(lblLove);
		
		JLabel backLove = new JLabel("");
		backLove.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/backall.jpg")));
		backLove.setBounds(0, -111, 1355, 820);
		love.add(backLove);
		
		JPanel predic = new JPanel();
		panel.add(predic, "name_283232314721200");
		predic.setLayout(null);
		
		JLabel backMain1;
		predicLabel = new JLabel("คำทำนายไม่งมงายดวงชะตา");
		predicLabel.setForeground(Color.WHITE);
		predicLabel.setFont(new Font("SOV_Assadong_C", Font.BOLD, 60));
		predicLabel.setHorizontalAlignment(SwingConstants.CENTER);
		predicLabel.setBounds(384, 10, 528, 89);

		JLabel lblNewLabel_11;
		cardW = new JLabel("");
		cardW.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/w-sm.png")));
		cardW.setBounds(78, 178, 92, 134);
		predic.add(cardW);
		
		JLabel cardH = new JLabel("");
		cardH.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/h-sm.png")));
		cardH.setBounds(74, 459, 92, 134);
		predic.add(cardH);
		
		JLabel cardM = new JLabel("");
		cardM.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/m-sm.png")));
		cardM.setBounds(714, 178, 92, 134);
		predic.add(cardM);
		
		JLabel cardL = new JLabel("");
		cardL.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/l-sm.png")));
		cardL.setBounds(714, 459, 92, 134);
		predic.add(cardL);
		
		JLabel lblWork1;
		labelW = new JLabel("ด้านการงาน");
		labelW.setForeground(Color.WHITE);
		labelW.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 30));
		labelW.setHorizontalAlignment(SwingConstants.CENTER);
		labelW.setBounds(74, 322, 106, 24);
		predic.add(labelW);
		
		JLabel labelM = new JLabel("ด้านการเงิน");
		labelM.setForeground(Color.WHITE);
		labelM.setHorizontalAlignment(SwingConstants.CENTER);
		labelM.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 30));
		labelM.setBounds(710, 322, 106, 24);
		predic.add(labelM);
		
		JLabel labelH = new JLabel("ด้านสุขภาพ");
		labelH.setForeground(Color.WHITE);
		labelH.setHorizontalAlignment(SwingConstants.CENTER);
		labelH.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 30));
		labelH.setBounds(70, 603, 106, 24);
		predic.add(labelH);
		
		JLabel labelL = new JLabel("ด้านความรัก");
		labelL.setForeground(Color.WHITE);
		labelL.setHorizontalAlignment(SwingConstants.CENTER);
		labelL.setFont(new Font("SOV_Assadong_C", Font.PLAIN, 30));
		labelL.setBounds(710, 603, 106, 24);
		predic.add(labelL);

		JLabel backWork1;
		
		preWcard = new JLabel("ไพ่ใบที่ 1");
		preWcard.setForeground(Color.WHITE);
		preWcard.setHorizontalAlignment(SwingConstants.CENTER);
		preWcard.setFont(new Font("TH Sarabun New", Font.PLAIN, 30));
		preWcard.setBounds(78, 141, 91, 39);
		predic.add(preWcard);
		preW1 = new JLabel("งานหนักมาก คุณแบกรับเอาไว้เยอะ ถึงแม้คุณจะไม่ได้ชอบงานนี้เท่าไหร่");
		preW1.setForeground(Color.WHITE);
		preW1.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preW1.setBounds(206, 166, 451, 39);
		predic.add(preW1);
		
		preW2 = new JLabel("แต่คุณก็ทำออกมาได้ดี เรียกได้ว่าเก่งงานด้านนี้เลยล่ะ คุณคิดอยากไปหลายครั้ง");
		preW2.setForeground(Color.WHITE);
		preW2.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preW2.setBounds(206, 200, 451, 39);
		predic.add(preW2);
		
		preW3 = new JLabel("ไปหาสิ่งที่ชอบมากกว่า ถนัดมากกว่า\r\nหรือได้ค่าตอบแทนดีกว่า แต่สุดท้าย\r\n");
		preW3.setForeground(Color.WHITE);
		preW3.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preW3.setBounds(206, 231, 451, 39);
		predic.add(preW3);
		
		preW4 = new JLabel("ก็ต้องวนเวียนกลับมาที่เดิม บางทีนี่อาจเป็นสัญญาณที่บอกว่า");
		preW4.setForeground(Color.WHITE);
		preW4.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preW4.setBounds(206, 261, 451, 39);
		predic.add(preW4);
		
		preW5 = new JLabel("คุณนั่นแหละเหมาะกับที่นี่ เหมาะกับงานนี้\r\nไม่มีใครทำงานออกมาได้ดีเท่าคุณอีกแล้ว");
		preW5.setForeground(Color.WHITE);
		preW5.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preW5.setBounds(206, 291, 451, 39);
		predic.add(preW5);
		
		preW6 = new JLabel("ถึงจะไปได้ช้า แต่สุดท้าย\r\nคุณก็คือผู้เชี่ยวชาญในด้นนี้ที่หาตัวจับได้ยากเลย");
		preW6.setForeground(Color.WHITE);
		preW6.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preW6.setBounds(206, 322, 451, 39);
		predic.add(preW6);
		
		preHcard = new JLabel("ไพ่ใบที่ 1");
		preHcard.setForeground(Color.WHITE);
		preHcard.setHorizontalAlignment(SwingConstants.CENTER);
		preHcard.setFont(new Font("TH Sarabun New", Font.PLAIN, 30));
		preHcard.setBounds(75, 423, 91, 39);
		predic.add(preHcard);
		
		preH1 = new JLabel("งานหนักมาก คุณแบกรับเอาไว้เยอะ ถึงแม้คุณจะไม่ได้ชอบงานนี้เท่าไหร่");
		preH1.setForeground(Color.WHITE);
		preH1.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preH1.setBounds(206, 456, 451, 39);
		predic.add(preH1);
		
		preH2 = new JLabel("แต่คุณก็ทำออกมาได้ดี เรียกได้ว่าเก่งงานด้านนี้เลยล่ะ คุณคิดอยากไปหลายครั้ง");
		preH2.setForeground(Color.WHITE);
		preH2.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preH2.setBounds(206, 490, 451, 39);
		predic.add(preH2);
		
		preH3 = new JLabel("ไปหาสิ่งที่ชอบมากกว่า ถนัดมากกว่า\r\nหรือได้ค่าตอบแทนดีกว่า แต่สุดท้าย\r\n");
		preH3.setForeground(Color.WHITE);
		preH3.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preH3.setBounds(206, 521, 451, 39);
		predic.add(preH3);
		
		preH4 = new JLabel("ก็ต้องวนเวียนกลับมาที่เดิม บางทีนี่อาจเป็นสัญญาณที่บอกว่า");
		preH4.setForeground(Color.WHITE);
		preH4.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preH4.setBounds(206, 551, 451, 39);
		predic.add(preH4);
		
		preH5 = new JLabel("คุณนั่นแหละเหมาะกับที่นี่ เหมาะกับงานนี้\r\nไม่มีใครทำงานออกมาได้ดีเท่าคุณอีกแล้ว");
		preH5.setForeground(Color.WHITE);
		preH5.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preH5.setBounds(206, 581, 451, 39);
		predic.add(preH5);
		
		preH6 = new JLabel("ถึงจะไปได้ช้า แต่สุดท้าย\r\nคุณก็คือผู้เชี่ยวชาญในด้นนี้ที่หาตัวจับได้ยากเลย");
		preH6.setForeground(Color.WHITE);
		preH6.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preH6.setBounds(206, 612, 451, 39);
		predic.add(preH6);
		
		preMcard = new JLabel("ไพ่ใบที่ 1");
		preMcard.setForeground(Color.WHITE);
		preMcard.setHorizontalAlignment(SwingConstants.CENTER);
		preMcard.setFont(new Font("TH Sarabun New", Font.PLAIN, 30));
		preMcard.setBounds(714, 141, 91, 39);
		predic.add(preMcard);
		
		preM1 = new JLabel("งานหนักมาก คุณแบกรับเอาไว้เยอะ ถึงแม้คุณจะไม่ได้ชอบงานนี้เท่าไหร่");
		preM1.setForeground(Color.WHITE);
		preM1.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preM1.setBounds(845, 166, 510, 39);
		predic.add(preM1);
		
		preM2 = new JLabel("แต่คุณก็ทำออกมาได้ดี เรียกได้ว่าเก่งงานด้านนี้เลยล่ะ คุณคิดอยากไปหลายครั้ง");
		preM2.setForeground(Color.WHITE);
		preM2.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preM2.setBounds(845, 200, 510, 39);
		predic.add(preM2);
		
		preM3 = new JLabel("ไปหาสิ่งที่ชอบมากกว่า ถนัดมากกว่า\r\nหรือได้ค่าตอบแทนดีกว่า แต่สุดท้าย\r\n");
		preM3.setForeground(Color.WHITE);
		preM3.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preM3.setBounds(845, 231, 510, 39);
		predic.add(preM3);
		
		preM4 = new JLabel("ก็ต้องวนเวียนกลับมาที่เดิม บางทีนี่อาจเป็นสัญญาณที่บอกว่า");
		preM4.setForeground(Color.WHITE);
		preM4.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preM4.setBounds(845, 261, 510, 39);
		predic.add(preM4);
		
		preM5 = new JLabel("คุณนั่นแหละเหมาะกับที่นี่ เหมาะกับงานนี้\r\nไม่มีใครทำงานออกมาได้ดีเท่าคุณอีกแล้ว");
		preM5.setForeground(Color.WHITE);
		preM5.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preM5.setBounds(845, 291, 510, 39);
		predic.add(preM5);
		
		preM6 = new JLabel("ถึงจะไปได้ช้า แต่สุดท้าย\r\nคุณก็คือผู้เชี่ยวชาญในด้นนี้ที่หาตัวจับได้ยากเลย");
		preM6.setForeground(Color.WHITE);
		preM6.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preM6.setBounds(845, 322, 510, 39);
		predic.add(preM6);
		
		preLcard = new JLabel("ไพ่ใบที่ 1");
		preLcard.setForeground(Color.WHITE);
		preLcard.setHorizontalAlignment(SwingConstants.CENTER);
		preLcard.setFont(new Font("TH Sarabun New", Font.PLAIN, 30));
		preLcard.setBounds(710, 424, 91, 39);
		predic.add(preLcard);
		
		preL1 = new JLabel("งานหนักมาก คุณแบกรับเอาไว้เยอะ ถึงแม้คุณจะไม่ได้ชอบงานนี้เท่าไหร่");
		preL1.setForeground(Color.WHITE);
		preL1.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preL1.setBounds(845, 456, 510, 39);
		predic.add(preL1);
		
		preL2 = new JLabel("แต่คุณก็ทำออกมาได้ดี เรียกได้ว่าเก่งงานด้านนี้เลยล่ะ คุณคิดอยากไปหลายครั้ง");
		preL2.setForeground(Color.WHITE);
		preL2.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preL2.setBounds(845, 490, 510, 39);
		predic.add(preL2);
		
		preL3 = new JLabel("ไปหาสิ่งที่ชอบมากกว่า ถนัดมากกว่า\r\nหรือได้ค่าตอบแทนดีกว่า แต่สุดท้าย\r\n");
		preL3.setForeground(Color.WHITE);
		preL3.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preL3.setBounds(845, 521, 510, 39);
		predic.add(preL3);
		
		preL4 = new JLabel("ก็ต้องวนเวียนกลับมาที่เดิม บางทีนี่อาจเป็นสัญญาณที่บอกว่า");
		preL4.setForeground(Color.WHITE);
		preL4.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preL4.setBounds(845, 551, 510, 39);
		predic.add(preL4);
		
		preL5 = new JLabel("คุณนั่นแหละเหมาะกับที่นี่ เหมาะกับงานนี้\r\nไม่มีใครทำงานออกมาได้ดีเท่าคุณอีกแล้ว");
		preL5.setForeground(Color.WHITE);
		preL5.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preL5.setBounds(845, 581, 510, 39);
		predic.add(preL5);
		
		preL6 = new JLabel("ถึงจะไปได้ช้า แต่สุดท้าย\r\nคุณก็คือผู้เชี่ยวชาญในด้นนี้ที่หาตัวจับได้ยากเลย");
		preL6.setForeground(Color.WHITE);
		preL6.setFont(new Font("TH Sarabun New", Font.PLAIN, 25));
		preL6.setBounds(845, 612, 510, 39);
		predic.add(preL6);
		
		JLabel lblPredict = new JLabel("คำทำนายไม่งมงายดวงชะตา");
		lblPredict.setFont(new Font("SOV_Assadong_C", Font.BOLD, 70));
		lblPredict.setHorizontalAlignment(SwingConstants.CENTER);
		lblPredict.setForeground(Color.WHITE);
		lblPredict.setBounds(384, 26, 579, 105);
		predic.add(lblPredict);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(cardSelect.class.getResource("/fourseason/image/sky.jpg")));
		back.setBounds(24, -194, 2207, 903);
		predic.add(back);
	}
	
	private void readFormResultFile() {
		String Line;
		String currentDirectory = System.getProperty("user.dir");
		String path = currentDirectory + "\\src\\fourseason\\prediction4.csv";
		BufferedReader br;
		try {
			File file = new File(path);
			br = new BufferedReader(new FileReader(file));
			while ((Line = br.readLine()) != null) {
				String[] Data = Line.split(",");
				result = new Result(Data[0], Data[1], Data[2], Data[3], Data[4], Data[5], Data[6]);
				try {
					linkedlist.insert(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void ResultSetUp(String key) {
		try {
			if (key.equalsIgnoreCase("W1")) {
				linkedlist.findFirst();
				result = (Result)linkedlist.retrieve();
			} else {
				result = (Result)linkedlist.findKey(key);
			}
			if (key.equalsIgnoreCase("W1")||key.equalsIgnoreCase("W2")||key.equalsIgnoreCase("W3")||key.equalsIgnoreCase("W4")){
				preWcard.setText(result.getChoice());
			preW1.setText(result.getpreLine1());
			preW2.setText(result.getpreLine2());
			preW3.setText(result.getpreLine3());
			preW4.setText(result.getpreLine4());
			preW5.setText(result.getpreLine5());
			preW6.setText(result.getpreLine6());
			}
			else if (key.equalsIgnoreCase("M1")||key.equalsIgnoreCase("M2")||key.equalsIgnoreCase("M3")||key.equalsIgnoreCase("M4")){
				preMcard.setText(result.getChoice());
			preM1.setText(result.getpreLine1());
			preM2.setText(result.getpreLine2());
			preM3.setText(result.getpreLine3());
			preM4.setText(result.getpreLine4());
			preM5.setText(result.getpreLine5());
			preM6.setText(result.getpreLine6());
			}
			else if (key.equalsIgnoreCase("H1")||key.equalsIgnoreCase("H2")||key.equalsIgnoreCase("H3")||key.equalsIgnoreCase("H4")){
				preHcard.setText(result.getChoice());
			preH1.setText(result.getpreLine1());
			preH2.setText(result.getpreLine2());
			preH3.setText(result.getpreLine3());
			preH4.setText(result.getpreLine4());
			preH5.setText(result.getpreLine5());
			preH6.setText(result.getpreLine6());
			}
			else if (key.equalsIgnoreCase("L1")||key.equalsIgnoreCase("L2")||key.equalsIgnoreCase("L3")||key.equalsIgnoreCase("L4")){
				preLcard.setText(result.getChoice());
			preL1.setText(result.getpreLine1());
			preL2.setText(result.getpreLine2());
			preL3.setText(result.getpreLine3());
			preL4.setText(result.getpreLine4());
			preL5.setText(result.getpreLine5());
			preL6.setText(result.getpreLine6());
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonText = ((JButton)e.getSource()).getText();
		
		try {
				int num = 0;
				while (num < 6) {
					if(num == 0) {
					num++;
					cardlay.next(panel);
					}
				Course text = new Course(buttonText); 
				num++;
				queue.enqueue(text);
				}
				for (int i = 0; i < 5; i++) {
					course = (Course)queue.dequeue();
					ResultSetUp(course.getcardName());
				}
								
		} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
	}
	
}
