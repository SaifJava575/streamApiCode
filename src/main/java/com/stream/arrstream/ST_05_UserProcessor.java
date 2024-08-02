package com.stream.arrstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User {
	private int id;
	private String name;
	private int age;

	public User() {

	}

	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ST_05_UserProcessor {

	public static List<String> getAdultUserNames(List<User> users) {
		List<String>list= users.stream()
				.filter(user -> user.getAge() >= 18)
				.sorted(Comparator.comparingInt(User::getAge))
				.map(User::getName)
				.collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User(1, "Alice", 22),
				new User(2, "Bob", 17),
				new User(3, "Charlie", 20),
				new User(4, "David", 18),
				new User(5, "Eve", 25));

		List<String> adultUserNames = getAdultUserNames(users);
		System.out.println(adultUserNames);
	}
}
