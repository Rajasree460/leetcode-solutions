class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i=0;i<n;i++){
			int low =0;
			int high = n-1;
			while(low <high){
				int temp = matrix[i][low];
				matrix[i][low] = matrix[i][high];
				matrix[i][high] = temp;
				low++;
				high--;
			}
		}
    }
}


// [[1, 4, 7],
//  [2, 5, 8],
//  [3, 6, 9]]
// Now the for loop with the while loop runs to reverse each row:

// For i = 0 (first row [1, 4, 7]):

// low = 0, high = 2
// Swap matrix[0][0] with matrix[0][2]: [7, 4, 1]
// For i = 1 (second row [2, 5, 8]):

// low = 0, high = 2
// Swap matrix[1][0] with matrix[1][2]: [8, 5, 2]
// For i = 2 (third row [3, 6, 9]):

// low = 0, high = 2
// Swap matrix[2][0] with matrix[2][2]: [9, 6, 3]
// final matrix:
// [[7, 4, 1],
//  [8, 5, 2],
//  [9, 6, 3]]
