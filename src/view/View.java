package view;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import appli.Simulation;

import javax.swing.AbstractAction;

import java.awt.Font;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import modele.Cellule;


public class View {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private View window;
	private boolean started = false;
	private boolean isPaused = false;
	private Simulation sim;
	private int nourriture = 0;
	private int pheromone = 0;
	private Timer timer;


	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public void launch() {
		this.initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 * 
	 */
	public View() {
		window = this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(started == false){
					sim = new Simulation(window);
					started = true;
				}else if(isPaused == true){
					sim.getTimer().start();
					isPaused = false;
				}
				
			}
		});
		btnStart.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		btnStart.setBounds(335, 120, 89, 23);
		frame.getContentPane().add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(started == true && isPaused == false){
					sim.getTimer().stop();
					isPaused = true;
				}
			}
		});
		btnStop.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		btnStop.setBounds(236, 120, 89, 23);
		frame.getContentPane().add(btnStop);
		
		SpinnerNumberModel model1 = new SpinnerNumberModel(new Integer(30),new Integer(0),new Integer(100),new Integer(1));
		JSpinner spinner = new JSpinner(model1);
		spinner.addChangeListener(new ChangeListener() {
			int tempo = (int) spinner.getValue();
			public void stateChanged(ChangeEvent arg0) {
				if(tempo < (int) spinner.getValue() && (int) spinner.getValue() <= 100){
					sim.getTimer().setDelay((int) spinner.getValue());
				}else if(tempo > (int) spinner.getValue() && (int) spinner.getValue() > 0){
					sim.getTimer().setDelay((int) spinner.getValue());
				}
			}
		});
		spinner.setBounds(10, 29, 150, 23);
		frame.getContentPane().add(spinner);
		
		JLabel lblNumeraPasSimulation = new JLabel("Numera pas simulation");
		lblNumeraPasSimulation.setBounds(10, 10, 150, 23);
		frame.getContentPane().add(lblNumeraPasSimulation);
		
		textField = new JTextField();
		textField.setBounds(10, 80, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNouritureRaporte = new JLabel("Nourriture rapportee");
		lblNouritureRaporte.setBounds(10, 60, 140, 23);
		frame.getContentPane().add(lblNouritureRaporte);
		
		JLabel lblNouritureRestante = new JLabel("Nourriture restante");
		lblNouritureRestante.setBounds(151, 60, 140, 23);
		frame.getContentPane().add(lblNouritureRestante);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 80, 140, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQtePheromone = new JLabel("Quantite pheromone");
		lblQtePheromone.setBounds(290, 60, 140, 23);
		frame.getContentPane().add(lblQtePheromone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(290, 80, 140, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblVitesseDissipation = new JLabel("Vitesse dissipation");
		lblVitesseDissipation.setBounds(161, 10, 150, 23);
		frame.getContentPane().add(lblVitesseDissipation);
		
		SpinnerNumberModel model = new SpinnerNumberModel(0.1,0.1,1.,0.1 );
		JSpinner spinner_1 = new JSpinner(model);
		spinner_1.addChangeListener(new ChangeListener() {
			double value = (double) spinner_1.getValue();
			public void stateChanged(ChangeEvent arg0) {
				if(value < (double) spinner_1.getValue() && (double) spinner_1.getValue() <= 10){
					Cellule.evaporation += 0.1;
				}else if(value > (double) spinner_1.getValue() && (double) spinner_1.getValue() > 0){
					Cellule.evaporation -= 0.1;
				}
				value = (double) spinner_1.getValue();
				System.out.println(Cellule.evaporation);
			}
		});
		spinner_1.setBounds(161, 29, 150, 23);
		frame.getContentPane().add(spinner_1);
	}
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	public void setNourriture(int nour){
		nourriture = nour;
		int nour_apportee = 0 + (6200-nour);
		String s = String.valueOf(nourriture);
		String s1 = String.valueOf(nour_apportee);
		textField_1.setText(s);
		textField.setText(s1);
	}
	
	public void setPheromone(int phero){
		pheromone = phero;
		String s = String.valueOf(phero);
		textField_2.setText(s);
	}
	
	
}
