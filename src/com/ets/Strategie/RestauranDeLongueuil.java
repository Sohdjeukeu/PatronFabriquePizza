package com.ets.Strategie;

public class RestauranDeLongueuil implements IChoisiLeRestaurant {
	private static final float prixDeLaPizzaAuFromage = (float) 15.25;

	private String nomDuRestaurantDeLongueuil;

	// constructeur vide

	public RestauranDeLongueuil() {
		// vide
	}

	public RestauranDeLongueuil(float prix, String nom) {
		this.nomDuRestaurantDeLongueuil = nom;

	}

	@Override
	public float vendreLesFromages() {

		return 0;
	}

	// accesseur et nutateur

	public float getPrixDeLaPizzaAuFromage() {
		return this.prixDeLaPizzaAuFromage;
	}

	public String getNomDuRestaurantDeLongueuil() {
		return this.nomDuRestaurantDeLongueuil;
	}

}
