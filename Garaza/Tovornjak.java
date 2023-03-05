/*
	Ime datoteke: 	Tovornjak.java
	Avtor:			Darko Šokčević
*/

public class Tovornjak extends Vozilo implements Poraba {
	
	// Vse lastnosti nadrazreda se prenesejo avtomatsko
    // Deklariramo novo lastnost
    private double nosilnost;
    private double Poraba;
    // konstruktor
    public Tovornjak(String znamka, String model, int letnik, double Poraba) {
		
        super(znamka, model, letnik, Poraba);
        this.nosilnost = 14000;
		this.Poraba = Poraba;
    }
    
    // dodatna metoda za nastavitev nosilnosti
    public double pridobiNosilnost() {
		System.out.println("Nostilnost tovornjaka je " + nosilnost + "kg.");
        return this.nosilnost;
		
    }     
	
	//Implementiramo metodo, ki vrne porabo vozila in jo predpisuje vmesnik Poraba
	// Vhodni parametri:  /
	// Potek/opis:        vrne vrednosti
	// Vrne vrednost:     Izpis porabe
	public double getPoraba() {
		
		return Poraba;
		
	}

	public String toString() {
    return "Znamka: " + znamka + ", Model: " + model + ", Letnik: " + letnik + ", nosilnost: " + nosilnost + ", poraba: " + Poraba;
	}
}
	
	