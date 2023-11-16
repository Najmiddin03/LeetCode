package topInterview150;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {

//	Implement the RandomizedSet class:
//	RandomizedSet() Initializes the RandomizedSet object.
//	bool insert(int val) Inserts an item val into the set if not present. 
//	Returns true if the item was not present, false otherwise.
//	bool remove(int val) Removes an item val from the set if present. 
//	Returns true if the item was present, false otherwise.
//	int getRandom() Returns a random element from the current set of elements 
//	(it's guaranteed that at least one element exists when this method is called). 
//	Each element must have the same probability of being returned.
//	You must implement the functions of the class such that each function works in average O(1) time complexity.

//	https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150

	Set<Integer> set;

	public RandomizedSet() {
		set = new HashSet<>();
	}

	public boolean insert(int val) {
		return set.add(val);
	}

	public boolean remove(int val) {
		return set.remove(val);
	}

	public int getRandom() {
		Integer[] array = set.toArray(new Integer[0]);
		Random random = new Random();
		int randomIndex = random.nextInt(array.length);
		return array[randomIndex];
	}

}
