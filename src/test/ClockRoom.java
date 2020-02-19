package com.test;

public class Item {
	static int count = 0;

	public Item(String name, int storage) {
		this.name = name;
		this.storage = storage;
		this.id = count;
		count++;
	}

	string name;
	int id;
	int storage;

	int getStorage() {
		return storage;
	}

	int getId() {
	}
}

public class Compartment {
	public Compartment(int s) {
		capacity = s;
	}

	int capacity;
	int filled = 0;

	List<Items> items;

	bool isSpaceAvailable() {

	}

bool addItem(Item item){
return true; // if space available
else return false;
}

	Item deleteItem(int id) {

	}
}

public class CloakRoom {
Compartment one(1),two(2),three(3);
// in order to implement small, medium, large -- enum can be used.
}
