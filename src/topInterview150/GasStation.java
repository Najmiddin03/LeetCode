package topInterview150;

public class GasStation {

//	There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
//	You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to 
//	its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
//	Given two integer arrays gas and cost, return the starting gas station's index if you can travel 
//	around the circuit once in the clockwise direction, otherwise return -1. 
//	If there exists a solution, it is guaranteed to be unique

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int arr2[] = { 3, 4, 5, 1, 2 };
		int n = canCompleteCircuit(arr1, arr2);
		System.out.println(n);

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int total_surplus = 0;
		int surplus = 0;
		int start = 0;
		for (int i = 0; i < gas.length; i++) {
			total_surplus += gas[i] - cost[i];
			surplus += gas[i] - cost[i];
			if (surplus < 0) {
				surplus = 0;
				start = i + 1;
			}
		}
		return (total_surplus < 0) ? -1 : start;
	}
}
