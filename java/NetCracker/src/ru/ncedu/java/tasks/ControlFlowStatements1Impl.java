package ru.ncedu.java.tasks;

public class ControlFlowStatements1Impl implements ControlFlowStatements1 {

	@Override
	public float getFunctionValue(float x) {
		float sinx;
		sinx = (float) Math.sin(x);
		if (x > 0) 
			return (2 * sinx);
		else
			return (6 - x);
	}

	@Override
	public String decodeWeekday(int weekday) {
		switch (weekday) {
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		case 7: return "Sunday";
		default: return null;
		}
	}

	@Override
	public int[][] initArray() {
		int[][] array = new int[8][5];
		for (int i = 0; i < 8; i++) 
			for (int j = 0; j < 5; j++) 
				array[i][j] = i * j;
		return array;	
	}

	@Override
	public int getMinValue(int[][] array) {
		int min = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] < min)
					min = array[i][j];
			}
		}
		return min;
	}

	@Override
	public BankDeposit calculateBankDeposit(double P) {
		/**
		 * ��������� ������ ������ � ����� ����� $1000. 
		 * �� ��������� ������� ���� ������ ������ ������������� �� P ��������� (����� � �������������� ���������).<br/>
		 * �� ��������� P ����������, ����� ������� ��� ������ ������ �������� $5000, � ����� �������� ������ ������.
		 * @param P ������� �� ������
		 * @return ���������� � ������ (� ���� ���������� ������ {@link BankDeposit}) ����� ����������� �������������� �������
		 */
		BankDeposit dep = new BankDeposit();
		int year = 0;
		dep.amount = 1000;
		if (year < year + 1) {
			dep.amount += (P/100) * dep.amount;
			year++;
		}
		
			
		 
	}

}
