package ru.ncedu.java.tasks;


public class ControlFlowStatements3Impl implements ControlFlowStatements3 {

	@Override
	public double getFunctionValue(double x) {
		if (x <= 0)
			return -x;
		else
			if (x > 0 && x < 2)
				return x = Math.pow(x, 2.0);
			else
				return 4.0;
	}

	@Override
	public String decodeSeason(int monthNumber) {
		switch (monthNumber) {
		case 12:
		case 1: 
		case 2:  return "Winter";
		case 3:
		case 4: 
		case 5:  return "Spring";
		case 6:  
		case 7:
		case 8:  return "Summer";
		case 9: 
		case 10:
		case 11: return "Autumn";
		default: return "Error";
		}
		
	}

	@Override
	public long[][] initArray() {
		long[][] array = new long[8][5];
		for (int i = 0; i < 8; i++) 
			for (int j = 0; j < 5; j++) {
				int k = Math.abs(i - j);
				array[i][j] = (long) Math.pow(k, 5.0);
			}
		return array;
	}

	@Override
	public int getMaxProductIndex(long[][] array) {
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 0)
					arr[i] = (int) array[i][j];
				else
					arr[i] *= array[i][j];
			}
		}	
		int max = 0, max_i = 0;
		for (int i = 0; i < arr.length; i++)
			if (Math.abs(arr[i]) > max) {
				max = (int) arr[i];
				max_i = i;
			}
		return max_i;
	}

	@Override
	public float calculateLineSegment(float A, float B) {
		while (A >= B)
			A = A - B;
		return A;
	}

}
