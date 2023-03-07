package view;
import javax.swing.JOptionPane;
import controller.Modulos;

public class Main {

	public static void main(String[] args) {
		Modulos m = new Modulos();
		
		int fat = 0;
		do {
			fat = Integer.parseInt(JOptionPane.showInputDialog("Fatorial de : "));
		} while (fat > 10);
		
		double somaT = 0;
		
		double retorno = m.fracFat(fat, somaT);
		System.out.println(retorno);
	}

}
