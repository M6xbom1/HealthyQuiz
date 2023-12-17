package Game;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cumbaiknowall {
	
	//sound
	PlaySound ps = new PlaySound();
	//part one know
	JFrame frame = new JFrame();
	JLabel whatex = new JLabel("Sit up");
	JLabel how = new JLabel("How to");
	JLabel howone = new JLabel("1.Lie down on your back.");
	JLabel howtwo = new JLabel("2.Bend your legs and place feet firmly on the ground");
	JLabel howthree = new JLabel("to stabilize your lower body.");
	JLabel howfour = new JLabel("3.Cross your hands to opposite shoulders or place them behind");
	JLabel howfive = new JLabel("your ears, without pulling on your neck.");
	JLabel howsix = new JLabel("4.Curl your upper body all the way up toward  your knees.");
	JLabel howseven = new JLabel("Exhale as you lift.");
	JLabel howeight = new JLabel("5.Slowly, lower yourself down, returning to your starting point.");
	JLabel hownine = new JLabel("Inhale as you lower.");
	JLabel howten = new JLabel("Beginners should aim for 10 reps at a time.");
	JLabel picone = new JLabel();
	JButton next = new JButton();
	//part two know
	JFrame framev2 = new JFrame();
	JLabel whatexv2 = new JLabel("Push up");
	JLabel howv2 = new JLabel("How to");
	JLabel howonev2 = new JLabel("1. Get down on all fours, placing your hands slightly.");
	JLabel howtwov2 = new JLabel("wider than your shoulders.");
	JLabel howthreev2 = new JLabel("2.Straighten your arms and legs.");
	JLabel howfourv2 = new JLabel("3.Lower your body until your chest nearly touches the floor.");
	JLabel howfivev2 = new JLabel("4.Pause, then push yourself back up.");
	JLabel howsixv2 = new JLabel("5. Repeat.");
	JLabel piconev2 = new JLabel();
	JButton nextv2 = new JButton();
	//part three know
	JFrame framev3 = new JFrame();
	JLabel whatexv3 = new JLabel("Full Plank");
	JLabel howv3 = new JLabel("How to");
	JLabel howonev3 = new JLabel("1.Start in a press-up position.");
	JLabel howtwov3 = new JLabel("2. Bend your elbows until your forearms are on the floor beneath");
	JLabel howthreev3 = new JLabel("your shoulders so your body is in a straight line from your feet");
	JLabel howfourv3 = new JLabel("to your head.");
	JLabel howfivev3 = new JLabel("3. Keep your abs tight and look at the space between your hands");
	JLabel howsixv3 = new JLabel("to ensure a neutral spine position.");
	JLabel howsevenv3 = new JLabel("4. Hold the position for as long as you can.");
	JLabel piconev3 = new JLabel();
	JButton nextv3 = new JButton();
	//part four know
	JFrame framev4 = new JFrame();
	JLabel whatexv4 = new JLabel("Jumping jack");
	JLabel howv4 = new JLabel("How to");
	JLabel howonev4 = new JLabel("1.Stand upright with your legs together, arms at your sides.");
	JLabel howtwov4 = new JLabel("2.Bend your knees slightly, and jump into the air.");
	JLabel howthreev4 = new JLabel("3. As you jump, spread your legs to be about shoulder-width apart.");
	JLabel howfourv4 = new JLabel("Stretch your arms out and over your head.");
	JLabel howfivev4 = new JLabel("4. Jump back to starting position.");
	JLabel howsixv4 = new JLabel("5. Repeat.");
	JLabel piconev4 = new JLabel();
	JButton nextv4 = new JButton();
	//part five know
	JFrame framev5 = new JFrame();
	JLabel whatexv5 = new JLabel("Squat");
	JLabel howv5 = new JLabel("How to");
	JLabel howonev5 = new JLabel("1.Stand with feet a little wider than hip width, toes facing front.");
	JLabel howtwov5 = new JLabel("2.Drive your hips back—bending at the knees and ankles");
	JLabel howthreev5 = new JLabel("and pressing your knees slightly open—as you");
	JLabel howfourv5 = new JLabel("3.Sit into a squat position while still keeping your heels and toes.");
	JLabel howfivev5 = new JLabel("4. Strive to eventually reach parallel");
	JLabel howsixv5 = new JLabel(", meaning knees are bent to a 90-degree angle.");
	JLabel howsevenv5 = new JLabel("5. Press into your heels and straighten legs to ");
	JLabel howeightv5 = new JLabel("return to a standing upright position.");
	JLabel piconev5 = new JLabel();
	JButton nextv5 = new JButton();
	//part six know
	JFrame framev6 = new JFrame();
	JLabel whatexv6 = new JLabel("Leg Lunges");
	JLabel howv6 = new JLabel("How to");
	JLabel howonev6 = new JLabel("1.Start in a standing position with your feet hip-width apart.");
	JLabel howtwov6 = new JLabel("2.Step forward longer than a walking stride so one leg is ahead of your torso");
	JLabel howthreev6 = new JLabel("and the other is behind.");
	JLabel howfourv6 = new JLabel("Your foot should land flat and remain flat while it’s on the ground.");
	JLabel howfivev6 = new JLabel("Your rear heel will rise off of the ground.");
	JLabel howsixv6 = new JLabel("3.Bend your knees to approximately 90 degrees as you lower yourself.");
	JLabel howsevenv6 = new JLabel("Remember to keep your trunk upright and core engaged.");
	JLabel howeightv6 = new JLabel("4.Then, forcefully push off from your front leg to return to the starting position.");
	JLabel piconev6 = new JLabel();
	JButton nextv6 = new JButton();
	//part seven know
	JFrame framev7 = new JFrame();
	JLabel whatexv7 = new JLabel("Crunches");
	JLabel howv7 = new JLabel("How to");
	JLabel howonev7 = new JLabel("1.Lie down on your back. Plant your feet on the floor,");
	JLabel howtwov7 = new JLabel("hip-width apart. Bend your knees and place your arms across your chest");
	JLabel howthreev7 = new JLabel("Contract your abs and inhale.");
	JLabel howfourv7 = new JLabel("2.Exhale and lift your upper body, keeping your head and neck relaxed.");
	JLabel howfivev7 = new JLabel("3.Inhale and return to the starting position.");
	JLabel piconev7 = new JLabel();
	JButton exit = new JButton();
	
	
	
	//part first know
	public void Cumbai1know(){
		
			//img
			picone.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowleone.png")));
			picone.setBounds(0, 0, 1000, 700);
			
			next.setBounds(818,579,70,30);
			next.setRolloverEnabled(true);
			next.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next1.png")));
			next.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next2.png")));;
			next.setBorderPainted(false);//make button visible
			
			frame.add(picone);
			frame.add(next);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Healthy Game");
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
			frame.setSize(1000,700);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setResizable(false);
			
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==next) {
						ps.playsound(".//sound//Button_01.wav");
						frame.dispose();
						Cumbaiknowall Cumbaiknowalltwo = new Cumbaiknowall();
						Cumbaiknowalltwo.Cumbai2know();
					}
					}
				});
	}
	//part sec know
	public void Cumbai2know() {
	
		//img
		piconev2.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowletwo.png")));
		piconev2.setBounds(0, 0, 1000, 700);
		
		nextv2.setBounds(812,562,70,30);
		nextv2.setRolloverEnabled(true);
		nextv2.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next1.png")));
		nextv2.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next2.png")));;
		nextv2.setBorderPainted(false);//make button visible
		
		framev2.add(piconev2);
		framev2.add(nextv2);
		framev2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framev2.setTitle("Healthy Game");
		framev2.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
		framev2.setSize(1000,700);
		framev2.setLayout(null);
		framev2.setVisible(true);
		framev2.setResizable(false);
				nextv2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==nextv2) {
							ps.playsound(".//sound//Button_01.wav");
							framev2.dispose();
							Cumbaiknowall Cumbaiknowallthree = new Cumbaiknowall();
							Cumbaiknowallthree.Cumbai3know();
						}
						
					}
					
				});
	
		}
	//part three know
	public void Cumbai3know() {

		piconev3.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowlethree.png")));
		piconev3.setBounds(0, 0, 1000, 700);
		
		nextv3.setBounds(812,528,70,30);
		nextv3.setRolloverEnabled(true);
		nextv3.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next1.png")));
		nextv3.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next2.png")));;
		nextv3.setBorderPainted(false);//make button visible
		
		framev3.add(piconev3);
		framev3.add(nextv3);
		framev3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framev3.setTitle("Healthy Game");
		framev3.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
		framev3.setSize(1000,700);
		framev3.setLayout(null);
		framev3.setVisible(true);
		framev3.setResizable(false);
				nextv3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==nextv3) {
							ps.playsound(".//sound//Button_01.wav");
							framev3.dispose();
							Cumbaiknowall Cumbaiknowallfour = new Cumbaiknowall();
							Cumbaiknowallfour.Cumbai4know();
						}
					
			
					}
					
				});
			
		
	}
	//part four know
	public void Cumbai4know() {
		
		piconev4.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowlefour.png")));
		piconev4.setBounds(0, 0, 1000, 700);
		
		nextv4.setBounds(812,525,70,30);
		nextv4.setRolloverEnabled(true);
		nextv4.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next1.png")));
		nextv4.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next2.png")));;
		nextv4.setBorderPainted(false);//make button visible
		
		framev4.add(piconev4);
		framev4.add(nextv4);
		framev4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framev4.setTitle("Healthy Game");
		framev4.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
		framev4.setSize(1000,700);
		framev4.setLayout(null);
		framev4.setVisible(true);
		framev4.setResizable(false);
				nextv4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==nextv4) {
							ps.playsound(".//sound//Button_01.wav");
							framev4.dispose();
							Cumbaiknowall Cumbaiknowallfive = new Cumbaiknowall();
							Cumbaiknowallfive.Cumbai5know();
						
						}
						
					}
					
				});
		
	}
	
	//part five know
	public void Cumbai5know() {
		
		//img
		piconev5.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowlefive.png")));
		piconev5.setBounds(0, 0, 1000, 700);
		
		nextv5.setBounds(812,525,70,30);
		nextv5.setRolloverEnabled(true);
		nextv5.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next1.png")));
		nextv5.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next2.png")));;
		nextv5.setBorderPainted(false);//make button visible
		
		framev5.add(piconev5);
		framev5.add(nextv5);
		framev5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framev5.setTitle("Healthy Game");
		framev5.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
		framev5.setSize(1000,700);
		framev5.setLayout(null);
		framev5.setVisible(true);
		framev5.setResizable(false);
				nextv5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==nextv5) {
							ps.playsound(".//sound//Button_01.wav");
							framev5.dispose();
							Cumbaiknowall Cumbaiknowallsix = new Cumbaiknowall();
							Cumbaiknowallsix.Cumbai6know();
						
						}
						
					}
					
				});
		
	}
	
	//part six know
	public void Cumbai6know() {
		
		//img
		piconev6.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowlesix.png")));
		piconev6.setBounds(0, 0, 1000, 700);
		
		nextv6.setBounds(812,525,70,30);
		nextv6.setRolloverEnabled(true);
		nextv6.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next1.png")));
		nextv6.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/next2.png")));;
		nextv6.setBorderPainted(false);//make button visible
		
		framev6.add(piconev6);
		framev6.add(nextv6);
		framev6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framev6.setTitle("Healthy Game");
		framev6.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
		framev6.setSize(1000,700);
		framev6.setLayout(null);
		framev6.setVisible(true);
		framev6.setResizable(false);
				
				nextv6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==nextv6) {
							ps.playsound(".//sound//Button_01.wav");
							framev6.dispose();
							Cumbaiknowall Cumbaiknowallseven = new Cumbaiknowall();
							Cumbaiknowallseven.Cumbai7know();
						}
					}
					
				});

	}
	//part seven know
	public void Cumbai7know() {
		
		//img
		piconev7.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("knowleseven.png")));
		piconev7.setBounds(0, 0, 1000, 700);
		
		exit.setBounds(812,525,70,30);
		exit.setRolloverEnabled(true);
		exit.setIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/Exitclose1.png")));
		exit.setRolloverIcon(new ImageIcon(Cumbaiknowall.class.getResource("/Game/Exitclose2.png")));;
		exit.setBorderPainted(false);//make button visible
		
		framev7.add(piconev7);
		framev7.add(exit);
		framev7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framev7.setTitle("Healthy Game");
		framev7.setIconImage(Toolkit.getDefaultToolkit().getImage(Cumbaiknowall.class.getResource("/Game/icon.png")));
		framev7.setSize(1000,700);
		framev7.setLayout(null);
		framev7.setVisible(true);
		framev7.setResizable(false);
				exit.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==exit) {
							ps.playsound(".//sound//Button_01.wav");
							System.exit(0);
						}
					}
					
				});
		
	}
}
