/*
	Ime datoteke: 	Garaza.java
	Avtor:			Darko Šokčević
	Vhodni podatki: /
	Opis:			Aplikacija z grafičnim uporabniškim vmesnikom za delo z vozili
	Izhodni podatki:Okno grafičnega uporabniškega vmesnika
*/

// Uvozimo pakete za delo z GUI
import javax.swing.*;
import java.awt.FlowLayout;
//Uvozimo paket za delo z dogodki
import java.awt.event.*;


// Deklariramo javni razred
public class Garaza extends JFrame implements ActionListener {

        // Deklariramo zasebne lastnosti
        private JPanel povrsina;
        private JButton dodajJButton;
       private JTextField znamkaPolje, modelPolje, letnikPolje, porabaPolje;
		private JTable tabela;
		private GarazaTableModel modelTabele;

        // Deklariramo javno statično metodo, ki se izvede ob zagonu programa
        // Vhodni parametri: vhodni parametri iz konzole
        // Potek/opis: ustvari novo okno
        // Vrne vrednost: /
        public static void main(String[] args) {
        
                Garaza g = new Garaza("Garaža z vozili");
                
        }
        
        // Javni konstruktor
        // Vhodni parametri: n - naslov okna
        // Potek/opis: ustvari nov objekt tipa Garaza
        // Vrne vrednost: nov objekt
        public Garaza(String n) {
                
                // Kličemo konstruktor nadrazreda
                super(n);
                
                // Inicializiramo zasebne lastnosti
                povrsina = new JPanel(new FlowLayout(FlowLayout.LEFT));
				dodajJButton = new JButton("Dodaj Vozilo");
				znamkaPolje = new JTextField(10); 
				modelPolje = new JTextField(10);
				letnikPolje = new JTextField(10);
				porabaPolje = new JTextField(10);
				modelTabele = new GarazaTableModel();
				tabela = new JTable(modelTabele);
                
                // Površino damo na mizo
                add(povrsina);
				
				dodajJButton.addActionListener(this);
                
                // Dodamo gumb in vnosna polja na površino
                povrsina.add(new JLabel("Znamka:"));
                povrsina.add(znamkaPolje);
				
                povrsina.add(new JLabel("Model:"));
                povrsina.add(modelPolje);
				
				povrsina.add(new JLabel("Letnik:"));
                povrsina.add(letnikPolje);
				
				povrsina.add(new JLabel("Poraba:"));
                povrsina.add(porabaPolje);
				
                povrsina.add(dodajJButton);
				
                povrsina.add(tabela);    
                // Pokažemo okno
                setVisible(true);
                
                // Nastavimo velikost
                setSize(800, 600);
                
                // Nastavimo obnašanje križca (x) - da konča aplikacijo
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                System.out.println("Ustvarjam nov objekt tipa Miza");
                
        }
		// Metoda ki jo predpisuje vmestnik ActionListener
        // Vhodni parametri: dogodek
        // Potek/opis: doda Vozilo na seznam v tabelo
        // Vrne vrednost: /
		public void actionPerformed(ActionEvent ae) {
			
			System.out.println("Dodajam Vozilo ...");
			System.out.println("Znamka: " + znamkaPolje.getText());
			System.out.println("model: " + modelPolje.getText());
			System.out.println("letnik: " + letnikPolje.getText());
			System.out.println("Poraba: " + porabaPolje.getText());
			
			
			//dodamo model v seznam
			     modelTabele.addVozilo(new Vozilo(znamkaPolje.getText(), modelPolje.getText(),
                Integer.parseInt(letnikPolje.getText()), Double.parseDouble(porabaPolje.getText())));
    }
}
