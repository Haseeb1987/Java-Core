
public class Sorting {
	
	public void bubbleSort(int []num){
		int i, temp;
		boolean flag = true;
		while (flag){
			flag = false;
			for (i = 0; i < num.length-1; i++){
				if (num[i] < num [i+1]){
					temp = num [i];
					num [i] = num [i+1];
					num [i+1] = temp;
					flag = true;
				}
			}
		}
		for (int n : num)
			System.out.print(n + " ");
	}
	
	public void insertionSort(int []num){
		int i,j, temp;
		for (i  = 1; i <num.length; i++){
			temp = num[i];
			for (j = i-1; (j >=0) &&(num[j] < temp); j--){
				num [j+1] = num [j];
			}
			num [j+1] = temp;
		}
		for (int n : num)
			System.out.print(n + " ");
	}

	public void selectionSort(int []num){
		int i,j,first,temp;
		for (i = num.length-1; i > 0; i--){
			first = 0;
			for (j = 1; j <= i; j++){
				if (num[j] < num [first])
				first = j;
			}
			temp = num [first];
			num [first] = num [i];
			num [i] = temp;
		}
		
		for (int n : num)
			System.out.print(n + " ");
	}

	public static void main (String... args){
		Sorting s = new Sorting();
		int [] sort = {100,10,50,70,90};
//		s.bubbleSort(sort);
//		s.insertionSort(sort);
		s.selectionSort(sort);
	}

}
