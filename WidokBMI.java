
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WidokBMI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double Wzrost,Waga,BMI;
	JButton ObliczBMI, Dieta ;
	JLabel lWzrost,lWaga,lBMI;
	JTextField tWzrost, tWaga;
	
	private double Obliczanie_BMI(double Wzrost, double Waga) {
		
		this.Wzrost = Wzrost;
		this.Waga = Waga;
		
		Wzrost = Wzrost/100;
		double WzrostKwadrat= Wzrost*Wzrost;
		BMI = Waga / WzrostKwadrat;
		
		
		return BMI;
	}
	
	public WidokBMI () {
		setSize(300,500);
		setTitle("Obliczanie BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		
		lWzrost = new JLabel("Wzrost:");
		lWzrost.setBounds(5, 15, 80, 10);
		add(lWzrost);
		
		lWaga = new JLabel("Waga:");
		lWaga.setBounds(5, 50, 80, 15);
		add(lWaga);
		
		tWzrost = new JTextField("");
		tWzrost.setBounds(70, 15, 70, 20);
		add(tWzrost);
		
		tWaga = new JTextField("");
		tWaga.setBounds(70, 50, 70, 20);
		add(tWaga);
		
		ObliczBMI = new JButton("Oblicz BMI");
		ObliczBMI.setBounds(90,100,120,50);
		add(ObliczBMI);
		ObliczBMI.addActionListener(this);
		
		Dieta = new JButton("Do Diety");
		Dieta.setBounds(90,350,120,50);
		Dieta.setVisible(false);
		add(Dieta);
		Dieta.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
	
		if	(e.getActionCommand().equals("Oblicz BMI")) {
			
			Wzrost = Integer.parseInt(tWzrost.getText());
			Waga = Integer.parseInt(tWaga.getText());
			
			BMI=Obliczanie_BMI(Wzrost,Waga);
			BMItekst tekst = new BMItekst();
					if (BMI<18)
						{
						lBMI=tekst.niedowaga();
						add(lBMI);
						repaint();
						
						}
					if (BMI>=18 && BMI<=25) {
						lBMI=tekst.dobra_waga();
						add(lBMI);
						repaint();
						
					}
					if (BMI>25 && BMI<=30) {
						lBMI=tekst.nadwaga();
						add(lBMI);
						repaint();
						
					}
					if (BMI>30 && BMI<=40) {
						lBMI=tekst.otylosc();
						add(lBMI);
						repaint();
						
					}				
					if (BMI>40) {
						lBMI=tekst.spasiony();
						add(lBMI);
						repaint();
						
					}
					Dieta.setVisible(true);
			
			
		}
		if	(e.getActionCommand().equals("Do Diety")) {
			System.out.println((int)BMI);
			WidokDieta Dieta = new WidokDieta(BMI);
			Dieta.repaint();
			dispose();
		}
		
	}
	
	
	
}
