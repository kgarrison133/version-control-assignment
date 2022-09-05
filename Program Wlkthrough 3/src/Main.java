
public class Main {

	public static void main(String[] args) {
 //part 1
		System.out.println("[Part1]");
		String[] names = {"alice", "bob", "carla", "david", "earl", "felicia"};
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("[Part 2]");
		//part 2
		AverageCalculation average = new AverageCalculation();
		//create intArrays
		int[] intValues1 = {10, 3, 7, 9};
		int[] intValues2 = {18, 16, 14, 12, 10, 8};
		
		//output average of intArray with different sizes
		System.out.printf("Average of intArray1: %.2f \n", average.calcAvg(intValues1));
		System.out.printf("Average of intArray2: %.2f", average.calcAvg(intValues2));
		System.out.println();
		
		//create doubleArrays
		double[] doubleValues1 = {20.0, 22.1, 22.2, 23.4};
		double[] doubleValues2 = {30.5, 31.6, 32.7, 33.8, 34.9, 35.0};
		
		//output average of doubleArray with different sizes
		System.out.printf("Average of doubleArray1: %.2f \n", average.calcAvg(doubleValues1));
		System.out.printf("Average of doubleArray2: %.2f", average.calcAvg(doubleValues2));
		
		//part 3
		System.out.println();
		System.out.println();
		System.out.println("[Part 3]");
		ValenciaIceCream valenciaIceCream = new ValenciaIceCream();

		
		
	} //end main method 

} //end Main class
