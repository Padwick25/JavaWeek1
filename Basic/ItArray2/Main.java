public class Main {
	
	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		int[] arrayTen = array;
		for(int i = 0; i < array.length; i++) {
			arrayTen[i] = array[i] * 10;
			System.out.println(arrayTen[i]);
		}
	}

}