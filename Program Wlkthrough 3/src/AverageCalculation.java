
public class AverageCalculation {
	//calcAvg this is accepting the intArray
 public double calcAvg(int [] intArray) {
 double sum = 0.0;
 for(int item: intArray) {
	 sum += item;
 }
	 return sum/(double)intArray.length;
 }
 
//calcAvg this is accepting the doubleArray
public double calcAvg(double [] doubleArray) {
double sum = 0.0;
for(double item: doubleArray) {
	 sum += item;
}
	 return sum/(double)doubleArray.length;
}

} //end AverageCalculation class
