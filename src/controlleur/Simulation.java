package controlleur;

import view.View;
import modele.Terrain;
import view.PanelEnvironment;
import javax.swing.Timer;

public class Simulation {
	
	private PanelEnvironment panelEnv;
	
	public Simulation(View window){
		int tailleTerrain = 50;
		int nbFourmis = 300;
		int tauxDeRaffraichissementEnMilliseconde = 10;
		Terrain terrain = new Terrain(tailleTerrain, nbFourmis);
		panelEnv = new PanelEnvironment(terrain, tauxDeRaffraichissementEnMilliseconde,window);
	}
	
	public Timer getTimer(){
		return panelEnv.getTimer();
	}
}
