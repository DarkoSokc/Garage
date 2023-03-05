/*
	Ime datoteke: 	Avtomobil.java
	Avtor:			Darko Šokčević
*/

// Deklariramo javni razred, ki raširja razed steklenica
public class Avtomobil extends Vozilo implements Poraba {
	
	// Vse lastnosti nadrazreda se prenesejo avtomatsko
	// Deklariramo novo lastnost
    private boolean vklopKlime; 
	private double Poraba;

	// Javni konstruktor
	// Vhodni parametri:  znamka, model, letnik, vklopKlime
	// Potek/opis:        ustvari nov objekt tipa Avtomobil
	// Vrne vrednost:     nov objekt
    public Avtomobil(String znamka, String model, int letnik, boolean vklopKlime, double Poraba) {
		
		// Pokličemo konstruktor nadrazreda
        super(znamka, model, letnik, Poraba);
	
        this.vklopKlime = false;
		this.Poraba = Poraba;
    }

	// Javna metoda, ki vklopi klimo
	// Vhodni parametri: 
	// Potek/opis:       Pove ali je klima vklopljena ali ne
	// Vrne vrednost:   
    public void vklopiKlimo() {
        if (!this.vklopKlime) {
            System.out.println("Klima je vklopljena.");
            this.vklopKlime = true;
        } else {
            System.out.println("Klima je ze bila vklopljena.");
        }
    }
	
	//Implementiramo metodo, ki vrne porabo vozila in jo predpisuje vmesnik Poraba
	// Vhodni parametri:  /
	// Potek/opis:        vrne vrednosti
	// Vrne vrednost:     Izpis porabe
	public double getPoraba() {
		
		return Poraba;
		
	}
	

}
