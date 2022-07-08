package com.ets;

import com.ets.IPizza.TypePizza;
import com.ets.Strategie.IChoisiLeRestaurant;
import com.ets.Strategie.IChoisiLeRestaurant.ListeDesRestaurant;
import com.ets.Strategie.RestauranDeLongueuil;
import com.ets.Strategie.RestaurantMontréal;;

public class Fabrique {
	// créons la methode fabrique qui nous retourne unobjet de type interface

	public static IPizza creerUnePizza(TypePizza typedePizza) {
		switch (typedePizza) {

		case PIZZAVEGETARIEN:
			System.out.println("Une pizza de type végetarien est créée");
			return new PizzaVegtarien();

		case PIZZAAUFROMAGE:
			System.out.println("Une Pizza de type fromage est créee");
			return new PizzaAuFromage();
		}
		return null;
	}

	public static IChoisiLeRestaurant creerUnRestaurant(ListeDesRestaurant unRestaurant) {
		switch (unRestaurant) {

		case RESTAURANTMONTREAL:
			System.out.println("je cree un resataurant Montréalais");
			return new RestaurantMontréal();

		case RESTAURANTDELONGUEUIL:
			System.out.println("Je cree un restaurant à Longeueuil");
			return new RestauranDeLongueuil();
		}

		return null;

	}

}
