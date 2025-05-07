import java.awt.*;
import java.awt.event.*;
public class maxof3 extends Frame implements ActionListener
	{
	TextField num1,num2,num3,result;
	Button findMax;
	public maxof3()
		{
		setLayout(new FlowLayout());
		num1=new TextField(5);
		num2=new TextField(5);
		num3=new TextField(5);
		result=new TextField(15);
		result.setEditable(false);
		findMax=new Button("Find Max");
		add(new Label("Number 1:"));
		add(num1);
		add(new Label("Number 2:"));
		add(num2);
		add(new Label("Number 3:"));
		add(num3);
		add(findMax);
		add(new Label("Max:"));
		add(result);
		findMax.addActionListener(this);
		setTitle("Max of 3 Numbers");
		setSize(250,200);
		setVisible(true);
		addWindowListener(new WindowAdapter()
			{
			public void windowClosing(WindowEvent e)
				{
				dispose();
				}
			});
		}
	public void actionPerformed(ActionEvent e)
		{
		try
		{
		int a=Integer.parseInt(num1.getText());
		int b=Integer.parseInt(num2.getText());
		int c=Integer.parseInt(num3.getText());
		int max=Math.max(a,Math.max(b,c));
		result.setText(String.valueOf(max));
		}
		catch(NumberFormatException ex)
			{
			result.setText("Invalid Imput!");
			}
		}
	public static void main(String[] args)
		{
		new maxof3();
		}
	}
