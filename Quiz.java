import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
	
	String[] questions = 	{
                                "Exercise poses that make you get abdominal muscles",
                                "The first exercise pose when thinking of soldiers",
                                "An exercise position that is similar to a push up but doesn't bring your chest down to the floor",
								"Jump and Slap!!",
                                "Up and down, sit in the air",
                                "Taking a step forward with one leg, lowering the hips until both knees are bent at about a 90-degree angle",
                                "It's like sit-ups but doesn't focus on building abdominal muscles"
                            };
    String[][] options = 	{
								{"Sit up","Push up","Jump rope","Side Plank"},
								{"Elbow Plank","Push up","Squat","Full plank"},
								{"Leg Lunges","Elbow Plank","Full Plank","Side Plank"},
								{"V-Sit","Squat","Jumping jack","Jump rope"},
								{"Jump rope","Full plank","Elbow Plank","Squat"},
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
	JTextField scorebord = new JTextField();
	JTextField scorepoint = new JTextField();
	
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
	
	public Quiz() {

		//Frame
        frame.setTitle("Guy Gamlang Okk");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Img/Icon.png")));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		//Timer
		seconds_left.setBounds(540,0,100,170);
		seconds_left.setForeground(new Color(178,102,255));
		seconds_left.setFont(new Font("Trebuchet MS",Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(false);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		//QuestionNumber
		textfield.setBounds(0,0,540,50);
		textfield.setFont(new Font("Trebuchet MS",Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		textfield.setOpaque(false);
		
		//Question
		textarea.setBounds(0,50,540,120);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setFont(new Font("Trebuchet MS",Font.BOLD,20));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		textarea.setOpaque(false);
		
		//ButtonA
		buttonA.setBounds(20,410,80,80);
        buttonA.addActionListener(this);
        buttonA.setRolloverEnabled(true);//setRolloverButton
        buttonA.setIcon(new ImageIcon(Menu.class.getResource("/Img/A1.png")));
        buttonA.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/A2.png")));
        buttonA.setBorderPainted(false);//make button visible
        buttonA.setContentAreaFilled(false);//make button 0% opacity
        buttonA.setFocusPainted(false);
        buttonA.setOpaque(false);
		
		//ButtonB
		buttonB.setBounds(320,410,80,80);
        buttonB.addActionListener(this);
        buttonB.setRolloverEnabled(true);//setRolloverButton
        buttonB.setIcon(new ImageIcon(Menu.class.getResource("/Img/B1.png")));
        buttonB.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/B2.png")));
        buttonB.setBorderPainted(false);//make button visible
        buttonB.setContentAreaFilled(false);//make button 0% opacity
        buttonB.setFocusPainted(false);
        buttonB.setOpaque(false);

		//ButtonC
		buttonC.setBounds(20,510,80,80);
        buttonC.addActionListener(this);
        buttonC.setRolloverEnabled(true);//setRolloverButton
        buttonC.setIcon(new ImageIcon(Menu.class.getResource("/Img/C1.png")));
        buttonC.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/C2.png")));
        buttonC.setBorderPainted(false);//make button visible
        buttonC.setContentAreaFilled(false);//make button 0% opacity
        buttonC.setFocusPainted(false);
        buttonC.setOpaque(false);
		
		//ButtonD
		buttonD.setBounds(320,510,80,80);
		buttonD.setFocusable(false);
		buttonD.setRolloverEnabled(true);
		buttonD.setBorderPainted(false);//make button visible
        buttonD.setContentAreaFilled(false);//make button 0% opacity
		buttonD.addActionListener(this);
		buttonD.setIcon(new ImageIcon(Menu.class.getResource("/Img/D1.png")));
        buttonD.setRolloverIcon(new ImageIcon(Menu.class.getResource("/Img/D2.png")));
		
		//AnswerA
		answer_labelA.setBounds(120,400,500,100);
		answer_labelA.setFont(new Font("Trebuchet MS",Font.BOLD,20));
		
		//AnswerB
		answer_labelB.setBounds(430,400,500,100);
		answer_labelB.setFont(new Font("Trebuchet MS",Font.BOLD,20));
		
		//AnswerC
		answer_labelC.setBounds(120,500,500,100);
		answer_labelC.setFont(new Font("Trebuchet MS",Font.BOLD,20));
		
		//AnswerD
		answer_labelD.setBounds(430,500,500,100);
		answer_labelD.setFont(new Font("Trebuchet MS",Font.BOLD,20));
		
		scorebord.setBounds(225,225,200,100);
		scorebord.setBackground(new Color(25,25,25));
		scorebord.setForeground(new Color(25,255,0));
		scorebord.setFont(new Font("Trebuchet MS",Font.BOLD,25));
		scorebord.setBorder(BorderFactory.createBevelBorder(1));
		scorebord.setHorizontalAlignment(JTextField.CENTER);
		scorebord.setEditable(false);
		
		scorepoint.setBounds(225,325,200,100);
		scorepoint.setBackground(new Color(25,25,25));
		scorepoint.setForeground(new Color(25,255,0));
		scorepoint.setFont(new Font("Trebuchet MS",Font.BOLD,50));
		scorepoint.setBorder(BorderFactory.createBevelBorder(1));
		scorepoint.setHorizontalAlignment(JTextField.CENTER);
		scorepoint.setEditable(false);
		
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
		frame.setVisible(true);

		ImageIcon imgIcon = new ImageIcon(this.getClass().getResource("/Img/StaticImage.png"));
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
				answer= 'A';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonB) {
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonC) {
				answer= 'C';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonD) {
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
		
		Timer pause = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(64,64,64));
				answer_labelB.setForeground(new Color(64,64,64));
				answer_labelC.setForeground(new Color(64,64,64));
				answer_labelD.setForeground(new Color(64,64,64));
				
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
		
		textfield.setText("Congratulations!!");
		textarea.setText("eiei");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		scorebord.setText("Your Score");
		scorepoint.setText(correct_guesses+"");
		
		frame.add(scorebord);
		frame.add(scorepoint);
		
	}
}
