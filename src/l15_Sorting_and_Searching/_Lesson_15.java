package l15_Sorting_and_Searching;

public class _Lesson_15 {

	public static void main(String[] args) {

		// AreaOfATriangle calctri = new AreaOfATriangle();
		// calctri.Area2();

		// DegreesOfATriangle degtri = new DegreesOfATriangle();
		// degtri.Tri();

		// Basket_ball_Player_Stats baller = new Basket_ball_Player_Stats();
		// baller.BallerStat();

		// Odd_or_Even numteam = new Odd_or_Even();
		// numteam.MathGang();

		// SemanticErrorsOperators mistake = new SemanticErrorsOperators();
		// mistake.TipToe();

	}

	public float avg(float[] numbers) {
		int Size = numbers.length;  // big O(3)
		float avg = 0, total = 0;

		for (int i = 0; i < Size; i++) {
			total = numbers[i];      // big O(n) number of elements

		}

		return avg = total / Size; // big O(1)
		
		// runtime complexity 
		// O(3 + 1 + n) // one might be represented by the increment
		// O(n) is progressing linearly the more elements to more operations

	}
	
	
	
	

}
