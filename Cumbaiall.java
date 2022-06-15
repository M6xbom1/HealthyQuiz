package Game;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cumbaiall {
	
	//sound
	playSound ps = new playSound();
	//Part 1
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JLabel word = new JLabel("2 Word");
	JLabel alphabet = new JLabel("5 alphabet");
	JPanel onepanel = new JPanel();
	JPanel secpanel = new JPanel();
	JPanel thirdpanel = new JPanel();
	JPanel fourpanel = new JPanel();
	JPanel fivepanel = new JPanel();
	JLabel picone = new JLabel();
	JButton next = new JButton();
	JLabel numQuest1 = new JLabel("Question 1");
	//part 2
	JFrame frameV2 = new JFrame();
	JLabel labelV2 = new JLabel();
	JLabel wordV2 = new JLabel("2 Word");
	JLabel alphabetV2 = new JLabel("6 alphabet");
	JPanel onepanelV2 = new JPanel();
	JPanel secpanelV2 = new JPanel();
	JPanel thirdpanelV2 = new JPanel();
	JPanel fourpanelV2 = new JPanel();
	JPanel fivepanelV2 = new JPanel();
	JPanel sixpanelV2 = new JPanel();
	JLabel piconeV2 = new JLabel();
	JButton nextV2 = new JButton();
	JLabel numQuest2= new JLabel("Question 2");
	//part3
	JFrame frameV3 = new JFrame();
	JLabel labelV3 = new JLabel();
	JLabel wordV3 = new JLabel("2 Word");
	JLabel alphabetV3 = new JLabel("9 alphabet");
	JPanel onepanelV3 = new JPanel();
	JPanel secpanelV3 = new JPanel();
	JPanel thirdpanelV3 = new JPanel();
	JPanel fourpanelV3 = new JPanel();
	JPanel fivepanelV3 = new JPanel();
	JPanel sixpanelV3 = new JPanel();
	JPanel sevenpanelV3 = new JPanel();
	JPanel eightpanelV3 = new JPanel();
	JPanel ninepanelV3 = new JPanel();
	JPanel tenpanelV3 = new JPanel();
	JPanel elevenpanelV3 = new JPanel();
	JLabel piconeV3 = new JLabel();
	JButton nextV3 = new JButton();
	JLabel numQuest3= new JLabel("Question 3");
	//part four
	JFrame frameV4 = new JFrame();
	JLabel labelV4 = new JLabel();
	JLabel wordV4 = new JLabel("2 Word");
	JLabel alphabetV4 = new JLabel("11 alphabet");
	JPanel onepanelV4 = new JPanel();
	JPanel secpanelV4 = new JPanel();
	JPanel thirdpanelV4 = new JPanel();
	JPanel fourpanelV4 = new JPanel();
	JPanel fivepanelV4 = new JPanel();
	JPanel sixpanelV4 = new JPanel();
	JPanel sevenpanelV4 = new JPanel();
	JPanel eightpanelV4 = new JPanel();
	JPanel ninepanelV4 = new JPanel();
	JPanel tenpanelV4 = new JPanel();
	JPanel elevenpanelV4 = new JPanel();
	JLabel piconeV4 = new JLabel();
	JButton nextV4 = new JButton();
	JLabel numQuest4V4= new JLabel("Question 4");
	
	//part five
	JFrame frameV5 = new JFrame();
	JLabel labelV5 = new JLabel();
	JLabel wordV5 = new JLabel("1 Word");
	JLabel alphabetV5 = new JLabel("5 alphabet");
	JPanel onepanelV5 = new JPanel();
	JPanel secpanelV5 = new JPanel();
	JPanel thirdpanelV5 = new JPanel();
	JPanel fourpanelV5 = new JPanel();
	JPanel fivepanelV5 = new JPanel();
	JLabel piconeV5 = new JLabel();
	JButton nextV5 = new JButton();
	JLabel numQuest5V5= new JLabel("Question 5");
	//part six
	JFrame frameV6 = new JFrame();
	JLabel labelV6 = new JLabel();
	JLabel wordV6 = new JLabel("2 Word");
	JLabel alphabetV6 = new JLabel("9 alphabet");
	JPanel onepanelV6 = new JPanel();
	JPanel secpanelV6 = new JPanel();
	JPanel thirdpanelV6 = new JPanel();
	JPanel fourpanelV6 = new JPanel();
	JPanel fivepanelV6 = new JPanel();
	JPanel sixpanelV6 = new JPanel();
	JPanel sevenpanelV6 = new JPanel();
	JPanel eightpanelV6 = new JPanel();
	JPanel ninepanelV6 = new JPanel();
	JPanel tenpanelV6 = new JPanel();
	JPanel elevenpanelV6 = new JPanel();
	JLabel piconeV6 = new JLabel();
	JButton nextV6 = new JButton();
	JLabel numQuest6V6= new JLabel("Question 6");
	//part seven
	JFrame frameV7 = new JFrame();
	JLabel labelV7 = new JLabel();
	JLabel wordV7 = new JLabel("1	 Word");
	JLabel alphabetV7 = new JLabel("8 alphabet");
	JPanel onepanelV7 = new JPanel();
	JPanel secpanelV7 = new JPanel();
	JPanel thirdpanelV7 = new JPanel();
	JPanel fourpanelV7 = new JPanel();
	JPanel fivepanelV7 = new JPanel();
	JPanel sixpanelV7 = new JPanel();	
	JPanel sevenpanelV7 = new JPanel();
	JPanel eightpanelV7 = new JPanel();
	JPanel ninepanelV7 = new JPanel();
	JPanel tenpanelV7 = new JPanel();
	JPanel elevenpanelV7 = new JPanel();
	JLabel piconeV7 = new JLabel();
	JButton nextV7 = new JButton();
	JLabel numQuest7V7 = new JLabel("Question 7");
	
	
	//part one
	public void Cumbai1situp(){
		
		//img
		picone.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaione.png")));
		picone.setBounds(0, 0, 650, 650);
		
		//button next
		next.setBounds(495,456,70,30);
		next.setRolloverEnabled(true);
		next.setIcon(new ImageIcon(Cumbaiall.class.getResource("/Game/next1.png")));
		next.setRolloverIcon(new ImageIcon(Cumbaiall.class.getResource("/Game/next2.png")));;
		next.setBorderPainted(false);//make button visible
		
		frame.add(picone);
		frame.add(next);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Healthy Game");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frame.setSize(650,650);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocation(700,0);
				
				
				
				
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==next) {
					ps.playsound(".//sound//Button_01.wav");
					frame.dispose();
				Cumbaiall Cumbaitwo = new Cumbaiall();
				Cumbaitwo.Cumbai2pushup();
				}
			}
			
		});
		
	}
	//part two
	public void Cumbai2pushup() {
		
		//img
		piconeV2.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaitwo.png")));
		piconeV2.setBounds(0, 0, 650, 650);
		
		nextV2.setBounds(481,435,70,30);
		nextV2.setRolloverEnabled(true);
		nextV2.setIcon(new ImageIcon(Menu.class.getResource("/Game/next1.png")));
		nextV2.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/next2.png")));;
		nextV2.setBorderPainted(false);//make button visible
		
		frameV2.add(piconeV2);
		frameV2.add(nextV2);
		frameV2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameV2.setTitle("Healthy Game");
		frameV2.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frameV2.setSize(650,650);
		frameV2.setLayout(null);
		frameV2.setVisible(true);
		frameV2.setResizable(false);
		frameV2.setLocation(700,0);
		
		
		
		
		nextV2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nextV2) {
					ps.playsound(".//sound//Button_01.wav");
					frameV2.dispose();
				Cumbaiall Cumbaithree = new Cumbaiall();
				Cumbaithree.Cumbai3fullplank();
				}
				
			}
			
		});
	}
	//part three
	public void Cumbai3fullplank() {
		
		//img
		piconeV3.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaithree.png")));
		piconeV3.setBounds(0, 0, 650, 650);
				
		nextV3.setBounds(500,444,70,30);
		nextV3.setRolloverEnabled(true);
		nextV3.setIcon(new ImageIcon(Menu.class.getResource("/Game/next1.png")));
		nextV3.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/next2.png")));;
		nextV3.setBorderPainted(false);//make button visible
				
		frameV3.add(piconeV3);
		frameV3.add(nextV3);
		frameV3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameV3.setTitle("Healthy Game");
		frameV3.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frameV3.setSize(650,650);
		frameV3.setLayout(null);
		frameV3.setVisible(true);
		frameV3.setResizable(false);
		frameV3.setLocation(700,0);
		
		nextV3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nextV3) {
					ps.playsound(".//sound//Button_01.wav");
					frameV3.dispose();
				Cumbaiall Cumbaifour = new Cumbaiall();
				Cumbaifour.Cumbai4jumpingjack();
				}
			}
			
		});
		
	}
	//part four
	public void Cumbai4jumpingjack() {
		
		piconeV4.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaifour.png")));
		piconeV4.setBounds(0, 0, 650, 650);
				
		nextV4.setBounds(472,455,70,30);
		nextV4.setRolloverEnabled(true);
		nextV4.setIcon(new ImageIcon(Menu.class.getResource("/Game/next1.png")));
		nextV4.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/next2.png")));;
		nextV4.setBorderPainted(false);//make button visible
				
		frameV4.add(piconeV4);
		frameV4.add(nextV4);
		frameV4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameV4.setTitle("Healthy Game");
		frameV4.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frameV4.setSize(650,650);
		frameV4.setLayout(null);
		frameV4.setVisible(true);
		frameV4.setResizable(false);
		frameV4.setLocation(700,0);
		nextV4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nextV4) {
					ps.playsound(".//sound//Button_01.wav");
					frameV4.dispose();
				Cumbaiall Cumbaifive = new Cumbaiall();
				Cumbaifive.Cumbai5squat();
				}
			}
			
		});
		
	}
	//part five
	public void Cumbai5squat() {
		
		piconeV5.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaifive.png")));
		piconeV5.setBounds(0, 0, 650, 650);
				
		nextV5.setBounds(473,443,70,30);
		nextV5.setRolloverEnabled(true);
		nextV5.setIcon(new ImageIcon(Menu.class.getResource("/Game/next1.png")));
		nextV5.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/next2.png")));;
		nextV5.setBorderPainted(false);//make button visible

				
		frameV5.add(piconeV5);
		frameV5.add(nextV5);
		frameV5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameV5.setTitle("Healthy Game");
		frameV5.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frameV5.setSize(650,650);
		frameV5.setLayout(null);
		frameV5.setVisible(true);
		frameV5.setResizable(false);
		frameV5.setLocation(700,0);
		
		nextV5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nextV5) {
					ps.playsound(".//sound//Button_01.wav");
					frameV5.dispose();
				Cumbaiall Cumbaisix = new Cumbaiall();
				Cumbaisix.Cumbai6Leglunges();
				}
			}
			
		});
			}	
	//part six 
	public void Cumbai6Leglunges() {
		
		piconeV6.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaisix.png")));
		piconeV6.setBounds(0, 0, 650, 650);
		
		nextV6.setBounds(495,423,70,30);
		nextV6.setRolloverEnabled(true);
		nextV6.setIcon(new ImageIcon(Menu.class.getResource("/Game/next1.png")));
		nextV6.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/next2.png")));;
		nextV6.setBorderPainted(false);//make button visible
		
		frameV6.add(piconeV6);
		frameV6.add(nextV6);
		frameV6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameV6.setTitle("Healthy Game");
		frameV6.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frameV6.setSize(650,650);
		frameV6.setLayout(null);
		frameV6.setVisible(true);
		frameV6.setResizable(false);
		frameV6.setLocation(700,0);
		
		
		
		
		nextV6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nextV6) {
					ps.playsound(".//sound//Button_01.wav");
					frameV6.dispose();
					Cumbaiall Cumbaiseven = new Cumbaiall();
					Cumbaiseven.Cumbai7crunch();
				}
				
				
			}
			
		});
		
	}
	//part seven
	public void Cumbai7crunch() {
		
		piconeV7.setIcon(new ImageIcon(Cumbaiall.class.getResource("cumbaiseven.png")));
		piconeV7.setBounds(0, 0, 650, 650);
		
		nextV7.setBounds(463,438,70,30);
		nextV7.setRolloverEnabled(true);
		nextV7.setIcon(new ImageIcon(Menu.class.getResource("/Game/next1.png")));
		nextV7.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/next2.png")));;
		nextV7.setBorderPainted(false);//make button visible
		
		frameV7.add(piconeV7);
		frameV7.add(nextV7);
		frameV7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameV7.setTitle("Healthy Game");
		frameV7.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiall.class.getResource("/Game/icon.png")));
		frameV7.setSize(650,650);
		frameV7.setLayout(null);
		frameV7.setVisible(true);
		frameV7.setResizable(false);
		frameV7.setLocation(700,0);
		
		
		nextV7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==nextV7) {
					ps.playsound(".//sound//Button_01.wav");
					frameV7.dispose();
					Cumbaiknowall Cumbaiknowallone = new Cumbaiknowall();
					Cumbaiknowallone.Cumbai1know();
					
					
				}
					
		
			}
			
		});
	}	

	}

	
	
		

	


		



		

		
	
	
