
/*
Ime datoteke: GarazaTableModel.java
Avtor:		  Darko Šokčević
Vhodni podatki: /
Opis:			/
Izhodni podatki:Vozilo ki smo ga dodali
*/

import javax.swing.table.*;
public class GarazaTableModel extends DefaultTableModel {
	
		public GarazaTableModel() {
			
		super();
		
		//v tabelo dodamo stolpce
		addColumn("Znamka");
		addColumn("Model");
		addColumn("Letnik");
		addColumn("Poraba");
		
		//dodamo naslovno vrstico
	
		Object[] vrstica = new Object[] {"Znamka", "Model", "Letnik", "Poraba"};
		//Dodamo vrstico v tabelo
		System.out.println("Dodajam vrstico");
		addRow(vrstica);
		
		
	}
		
        // Vhodni parametri: v - Vozilo
        // Potek/opis: doda Vozilo  v tabelo
        // Vrne vrednost: /
		// Metoda, ki doda novo vrstico v tabelo
	public void addVozilo(Vozilo v) {
		Object[] data = new Object[4];
		data[0] = v.getZnamka();
		data[1] = v.getModel();
		data[2] = v.getLetnik();
		data[3] = v.getPoraba();	
		addRow(data);
	}
		
}