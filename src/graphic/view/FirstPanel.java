package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel 
{
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	public FirstPanel(FirstGUIController baseController)
	
	{
		super();
		this.baseController = baseController;
		
		colorButton = new JButton ("Color!");
		randomButton = new JButton("Random");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()

	{
		this.setBackground(Color.CYAN);
		this.add(randomButton);
		this.add(colorButton);
		this.setLayout(baseLayout);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent click)
		{
			setBackground(Color.GREEN);
		}
			
	});
		
	}

}
