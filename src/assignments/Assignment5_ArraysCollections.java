package assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment5_ArraysCollections {

	public static void main(String[] args) {

		// 1. Create Lists with area of top 5 largest cities. Print the total area of
		// the 3rd and 4th cities combined.
		List<Integer> top5LargestCities = new ArrayList<Integer>();
		top5LargestCities.add(1484); // 1. Delhi
		top5LargestCities.add(872); // 2. Ayodhya
		top5LargestCities.add(741); // 3. Bengaluru
		top5LargestCities.add(672); // 4. Vishakhapatnam
		top5LargestCities.add(650); // 5. Hyderabad

		Integer thirdCity = top5LargestCities.get(2);
		Integer fourthCity = top5LargestCities.get(3);
		Integer totalArea = thirdCity + fourthCity;
		System.out.println("Total area of the 3rd and 4th cities combined :" + totalArea);

		// 2. Create a set of the top 10 most visited tourist attractions in the world
		// and print out all of them and its size.
		Set<String> top10Attractions = new LinkedHashSet<String>();
		top10Attractions.add("Empire State Building");// 1
		top10Attractions.add("Eiffel Tower");// 2
		top10Attractions.add("Anne Frank House");// 3
		top10Attractions.add("Basílica de la Sagrada Família");// 4
		top10Attractions.add("Colosseum");// 5
		top10Attractions.add("Louvre Museum");// 6
		top10Attractions.add("Gardens by the Bay");// 7
		top10Attractions.add("Duomo di Milano");// 8
		top10Attractions.add("Sheikh Zayed Grand Mosque");// 9
		top10Attractions.add("Angkor Wat");// 10
		System.out.println("Top 10 Attractions in the World :" + top10Attractions);
		System.out.println("Size of Top 10 Attractions in the World :" + top10Attractions.size());

		// 3. Create an array of 10 numbers (any 10 numbers) and print out the Average
		// of 5th and 6th Value.
		int[] array10 = new int[10];
		array10[0] = 2;// 1
		array10[1] = 4;// 2
		array10[2] = 6;// 3
		array10[3] = 8;// 4
		array10[4] = 10;// 5
		array10[5] = 12;// 6
		array10[6] = 14;// 7
		array10[7] = 16;// 8
		array10[8] = 18;// 9
		array10[9] = 20;// 10

		// Avg of 5th & 6th value
		int average = (array10[4] + array10[5]) / 2;
		System.out.println("Avg of 5th & 6th value :" + average);

		// 4. Create a list of the top 5 highest-grossing movies of all time and print
		// out the third movie on the list.
		List<String> highestMovies = new ArrayList<String>();
		highestMovies.add("Avatar");// 1
		highestMovies.add("Avengers: Endgame");// 2
		highestMovies.add("Avatar: The way of water");// 3
		highestMovies.add("Titanic");// 4
		highestMovies.add("Ne Zha 2");// 5
		System.out.println("Third movie on the list :" + highestMovies.get(2));

	}

}
