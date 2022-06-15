package Game;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class Menu implements ActionListener{
	JFrame frame = new JFrame();
	JButton start = new JButton("");
	JButton exit = new JButton("");
	JButton cumbai = new JButton("Cumbai");
	JButton nameuser = new JButton("Name");
	playSound ps = new playSound();  
	BGmusic bgm = new BGmusic();
	public void Menu(){
			//Start
			start.setBounds(133, 153, 200, 40);//x,y,width,height
			start.addActionListener(this);
			
			start.setRolloverEnabled(true);//setRolloverButton
			start.setIcon(new ImageIcon(Menu.class.getResource("/Game/Start01.png")));
			start.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/Start02.png")));
			
			start.setBorderPainted(false);//make button visible
			start.setContentAreaFilled(false);//make button 0% opacity
			start.setFocusPainted(false); 
			start.setOpaque(false);
			
			//Exit
			exit.setBounds(133, 241, 200, 40);//x,y,width,height
			exit.addActionListener(this);
			
			exit.setRolloverEnabled(true);//setRolloverButton
			exit.setIcon(new ImageIcon(Menu.class.getResource("/Game/Exit01.png")));
			exit.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/Exit02.png")));
			exit.setBorderPainted(false);//make button visible
			exit.setContentAreaFilled(false);//make button 0% opacity
			exit.setFocusPainted(false); 
			exit.setOpaque(false);
			
			
			//frame-menu
			frame.getContentPane().add(start);//add start button
			frame.getContentPane().add(exit);//add exit button
			frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Game/icon.png")));
			frame.setTitle("Healthy Game");
			frame.setResizable(false);
			frame.setSize(500,400);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
			//Background
			ImageIcon imgIcon = new ImageIcon(this.getClass().getResource("backgroundmenureal.gif"));
			JLabel label = new JLabel(imgIcon);
			label.setBounds(-83, -135, 650, 650);
			frame.getContentPane().add(label);
			
			//action button
			start.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==start) {
						ps.playsound(".//sound//Button_01.wav");
						frame.dispose();
						Game game = new Game();
						Cumbaiall cumbaione = new Cumbaiall();
						game.Game();
						cumbaione.Cumbai1situp();
					}
					
				}
				
			});
			exit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==exit) {
						ps.playsound(".//sound//Button_01.wav");
						int confirm = JOptionPane.showConfirmDialog(frame,"Are you want to exit?","EXIT!!",JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
						if (confirm == JOptionPane.YES_NO_OPTION)
						{
							System.exit(0);
						}
					}
					
				}
				
			});		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
		
		