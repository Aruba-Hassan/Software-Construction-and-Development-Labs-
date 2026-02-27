package generic;
public class GenericArray {
	public static <T extends Number> void subtractArrays(T[] array) {
		for(int i=0; i<array.length - 1; i++) {
			double result = array[i].doubleValue() - array[i+1].doubleValue();
			System.out.println((int) result + " ");
		}
	}
	public static void main(String[] args) {
		Integer[] intArray = {1,2,6,9,4};
        Double[] doubleArray = {1.1,2.2,6.6,9.9,4.4};
        Float[] floatArray = {1.1f,2.2f,6.6f,9.9f,4.4f};
        System.out.println("Integer Array Output:");
        subtractArrays(intArray);   
        System.out.println("\nDouble Array Output:");
        subtractArrays(doubleArray);
        System.out.println("\nFloat Array Output:");
        subtractArrays(floatArray);
	}

}
