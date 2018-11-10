package com.mortaneous.lambda.exercise.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.mortaneous.lambda.exercise.Person;

public class Java8SolutionVersion2 {

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

		System.out.println("=========[Java8 solution 2]=======");
		
		// Task 1. Write code that will sort a list of Person objects by last name alphabetically 
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Task 2. Write a method that displays all objects in the list
		System.out.println("*** Sort by last name:");
		printWithCondition(people, p -> true, p -> System.out.println(p));
		
		// Task 3. Write a method that displays Persons whose last names begin with C
		System.out.println("*** People whose last name begin with C:");
		printWithCondition(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		// Task 4. Write a method that displays Persons older than 30	}
		System.out.println("*** People older than 30:");
		printWithCondition(people, p -> p.getAge() > 30, 
						   // printing just the last name and age for the sake of variance
						   p -> System.out.println(p.getLastName()+", "+p.getAge())); 
	}

	private static void printWithCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
