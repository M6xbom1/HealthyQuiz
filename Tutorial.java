import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class Tutorial implements ActionListener{
	JFrame frame = new JFrame();
	JButton start = new JButton();
	JButton exit = new JButton();
	JButton tutorial = new JButton();
	PlaySound ps = new PlaySound();  
	BGmusic bgm = new BGmusic();

	public Tutorial(){
			//frame-menu
			frame.getContentPane().add(start);//add start button
			frame.getContentPane().add(exit);//add exit button
			frame.getContentPane().add(tutorial);//add tutorial button
			frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Img/Icon.png")));
			frame.setTitle("Guy Gamlang Okk");
			frame.setResizable(false);
			frame.setSize(650,650);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);

			//Next
			start.setBounds(133, 153, 200, 40);//x,y,width,height
			start.addActionListener(this);
			start.setRolloverEnabled(true);//setRolloverButton
			start.setIcon(new ImageIcon(Menu.class.getResource("/Img/Start1.png")));
			start.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/Start2.png")));
			start.setBorderPainted(false);//make button visible
			start.setContentAreaFilled(false);//make button 0% opacity
			start.setFocusPainted(false); 
			start.setOpaque(false);
			
			//Exit
			exit.setBounds(133, 241, 200, 40);//x,y,width,height
			exit.addActionListener(this);
			exit.setRolloverEnabled(true);//setRolloverButton
			exit.setIcon(new ImageIcon(Menu.class.getResource("/Img/Exit1.png")));
			exit.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/Exit2.png")));
			exit.setBorderPainted(false);//make button visible
			exit.setContentAreaFilled(false);//make button 0% opacity
			exit.setFocusPainted(false); 
			exit.setOpaque(false);

			//Tutorial
			tutorial.setBounds(430, 320, 40, 40);//x,y,width,height
			tutorial.addActionListener(this);
			tutorial.setRolloverEnabled(true);//setRolloverButton
			tutorial.setIcon(new ImageIcon(Menu.class.getResource("/Img/Tutorial1.png")));
			tutorial.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/Tutorial2.png")));
			tutorial.setBorderPainted(false);//make button visible
			tutorial.setContentAreaFilled(false);//make button 0% opacity
			tutorial.setFocusPainted(false); 
			tutorial.setOpaque(false);
			
			//Background
			ImageIcon imgIcon = new ImageIcon(this.getClass().getResource("/Img/BGMenu.gif"));
			JLabel label = new JLabel(imgIcon);
			label.setBounds(-83, -135, 650, 650);
			frame.getContentPane().add(label);
			
			//action button
			start.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==start) {
						//ps.playsound(".//sound//Button_01.wav");
						frame.dispose();
                        Quiz quiz = new Quiz();
					}
					if(e.getSource()==tutorial) {
						//ps.playsound(".//sound//Button_01.wav");
						frame.dispose();
						Tutorial tutorial = new Tutorial();
					}
					
				}
				
			});
			exit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==exit) {
						//ps.playsound(".//sound//Button_01.wav");
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