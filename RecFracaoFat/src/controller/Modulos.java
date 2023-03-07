package controller;

public class Modulos {
	
	public double fracFat (int f, double soma) {
		
		if (f == 1) {
			return 1;
		} else {
			return soma + 1 / (f * fracFat(f-1, soma));
		}
	}
}
