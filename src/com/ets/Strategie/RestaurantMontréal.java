package com.ets.Strategie;

public class RestaurantMontréal implements IChoisiLeRestaurant {

	private static final float prixDeLaPizzaVegtarien = (float) 20;
	private String RestaurantMontréal;

	public RestaurantMontréal() {
		// vide
	}

	public RestaurantMontréal(float prix, String nom) {

		this.RestaurantMontréal = nom;
	}

	@Override
	public float vendreLesFromages() {

		return this.prixDeLaPizzaVegtarien;
	}

}
