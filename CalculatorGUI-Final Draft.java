import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.Scanner; 

public class CalcGUI extends JFrame implements ActionListener {
	 private JPanel contentPane;
	 private JTextField textField;
	 public CalcGUI(){};
	 public static void main(String[] args)
	 {
		 CalcGUI frame = new CalcGUI();
		 frame.setVisible(true);
	 }
}
//Creating JTextField element at the Top	 
 public CalcGUI()         
 {
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(100, 100, 500, 750);
	 contentPane.setBorder(new EmptyBorder(5,5,5,5));
	 contentPane.setLayout(new BorderLayout(0,0));
	 setContentPane(contentPane); 
	 JPanel text=new JPanel(); 
	 contentPane.add(panel1,BorderLayout.CENTER); 
	 textField=new JTextField();
	 textField.setHorizontalAlignment(SwingConstants.RIGHT);
	 text.add(textField); 
	 
	 JPanel Keyboard = new JPanel();//create keyboard panel in the calculator
	 contentPane.add(Keyboard, BorderLayout.SOUTH); 
	 Keyboard.setLayout(new GridLayout(5,5,5,5)); 
	 JButton button01 = new JButton("1"); //Adding buttons to the keyboard
     button01.setActionCommand("CMD_One");//add command relates to button01
	 button01.addActionListener(this);	 //addActionListener
	 Keyboard.add(button01);  
	 
	 
	 
	 JButton button02 = new JButton("2"); 
     button02.setActionCommand("CMD_Two");
	 button02.addActionListener(this);	 
	 Keyboard.add(button02);  
	 
	 
	 JButton button03 = new JButton("3");    
	 button03.setActionCommand("CMD_Three");
	 button03.addActionListener(this);
	 Keyboard.add(button03);  
	 
	 JButton buttonPlus = new JButton("+"); 
     buttonPlus.setActionCommand("CMD_Plus");
	 buttonPlus.addActionListener(this);	 
	 Keyboard.add(buttonPlus);
	 
	 JButton buttonBS = new JButton("<<");
     buttonBS.setActionCommand("CMD_BackSpace");
	 buttonBS.addActionListener(this);	 
	 Keyboard.add(buttonBs);  
	 
	 JButton button04 = new JButton("4");   
     button04.setActionCommand("CMD_Four");
	 button04.addActionListener(this);	 
	 Keyboard.add(button04);  
	 
	 JButton button05 = new JButton("5"); 
     button04.setActionCommand("CMD_Five");
	 button04.addActionListener(this);	 
	 Keyboard.add(button05);  
	 
	 JButton button06 = new JButton("6");    
	 button04.setActionCommand("CMD_Six");
	 button04.addActionListener(this);
	 Keyboard.add(button06);  
	 
	 JButton buttonMinus = new JButton("-");    
	 button04.setActionCommand("CMD_minus");
	 button04.addActionListener(this);
	 Keyboard.add(buttonMinus);  
	 
	 JButton buttonClear = new JButton("C");
     button04.setActionCommand("CMD_Clear");
	 button04.addActionListener(this);	 
	 Keyboard.add(buttonClear);  
	 
	 JButton button07 = new JButton("7");    
	 button04.setActionCommand("CMD_Seven");
	 button04.addActionListener(this);
	 Keyboard.add(button07);  
	 
	 JButton button08 = new JButton("8");    
	 button04.setActionCommand("CMD_Eight");
	 button04.addActionListener(this);
	 Keyboard.add(button08);  
	 
	 JButton button09 = new JButton("9");    
	 button04.setActionCommand("CMD_Nine");
	 button04.addActionListener(this);
	 Keyboard.add(button09);  
	 
	 JButton buttonTimes = new JButton("*");    
	 buttonTimes.setActionCommand("CMD_Multiplication");
	 buttonTimes.addActionListener(this);
	 Keyboard.add(buttonTimes);  
	 
	 JButton buttonLB = new JButton("(");    
	 buttonLB.setActionCommand("CMD_OpenBracket");
	 buttonLB.addActionListener(this);
	 Keyboard.add(buttonLB);  
	 
	 JButton buttonSign = new JButton("+/-");    
	 buttonSign.setActionCommand("CMD_SCh");
	 buttonSign.addActionListener(this);
	 Keyboard.add(buttonSign);  
	 
	 JButton button00 = new JButton("0");    
	 button00.setActionCommand("CMD_Zero");
	 button00.addActionListener(this);
	 Keyboard.add(button00);  
	 
	 JButton buttonDot = new JButton(".");    
	 uttonDot.setActionCommand("CMD_Dot");
	 buttonDot.addActionListener(this);
	 Keyboard.add(buttonDot);  
	 
	 JButton buttonDiv = new JButton("/");    
	 buttonDiv.setActionCommand("CMD_Division");
	 buttonDiv.addActionListener(this);
	 Keyboard.add(buttonDiv);  
	 
	 JButton buttonTimes = new JButton(")");    
	 buttonRB.setActionCommand("CMD_CloseBracket");
	 buttonRB.addActionListener(this);
	 Keyboard.add(buttonRB);  
	 
	 JButton buttonEqual = new JButton("="); 
	 buttonEqual.setActionCommand("CMD_Equal");
	 buttonEqual.addActionListener(this);
	 Keyboard.add(buttonEqual);  
	 
	 JButton buttonFact = new JButton("!");    
	 buttonFact.setActionCommand("CMD_Factorize");
	 buttonFact.addActionListener(this);
	 Keyboard.add(buttonFact);  
	 
	 JButton buttonEXIT = new JButton("OFF");    
	 button04.setActionCommand("CMD_EXIT");
	 button04.addActionListener(this);
	 Keyboard.add(buttonEXIT);  
 }
 
 public void actionPerformed(ActionEvent e) { //reaction when each command occured
        String cmd = e.setActionCommand();
        if (cmd.equals("CMD_One")) {
           expression = expression + "1";
        } else
        if (cmd.equals("CMD_Two")) {
           expression = expression + "2";
        } else
        if (cmd.equals("CMD_Three")) {
           expression = expression + "3";
        } else
	    if (cmd.equals("CMD_Four")) {
           expression = expression + "4";
        } else
	    if (cmd.equals("CMD_Five")) {
           expression = expression + "5";
        } else
		if (cmd.equals("CMD_Six")) {
           expression = expression + "6";
        } else
		if (cmd.equals("CMD_Seven")) {
           expression = expression + "7";
        } else
		if (cmd.equals("CMD_Eight")) {
           expression = expression + "8";
        } else
		if (cmd.equals("CMD_Nine")) {
           expression = expression + "9";
        } else
		if (cmd.equals("CMD_Zero")) {
           expression = expression + "0";
        } else
         if (cmd.equals("CMD_Three")) {
           expression = expression + "3";
        } else			
	     if (cmd.equals("CMD_SCh")) {
           expression = "-" + expression;
        } else		
		if (cmd.equals("CMD_OpenBracket")) {
           expression = expression + "（";
		 } else	
		if (cmd.equals("CMD_CloseBracket")) {
           expression = expression + "）";
		 } else	
		if (cmd.equals("CMD_Dot")) {
           expression = expression + ".";
		 } else		 
		if (cmd.equals("CMD_Clear")) {
           expression = 0;	 
		 if (cmd.equals("CMD_Plus")) {
           expression = expression + "+";
        } else
		if (cmd.equals("CMD_minus")) {
           expression = expression + "-";
        } else
		if (cmd.equals("CMD_Multiplication")) {
           expression = expression + "*";
        } elseif (cmd.equals("CMD_Division")) {
           expression = expression + "/";
        } else	
		if (cmd.equals("CMD_Factorize")) {
           expression = expression + "!";
        } else
		if (cmd.equals("CMD_EXIT")) {
           expression = null;
		} else
		if (command.equals("CMD_BackSpace")) {
            int len = displayText.length();
            displayText = displayText.substring(0, len-1);
        } else
		if (cmd.equals("CMD_Equal")) {//calculate the result
           expression =  if (cmd.equals("CMD_Division"));
		   {expression = a/b
		 } else
		   if (cmd.equals("CMD_minus"));
		   {expression = a-b
		 } else
			if (cmd.equals("CMD_Plus"));
		   {expression = a+b
		 } else
			if (cmd.equals("CMD_Multiplication"));
		   {expression = a*b
		 } else
			 if (cmd.equals("CMD_Factorize"));
		   {expression = a!
		 } else
        textField.setText(expression);       
    }
	public class Calculation { //calculate scanned text from displayText 
		public static void main(String[] args) {
			Scanner display = new Scanner(System.in);//object to scan in displayText
			int a;
			int b;
			String c;
			int Expression
			System.out.println(textField);
			
			String displayText = displayText.nextDouble();
			System.out.println(expression);
		}
		
	
 public static void main (String[] args) {
        CalcGUI  = new CalcGUI();
        calc.setVisible(true); //let the calculator be visualized
    }
	
} 
 

 
 
	 