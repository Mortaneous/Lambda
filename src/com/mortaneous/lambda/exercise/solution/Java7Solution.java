package com.mortaneous.lambda.exercise.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mortaneous.lambda.exercise.Person;

public class Java7Solution {

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
		
		System.out.println("=========[Java7 solution]=========");
		
		// Task 1. Write code that will sort a list of Person objects by last name alphabetically
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Task 2. Write a method that displays all objects in the list
		System.out.println("*** Sort by last name:");
		printAll(people);
		
		// Task 3. Write a method that displays Persons whose last names begin with C
		System.out.println("*** People whose last name begin with C:");
		printWithCondition(people, new Condition<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getLastName().startsWith("C");
			}
		});
		
		// Task 4. Write a method that displays Persons older than 30
		System.out.println("*** People older than 30:");
		printWithCondition(people, new Condition<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getAge()>30;
			}
		});
	}

	private static void printWithCondition(List<Person> people, Condition<Person> condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}
	
	private interface Condition<T> {
		public boolean test(T t);
	}

}
