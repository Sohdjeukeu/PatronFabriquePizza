package com.ets;

import com.ets.IPizza.TypePizza;
import com.ets.Strategie.IChoisiLeRestaurant;
import com.ets.Strategie.IChoisiLeRestaurant.ListeDesRestaurant;

public class Client {

	private IChoisiLeRestaurant maStratetegydeVente;

	// choisir le restaurant

	public void setStrategy(IChoisiLeRestaurant unRestaurant) {
		this.maStratetegydeVente = unRestaurant;
	}

	// Appliquer la strategy
	public void appliquerMaStrategie() {
		this.maStratetegydeVente.vendreLesFromages();
	}

	public static void main(String[] args) {

		// Fabriquer un restaurant Montrealais
		IChoisiLeRestaurant monRestaurant = Fabrique.creerUnRestaurant(ListeDesRestaurant.RESTAURANTMONTREAL);

		// Fabrique la pizza Montrealais
		Fabrique.creerUnePizza(TypePizza.PIZZAAUFROMAGE);

		Client monClient = new Client();
		// Choix du restaurant qui la vend
		monClient.setStrategy(monRestaurant);

		// effectuer la vente d'une pizza
		System.out.println(monRestaurant.vendreLesFromages());

	}

}
