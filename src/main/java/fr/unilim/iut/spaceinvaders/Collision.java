package fr.unilim.iut.spaceinvaders;

public class Collision {
	public boolean detecterCollision(Sprite objetA, Sprite objetB) {
		return (objetA.abscisseLaPlusAGauche() < objetB.abscisseLaPlusADroite() &&
				objetA.abscisseLaPlusADroite() > objetB.abscisseLaPlusAGauche() &&
				objetA.ordonneeLaPlusBasse() < objetB.ordonneeLaPlusHaute() &&
				objetA.ordonneeLaPlusHaute() > objetB.ordonneeLaPlusBasse());
	}
}