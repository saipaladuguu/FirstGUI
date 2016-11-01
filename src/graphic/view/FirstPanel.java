package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;
import java.awt.Color;

public class FirstPanel extends JPanel 
{
	private FirstGUIController baseController;
	
	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}

}
