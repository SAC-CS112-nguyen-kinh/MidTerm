import java.util.Scanner;

public class MidTerm
{
	public static void main (String[] args)
	{
		Scanner kinh = new Scanner (System.in);

		int odd = 0;
		int even = 0;
		int win = 0;
		int roll;
		int i = 0;
		String ask;
		String guessRoll;
		char guessDice;
		char choiceDice = 'Y';

		do{
			roll = (int) (Math.random() * 6 ) + 1;
			i ++;
			System.out.println("Dice rolled. Press 'O' for odd 'E' for even: ");
			guessRoll = kinh.next();
			guessDice = guessRoll.charAt(0);
			guessDice = Character.toUpperCase(guessDice);

			switch(guessDice)
			{
			case 'O':
			{
				if (roll % 2 == 0)
				{
					System.out.println("Guessed odd but dice rolled even. Lose.");
				}
				else if (roll % 2 == 1)
				{
					System.out.println("Guessed odd and dice rolled odd. Win.");
					win++;
					odd++;
				}
				break;
			}
			case 'E':
			{
				if (roll % 2 == 0)
				{
					System.out.println("Guessed even and dice rolled even. Win.");
					win++;
					even++;
				}
				else if (roll % 2 == 1)
				{
					System.out.println("Guessed even but dice rolled odd. Lose.");
					even++;
					odd++;
				}
				break;
			}

			}
			System.out.print("\nPlay again? Press 'Y' for yes 'N' for no: ");
			ask = kinh.next();

			choiceDice = ask.charAt(0);
			choiceDice = Character.toUpperCase(choiceDice);

			System.out.println();
			System.out.println();
			System.out.println();

		}while (choiceDice == 'Y');
		double percentOdd = (((double)odd) / ((double)i) * (100));
		double percentEven = (((double)even)/((double)i)) * (100);
		double percentWin = (((double)win)/((double)i)) * (100);
		System.out.printf("Played %d times!", i);
		System.out.printf("\nWin %f percent.", percentWin);
		System.out.printf("\nEven roll %f percent.", percentEven);
		System.out.printf("\nOdd rolled %f percent.", percentOdd);
	}
}

