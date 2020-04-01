package com.InterviewQuestions;

public class ConsecutivePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };
int longestIndex=0;
int lLength=1;
int currentIndex=0;
int currentLength=1;

for(int i=1; i<arr.length; i++) {
	if(arr[i]-arr[i-1]==1) {
		currentLength++;
		if(currentLength>lLength) {
			lLength=currentLength;
			longestIndex=currentIndex;
		}
	}else {
		currentLength=1;
		currentIndex=i;
	}
}
for(int j=longestIndex; j<longestIndex+lLength; j++) {
	System.out.print(arr[j]+" ");
}
	}

}
