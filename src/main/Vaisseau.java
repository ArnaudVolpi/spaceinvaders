package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class Vaisseau extends Sprite {
	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
	}

	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		if (dimensionMissile.longueur() > this.dimension.longueur()) {
			try {
				throw new MissileException("La longueur du missile est sup�rieure � celle du vaisseau!");
			} catch (MissileException me) {
				me.printStackTrace();
			}
		}
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);
		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		return new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
	}
}