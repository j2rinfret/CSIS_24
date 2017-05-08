// Program name: Tic Tac Toe 
// Chapter and pg number: Final project
// Name: Jonathan Rinfret
// Date: 11/15/2016
// Description: This is a Tic Tac Toe game


import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class Tic_Tac_Toe extends JFrame
{
	private JFrame mainFrame;
	private JFrame secondFrame;
	private JButton[][] button = new JButton[3][3];
	private JTextField txtMessage;
	private JTextField txtMessage_2;
	private String player = "X";
	private int count;
	int answer =0;
	private JButton noButton;
	private JButton yesButton;
	private JButton dumbButton;
	
	
	public Tic_Tac_Toe()
	{
		mainFrame = new JFrame("Tic Tac Toe");
		txtMessage = new JTextField("Player X");
		txtMessage.setEditable(false);
		
		Container C = mainFrame.getContentPane();
		C.setLayout(new GridLayout(0, 3));
		
		button[0][0] = new JButton("00");
		button[0][1] = new JButton("01");
		button[0][2] = new JButton("02");
		button[1][0] = new JButton("10");
		button[1][1] = new JButton("11");
		button[1][2] = new JButton("12");
		button[2][0] = new JButton("20");
		button[2][1] = new JButton("21");
		button[2][2] = new JButton("22");
		
		
		C.add(button[0][0]);
		C.add(button[0][1]);
		C.add(button[0][2]);
		C.add(button[1][0]);
		C.add(button[1][1]);
		C.add(button[1][2]);
		C.add(button[2][0]);
		C.add(button[2][1]);
		C.add(button[2][2]);
	
		C.add(txtMessage, BorderLayout.NORTH);
		
		mainFrame.setSize(600,800);
		
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		secondFrame = new JFrame("Play Again?");
		txtMessage_2 = new JTextField("\nDo you want to play again?\n");
		txtMessage_2.setEditable(false);
		
		Container D = secondFrame.getContentPane();
		D.setLayout(new GridLayout(0, 2));
		dumbButton = new JButton();
		dumbButton.setEnabled(false);
		yesButton = new JButton("Yes");
		noButton = new JButton("No");
		
		D.add(txtMessage_2, BorderLayout.NORTH);
		D.add(dumbButton);
		D.add(yesButton);
		D.add(noButton);
		
		
		secondFrame.setSize(500,300);
		
		secondFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		
		class ButtonsHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				//change condition for x player clicking on button
				if(player =="X")
				{
					count =0;
					if(e.getSource() == button[0][0])
					{
						
						button[0][0].setText("X");
						button[0][0].setEnabled(false);
					}
					if(e.getSource() == button[0][1])
					{
						
						button[0][1].setText("X");
						button[0][1].setEnabled(false);
					}
					if(e.getSource() == button[0][2])
					{
						
						button[0][2].setText("X");
						button[0][2].setEnabled(false);
					}
					if(e.getSource() == button[1][0])
					{
						
						button[1][0].setText("X");
						button[1][0].setEnabled(false);
					}
					if(e.getSource() == button[1][1])
					{
						
						button[1][1].setText("X");
						button[1][1].setEnabled(false);
					}
					if(e.getSource() == button[1][2])
					{
						
						button[1][2].setText("X");
						button[1][2].setEnabled(false);
					}
					if(e.getSource() == button[2][0])
					{
						
						button[2][0].setText("X");
						button[2][0].setEnabled(false);
					}
					if(e.getSource() == button[2][1])
					{
						
						button[2][1].setText("X");
						button[2][1].setEnabled(false);
					}
					if(e.getSource() == button[2][2])
					{
						
						button[2][2].setText("X");
						button[2][2].setEnabled(false);
					}
					
				
				}
				
				//change condition for O player clicking on button
				if(player=="O")
				{
					count =1;
					if(e.getSource() == button[0][0])
					{
						
						button[0][0].setText("O");
						button[0][0].setEnabled(false);
					}
					if(e.getSource() == button[0][1])
					{
						
						button[0][1].setText("O");
						button[0][1].setEnabled(false);
					}
					if(e.getSource() == button[0][2])
					{
						
						button[0][2].setText("O");
						button[0][2].setEnabled(false);
					}
					if(e.getSource() == button[1][0])
					{
						
						button[1][0].setText("O");
						button[1][0].setEnabled(false);
					}
					if(e.getSource() == button[1][1])
					{
						
						button[1][1].setText("O");
						button[1][1].setEnabled(false);
					}
					if(e.getSource() == button[1][2])
					{
						
						button[1][2].setText("O");
						button[1][2].setEnabled(false);
					}
					if(e.getSource() == button[2][0])
					{
						
						button[2][0].setText("O");
						button[2][0].setEnabled(false);
					}
					if(e.getSource() == button[2][1])
					{
						
						button[2][1].setText("O");
						button[2][1].setEnabled(false);
					}
					if(e.getSource() == button[2][2])
					{
						
						button[2][2].setText("O");
						button[2][2].setEnabled(false);
					}
					
				}
				
				if(player=="X" && count ==0)
				{
					player="O";
					txtMessage.setText("Player O");
				}
				
				if(player=="O" && count ==1)
				{
					player="X";
					txtMessage.setText("Player X");
				}
				
				
				//win conditions
				//win condition horizontal
				if(button[0][0].getText() == button[0][1].getText() && button[0][1].getText() == button[0][2].getText() && button[0][0].getText() == button[0][2].getText() || button[1][0].getText() == button[1][1].getText() && button[1][1].getText() == button[1][2].getText() && button[1][0].getText() == button[1][2].getText() ||  button[2][0].getText() == button[2][1].getText() && button[2][1].getText() == button[2][2].getText() && button[2][0].getText() == button[2][2].getText() )
				{
					secondFrame.setVisible(true);
					
					if(e.getSource()==yesButton)
					{
						
						mainFrame.dispose();
						secondFrame.dispose();
						Tic_Tac_Toe program;	
						program = new Tic_Tac_Toe();
					}
					if(e.getSource()==noButton)
					{
						mainFrame.dispose();
						secondFrame.dispose();
						System.exit(0);
					}
				}
				//win condition veritcal
				if(button[0][0].getText() == button[1][0].getText() && button[1][0].getText() == button[2][0].getText() && button[0][0].getText() == button[2][0].getText() || button[0][1].getText() == button[1][1].getText() && button[0][1].getText() == button[2][1].getText() && button[1][1].getText() == button[2][1].getText() ||  button[0][2].getText() == button[1][2].getText() && button[2][2].getText() == button[1][2].getText() && button[0][2].getText() == button[2][2].getText() )
				{
					
					secondFrame.setVisible(true);
					
					if(e.getSource()==yesButton)
					{
						
						mainFrame.dispose();
						secondFrame.dispose();
						Tic_Tac_Toe program;	
						program = new Tic_Tac_Toe();
					}
					if(e.getSource()==noButton)
					{
						mainFrame.dispose();
						secondFrame.dispose();
						System.exit(0);
					}
				}
				//win condition diagonal
				if(button[0][0].getText() == button[1][1].getText() && button[1][1].getText() == button[2][2].getText() && button[0][0].getText() == button[2][2].getText() || button[0][2].getText() == button[1][1].getText() && button[1][1].getText() == button[2][0].getText() && button[0][2].getText() == button[2][0].getText()  )
				{
					secondFrame.setVisible(true);

					if(e.getSource()==yesButton)
					{
						
						mainFrame.dispose();
						secondFrame.dispose();
						Tic_Tac_Toe program;	
						program = new Tic_Tac_Toe();
					}
					if(e.getSource()==noButton)
					{
						mainFrame.dispose();
						secondFrame.dispose();
						System.exit(0);
					}
				}
			}
			
		}
		
		ButtonsHandler bhandler = new ButtonsHandler();
		button[0][0].addActionListener(bhandler);
		button[0][1].addActionListener(bhandler);
		button[0][2].addActionListener(bhandler);
		button[1][0].addActionListener(bhandler);
		button[1][1].addActionListener(bhandler);
		button[1][2].addActionListener(bhandler);
		button[2][0].addActionListener(bhandler);
		button[2][1].addActionListener(bhandler);
		button[2][2].addActionListener(bhandler);
		
		yesButton.addActionListener(bhandler);
		noButton.addActionListener(bhandler);
		
		secondFrame.setVisible(false);
		mainFrame.setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		Tic_Tac_Toe program;	
		program = new Tic_Tac_Toe();
	}
	
}

//OUTPUT OF PROGRAM	
/*
	Displays a GUI for a tic tac toe game.
	the second frame also works and displays the correct information. All win conditions work for both teams.
*/