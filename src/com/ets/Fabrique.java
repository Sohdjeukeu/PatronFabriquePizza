package com.ets;

import com.ets.IPizza.TypePizza;
import com.ets.Strategie.IChoisiLeRestaurant;
import com.ets.Strategie.IChoisiLeRestaurant.ListeDesRestaurant;
import com.ets.Strategie.RestauranDeLongueuil;
import com.ets.Strategie.RestaurantMontr�al;;

public class Fabrique {
	// cr�ons la methode fabrique qui nous retourne unobjet de type interface

	public static IPizza creerUnePizza(TypePizza typedePizza) {
		switch (typedePizza) {

		case PIZZAVEGETARIEN:
			System.out.println("Une pizza de type v�getarien est cr��e");
			return new PizzaVegtarien();

		case PIZZAAUFROMAGE:
			System.out.println("Une Pizza de type fromage est cr�ee");
			return new PizzaAuFromage();
		}
		return null;
	}

	public static IChoisiLeRestaurant creerUnRestaurant(ListeDesRestaurant unRestaurant) {
		switch (unRestaurant) {

		case RESTAURANTMONTREAL:
			System.out.println("je cree un resataurant Montr�alais");
			return new RestaurantMontr�al();

		case RESTAURANTDELONGUEUIL:
			System.out.println("Je cree un restaurant � Longeueuil");
			return new RestauranDeLongueuil();
		}

		return null;

	}

}
