import java.awt.Color;

import javax.swing.JLabel;

public class BMItekst {
	
	JLabel lBMI;
	
	public JLabel niedowaga()
	{
		
		lBMI = new JLabel("MUSISZ PRZYTYÆ!");
		lBMI.setBounds(20, 220, 250, 50);
		lBMI.setOpaque(true);
		lBMI.setBackground(new Color(176,196,222));
		return lBMI;
	}
	
	public JLabel dobra_waga() {
		lBMI = new JLabel("MASZ IDEALNA WAGE!");
		lBMI.setBounds(20, 220, 250, 50);
		lBMI.setOpaque(true);
		lBMI.setBackground(new Color(0,255,0));
		return lBMI;
	}
	
	public JLabel nadwaga()
	{
		
		lBMI = new JLabel("MASZ LEKKA NADWAGE");
		lBMI.setBounds(20, 220, 250, 50);
		lBMI.setOpaque(true);
		lBMI.setBackground(new Color(255,215,0));
		return lBMI;
	}
	
	public JLabel otylosc()
	{
		lBMI = new JLabel("JESTES OTY£Y");
		lBMI.setBounds(20, 220, 250, 50);
		lBMI.setOpaque(true);
		lBMI.setBackground(new Color(255,69,0));
		return lBMI;
	}
	
	public JLabel spasiony()
	{
		
		lBMI = new JLabel("JESTES MEGA SPASIONY");
		lBMI.setBounds(20, 220, 250, 50);
		lBMI.setOpaque(true);
		lBMI.setBackground(new Color(255,0,0));
		return lBMI;
	}

//test
}
