
public class Exam {
	public static void main(String[] args) {
		double height = 180;
		double weight = 80;
		
		// �޼��� ȣ�� �� ���
		System.out.println(bmi(height, weight));
	}
	
	public static String bmi(double height, double weight) {
		double bmi = weight / (height/100 * height/100);
		if(bmi >= 25) {
			return "��";
		}
		else if(bmi>=18.5) {
			return "ǥ��";
		}
		else {
			return "��ü��";
		}
	}
}
