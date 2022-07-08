package com.ets.Strategie;

public class RestaurantMontr�al implements IChoisiLeRestaurant {

	private static final float prixDeLaPizzaVegtarien = (float) 20;
	private String RestaurantMontr�al;

	public RestaurantMontr�al() {
		// vide
	}

	public RestaurantMontr�al(float prix, String nom) {

		this.RestaurantMontr�al = nom;
	}

	@Override
	public float vendreLesFromages() {

		return this.prixDeLaPizzaVegtarien;
	}

}
