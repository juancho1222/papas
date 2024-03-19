package control;

import java.awt.EventQueue;

public class PapasNativasColombianas {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GestorPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
