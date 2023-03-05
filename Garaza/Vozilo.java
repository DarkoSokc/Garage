/*
	Ime datoteke: 	Vozilo.java
	Avtor:			Darko Šokčević

*/

public class Vozilo {
    // lastnosti
    protected String znamka;
    protected String model;
    protected int letnik;
	protected double Poraba;
    protected int hitrost;
    protected boolean motorVklopljen;
	
    
    // konstruktor
    public Vozilo(String znamka, String model, int letnik, double Poraba) {
        this.znamka = znamka;
        this.model = model;
        this.letnik = letnik;
		this.Poraba = Poraba;
        this.hitrost = 0;
        this.motorVklopljen = false;
		
    }
    
	 public String getZnamka() {
        return znamka;
    }
	
	  public String getModel() {
        return model;
    }
	
	public int getLetnik() {
        return letnik;
    }
	
	public double getPoraba() {
        return Poraba;
    }
	
    // metoda za vklop motorja
    public void vklopiMotor() {
        if (!this.motorVklopljen) {
            System.out.println("Motor je vklopljen.");
            this.motorVklopljen = true;
        } else {
            System.out.println("Motor je že bil vklopljen.");
        }
    }
    
    // metoda za pridobitev trenutne hitrosti vozila
    public int pridobiHitrost() {
        return this.hitrost;
    }
    
    // metoda za pospeševanje vozila
    public void pospesi(int hitrost) {
        if (this.motorVklopljen) {
            this.hitrost += hitrost;
            System.out.println("Vozilo je pospesilo na hitrost " + this.hitrost + " km/h.");
        } else {
            System.out.println("Motor ni vklopljen, zato vozilo ne more pospesevati.");
        }
    }
	
    // metoda za ustavitev vozila
    public void ustavi() {
        if (this.hitrost == 0) {
            System.out.println("Vozilo je ze ustavljeno.");
        } else {
            this.hitrost = 0;
            System.out.println("Vozilo se je ustavilo.");
        }
    }
	
	public String toString() {
    return "Znamka: " + znamka + ", Model: " + model + ", Letnik: " + letnik + ", Poraba: " + Poraba;
	}	
}	
