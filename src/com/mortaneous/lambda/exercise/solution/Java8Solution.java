package com.mortaneous.lambda.exercise.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mortaneous.lambda.exercise.Person;

public class Java8Solution {

	public static void main(String[] args) {

		System.out.println("=========[Initial state ]=========");

		List<Person> people = new ArrayList<>(
				Arrays.asList(
					new Person("Smith", "John", 32),
					new Person("Croft", "Lara", 29),
					new Person("McCalister", "Kevin", 10),
					new Person("Markson", "John", 25),
					new Person("Chaplin", "Charlie", 65),
					new Person("Johnson", "Mark", 30),
					new Person("Dumbledore", "Albus Wolfric Brian", 72)
				)
			);
		for(Person person : people) {
			System.out.println(person);
		}

		System.out.println("=========[Java8 solution]=========");
		
		// Task 1. Write code that will sort a list of Person objects by last name alphabetically 
		
		// Task 2. Write a method that displays all objects in the list
		
		// Task 3. Write a method that displays Persons whose last names begin with C
		
		// Task 4. Write a method that displays Persons older than 30	}
	}

}
