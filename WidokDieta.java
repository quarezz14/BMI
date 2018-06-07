import javax.swing.JFrame;
import javax.swing.JLabel;

public class WidokDieta extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double BMI;
	JLabel weglowodany,bialka,tluszcze,kalorie,posilki;
	
	public WidokDieta(double BMI)
	{
		this.BMI= BMI;
		setSize(500,300);
		setTitle("Dieta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		if (BMI<18) {
		posilki = new JLabel("ilosc posilkow dziennie:");
		posilki.setBounds(5, 15, 200, 20);
		add(posilki);
		
		kalorie = new JLabel("ilosc kalorii:");
		kalorie.setBounds(5, 45, 200, 20);
		add(kalorie);
		
		weglowodany = new JLabel("ilosc weglowodanow:");
		weglowodany.setBounds(5, 75, 200, 20);
		add(weglowodany);
		
		bialka = new JLabel("ilosc bialka:");
		bialka.setBounds(5, 105, 200, 20);
		add(bialka);
		
		tluszcze = new JLabel("ilosc tluszczy:");
		tluszcze.setBounds(5, 135, 200, 20);
		add(tluszcze);
		repaint();
		}
		
		if (BMI>=18 && BMI<=25) {
			posilki = new JLabel("ilosc posilkow dziennie:");
			posilki.setBounds(5, 15, 200, 20);
			add(posilki);
			
			kalorie = new JLabel("ilosc kalorii:");
			kalorie.setBounds(5, 45, 200, 20);
			add(kalorie);
			
			weglowodany = new JLabel("ilosc weglowodanow:");
			weglowodany.setBounds(5, 75, 200, 20);
			add(weglowodany);
			
			bialka = new JLabel("ilosc bialka:");
			bialka.setBounds(5, 105, 200, 20);
			add(bialka);
			
			tluszcze = new JLabel("ilosc tluszczy:");
			tluszcze.setBounds(5, 135, 200, 20);
			add(tluszcze);
			repaint();
			
		}
		if (BMI>25 && BMI<=30) {
			posilki = new JLabel("ilosc posilkow dziennie:");
			posilki.setBounds(5, 15, 200, 20);
			add(posilki);
			
			kalorie = new JLabel("ilosc kalorii:");
			kalorie.setBounds(5, 45, 200, 20);
			add(kalorie);
			
			weglowodany = new JLabel("ilosc weglowodanow:");
			weglowodany.setBounds(5, 75, 200, 20);
			add(weglowodany);
			
			bialka = new JLabel("ilosc bialka:");
			bialka.setBounds(5, 105, 200, 20);
			add(bialka);
			
			tluszcze = new JLabel("ilosc tluszczy:");
			tluszcze.setBounds(5, 135, 200, 20);
			add(tluszcze);
			repaint();
			
		}
		if (BMI>30 && BMI<=40) {
			posilki = new JLabel("ilosc posilkow dziennie:");
			posilki.setBounds(5, 15, 200, 20);
			add(posilki);
			
			kalorie = new JLabel("ilosc kalorii:");
			kalorie.setBounds(5, 45, 200, 20);
			add(kalorie);
			
			weglowodany = new JLabel("ilosc weglowodanow:");
			weglowodany.setBounds(5, 75, 200, 20);
			add(weglowodany);
			
			bialka = new JLabel("ilosc bialka:");
			bialka.setBounds(5, 105, 200, 20);
			add(bialka);
			
			tluszcze = new JLabel("ilosc tluszczy:");
			tluszcze.setBounds(5, 135, 200, 20);
			add(tluszcze);
			repaint();
			
		}				
		if (BMI>40) {
			posilki = new JLabel("ilosc posilkow dziennie:");
			posilki.setBounds(5, 15, 200, 20);
			add(posilki);
			
			kalorie = new JLabel("ilosc kalorii:");
			kalorie.setBounds(5, 45, 200, 20);
			add(kalorie);
			
			weglowodany = new JLabel("ilosc weglowodanow:");
			weglowodany.setBounds(5, 75, 200, 20);
			add(weglowodany);
			
			bialka = new JLabel("ilosc bialka:");
			bialka.setBounds(5, 105, 200, 20);
			add(bialka);
			
			tluszcze = new JLabel("ilosc tluszczy:");
			tluszcze.setBounds(5, 135, 200, 20);
			add(tluszcze);
			repaint();

		
		
		
	}

}}
