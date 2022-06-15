package Game;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.*;
import javax.swing.*;


public class Game implements ActionListener{
	
	String[] questions = 	{
								"2 Word",
								"2 Word",
								"2 Word",
								"2 Word",
								"1 Word",
								"2 Word",
								"1 Word"
							};
	String[][] options = 	{
								{"Sit up","Push up","Jump rope","Side Plank"},
								{"Plank","Push up","Squat","Full plank"},
								{"Leg Lunges","Plank","Full Plank","Side Plank"},
								{"V-Sit","Squat","Jumping jack","Jump rope"},
								{"Plank","Full plank","Plank","Squat"},
								{"Side Plank","Leg lunges","Chunches","Jump rope"},
								{"Full plank","Chunches","Squat","V-Sit"}
							};
	char[] answers = 		{
								'A',
								'B',
								'C',
								'C',
								'D',
								'B',
								'B'
							};
	char guess;
	char answer;
	int picImage;
	int index;
	int correct_guesses =0;
	int total_questions = questions.length;
	int result;
	int seconds=10;
	
	
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	playSound ps = new playSound();
	
	
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
			}
		});
	
	public void Game() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Game.class.getResource("/Game/icon.png")));
		frame.setTitle("Healthy Game");
		frame.setSize(650,650);
		frame.setLayout(null);
		frame.setResizable(false);
		
		//no.
		textfield.setBounds(0,0,650,50);
		textfield.setFont(new Font("Ink Free",Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		textfield.setOpaque(false);
		
		
		//question
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setFont(new Font("MV Boli",Font.BOLD,25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		textarea.setOpaque(false);
		
		//buttonA
		buttonA.setBounds(10,350,80,80);
        buttonA.addActionListener(this);
        buttonA.setRolloverEnabled(true);//setRolloverButton
        buttonA.setIcon(new ImageIcon(Menu.class.getResource("/Game/A1.png")));
        buttonA.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/A2.png")));
        buttonA.setBorderPainted(false);//make button visible
        buttonA.setContentAreaFilled(false);//make button 0% opacity
        buttonA.setFocusPainted(false);
        buttonA.setOpaque(false);
		
        //buttonB
		buttonB.setBounds(10,500,80,80);
        buttonB.addActionListener(this);
        buttonB.setRolloverEnabled(true);//setRolloverButton
        buttonB.setIcon(new ImageIcon(Menu.class.getResource("/Game/B1.png")));
        buttonB.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/B2.png")));
        buttonB.setBorderPainted(false);//make button visible
        buttonB.setContentAreaFilled(false);//make button 0% opacity
        buttonB.setFocusPainted(false);
        buttonB.setOpaque(false);
		
        //buttonC
		buttonC.setBounds(300,350,80,80);
        buttonC.addActionListener(this);
        buttonC.setRolloverEnabled(true);//setRolloverButton
        buttonC.setIcon(new ImageIcon(Menu.class.getResource("/Game/C1.png")));
        buttonC.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/C2.png")));
        buttonC.setBorderPainted(false);//make button visible
        buttonC.setContentAreaFilled(false);//make button 0% opacity
        buttonC.setFocusPainted(false);
        buttonC.setOpaque(false);
		
        //buttonD
        buttonD.setBounds(300,500,80,80);
        buttonD.addActionListener(this);
        buttonD.setRolloverEnabled(true);//setRolloverButton
        buttonD.setIcon(new ImageIcon(Menu.class.getResource("/Game/D1.png")));
        buttonD.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Game/D2.png")));
        buttonD.setBorderPainted(false);//make button visible
        buttonD.setContentAreaFilled(false);//make button 0% opacity
        buttonD.setFocusPainted(false); 
        buttonD.setOpaque(false);
        
		answer_labelA.setBounds(100,340,500,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(25,255,0));
		answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		answer_labelB.setBounds(100,490,500,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(25,255,0));
		answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		answer_labelC.setBounds(400,340,500,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(25,255,0));
		answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		answer_labelD.setBounds(400,490,500,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(25,255,0));
		answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		seconds_left.setBounds(535,510,100,100);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,0,0));
		seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		time_label.setBounds(535,475,100,25);
		time_label.setBackground(new Color(50,50,50));
		time_label.setForeground(new Color(255,0,0));
		time_label.setFont(new Font("MV Boli",Font.PLAIN,16));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		
		number_right.setBounds(400,100,235,70);
		number_right.setFont(new Font("Ink Free",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		number_right.setOpaque(false);
		
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.add(number_right);
		frame.setVisible(true);
		
		ImageIcon imgIcon = new ImageIcon(this.getClass().getResource("BGgame.gif"));
		JLabel label = new JLabel(imgIcon);
		label.setBounds(0, 0, 650, 650);
		frame.getContentPane().add(label);
		
		
		nextQuestion();
	}
	
	public void nextQuestion() {
		
		if(index>=total_questions) {
			results();
		}
		else {
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			
			if(e.getSource()==buttonA) {
				ps.playsound(".//sound//Button_01.wav");
				answer= 'A';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonB) {
				ps.playsound(".//sound//Button_01.wav");
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonC) {
				ps.playsound(".//sound//Button_01.wav");
				answer= 'C';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonD) {
				ps.playsound(".//sound//Button_01.wav");
				answer= 'D';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			displayAnswer();		
		
	}
	
	public void displayAnswer() {
		
		timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(1500, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(25,255,0));
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				
				answer = ' ';
				seconds=10;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	public void results(){
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = ((int)correct_guesses);
		
		textfield.setText("RESULTS!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("Score: "+correct_guesses);
		
		
		
		
		String user = JOptionPane.showInputDialog(null, "Enter your name to save your score.");
        
        JOptionPane.showMessageDialog(null, user+": "+result+ " Point" + " \nHas been save!!!");
        
        try {
            FileWriter writer = new FileWriter("Username&Score.txt",true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(user+":"+result+"\n");
            bw.close();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        
		
	}
	
}