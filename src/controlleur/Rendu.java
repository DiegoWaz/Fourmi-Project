package controlleur;


import view.View;
/**
 * classe principale, ne contient que le main
 */
public class Rendu
{
	/** cree un objet PanelEnvironment */
	public static void main(String args[])
	{
		View v = new View();
		v.launch();
	}
}
