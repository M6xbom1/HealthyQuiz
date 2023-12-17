package Game;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Howtoplaygame implements ActionListener{
	//partone
	JFrame frame = new JFrame();
	JLabel how = new JLabel("How to play this game");
	JLabel howone = new JLabel("1.If ready, press start");
	JLabel howtwo = new JLabel(" if not ready, press Exit");
	JLabel howthree = new JLabel("2.When u press start u will ");
	JLabel howfour = new JLabel("c new 2 tab like this");
	JLabel clicknext = new JLabel("Press");
	JLabel picone = new JLabel();
	JLabel pictwo = new JLabel();
	JLabel picthree = new JLabel();
	JButton next = new JButton();
	//parttwo
	JFrame framev2 = new JFrame();
	JLabel howonev2 = new JLabel("U have to choose 1 of 4 button ");
	JLabel howtwov2 = new JLabel("u think that button is correct");
	JLabel howthreev2 = new JLabel("this is hint for help you");
	JLabel howfourv2 = new JLabel("choose 1 button form 4 button");
	JLabel clicknextv2 = new JLabel("Press");
	JLabel piconev2 = new JLabel();
	JLabel pictwov2 = new JLabel();
	JLabel picthreev2 = new JLabel();
	JButton nextv2 = new JButton();
	//sound
	PlaySound ps = new PlaySound();   
	BGmusic bgm = new BGmusic();
	
	public void Howtoplaygame1(){
		
				//img
				picone.setIcon(new ImageIcon(Howtoplaygame.class.getResource("firsthowto.png")));
				picone.setBounds(0,0,1000,800);
				//button next
				next.setBounds(865,670,70,30);
				next.setRolloverEnabled(true);
				next.setIcon(new ImageIcon(Howtoplaygame.class.getResource("/Game/next1.png")));
				next.setRolloverIcon(new ImageIcon(Howtoplaygame.class.getResource("/Game/next2.png")));;
				next.setBorderPainted(false);//make button visible
				next.addActionListener(this);
				
				frame.add(picone);
				frame.add(next);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Healthy Game");
				frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Howtoplaygame.class.getResource("/Game/icon.png")));
				frame.setSize(1000,800);
				frame.setLayout(null);
				frame.setVisible(true);
				frame.setLocation(200,20);
				frame.setResizable(false);
				frame.add(clicknext);
		
		
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==next) {
					ps.playsound(".//sound//Button_01.wav");
					frame.dispose();
					Howtoplaygame Howtoplaygametwo = new Howtoplaygame();
					Howtoplaygametwo.Howtoplaygame2();
					
				}
					
				
			}
			
		});

	}
	public void Howtoplaygame2() {

			//img
			piconev2.setIcon(new ImageIcon(Howtoplaygame.class.getResource("secpichowto.png")));
			piconev2.setBounds(0, 0, 1000, 800);
			
			//button next
			nextv2.setBounds(865,670,70,30);
			nextv2.setRolloverEnabled(true);
			nextv2.setIcon(new ImageIcon(Howtoplaygame.class.getResource("/Game/next1.png")));
			nextv2.setRolloverIcon(new ImageIcon(Howtoplaygame.class.getResource("/Game/next2.png")));;
			nextv2.setBorderPainted(false);//make button visible
			nextv2.addActionListener(this);
		
		
			framev2.add(piconev2);
			framev2.add(nextv2);
			framev2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			framev2.setTitle("Healthy Game");
			framev2.setIconImage(Toolkit.getDefaultToolkit().getImage(Howtoplaygame.class.getResource("/Game/icon.png")));
			framev2.setSize(1000,800);
			framev2.setLayout(null);
			framev2.setVisible(true);
			framev2.setResizable(false);
			framev2.setLocation(200,20);
		
		
		
		
				nextv2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==nextv2) {
							ps.playsound(".//sound//Button_01.wav");
							try {
                                bgm.bgmusic();
                            }catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
                                e1.printStackTrace();
                                System.out.println("File not found.");
                            }
							framev2.dispose();
							Menu menu = new Menu();
							menu.Menu();
							
						}
						
						
					}
					
				});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}

