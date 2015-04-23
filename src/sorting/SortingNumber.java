package sorting;

public class SortingNumber {
	
	
	public static int[] sortedList(int [] numberList){
		for(int i=0;i<numberList.length;i++)
			for(int j=1;j<numberList.length; j++)
				if(numberList[i]>numberList[j])
					swap(numberList,i,j);
		return numberList;
		
	}
	private static void swap(int[]numberList,int i, int j){
		int temp = numberList[i];
		numberList[i] = numberList[j];
		numberList[j] = temp;
	}

	public static void main(String[] args) {
		int [] unsortedList={6,8,5,7,2,1,0};
		int [] sortedList = sortedList(unsortedList);
		for(int i=0;i<sortedList.length; i++){
		System.out.println(sortedList[i]);
		}
		

	}

}
