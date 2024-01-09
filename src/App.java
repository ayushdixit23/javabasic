import java.util.Scanner;

public class App {
	public static void printing(String kuchbhi) {
		System.out.println(kuchbhi);
	}

	public static void validateYesOrNo(Scanner input, String name) {
		printing("\nEnter your response: ");
		input.nextLine();

		String playagain = input.next();

		if (playagain.equalsIgnoreCase("y")) {
			game(true, name);
		} else if (playagain.equalsIgnoreCase("n")) {
			printing("Thanks for Playing, See You Later!");
			input.close();
		} else {
			printing("Invalid Response! Please Enter a valid Response");
			validateYesOrNo(input, name);
		}
	}

	public static void validateWinOrLoss(Scanner input, String[] choices, String name) {
		printing("\nChoose your Number: ");
		int number = input.nextInt();
		int computer = (int) (Math.random() * 3) + 1;
		if (number >= 1 && number <= 3) {
			printing("Computer chooses " + choices[computer - 1]);
			printing(name + " chose " + choices[number - 1]);
		}

		if (number >= 1 && number <= 3) {
			if ((computer == 2 && number == 1) || (computer == 3 && number == 2)) {
				System.out.println("Congratulations " + name + "! you won");
			} else if (computer == number) {
				printing("Ahh, Close Game!, game tied");
			} else {
				printing("Better than next time!, Computer wins! ");
			}
		} else {
			printing("Invalid Response! Please Enter a valid Response");
			validateWinOrLoss(input, choices, name);
		}
	}

	public static void game(boolean repeat, String fn) {
		Scanner input = new Scanner(System.in);
		String name = fn;

		if (!repeat) {
			printing("\nLet's Play Stone,Paper and Scissors\n");
			printing("Are You Want to Play?\n");
			printing("Enter Y for Yes!");
			printing("Enter N for No!");

			printing("\nEnter your response: ");
			String response = input.nextLine();
			if (!response.equalsIgnoreCase("y")) {
				printing("No Problem!, We hope you play next time!");
				input.close();
				return;
			}

			printing("\nEnter your name: ");
			name = input.nextLine();
			System.out.println("\nHello " + name + "! Choose the Following numbers to Continue\n");
		}

		String[] choices = { "Stone", "Scissors", "Paper" };

		printing("Choose 1 for Stone!");
		printing("Choose 2 for Scissors!");
		printing("Choose 3 for Paper!");
		validateWinOrLoss(input, choices, name);
		printing("\nWanna Play Again?");
		printing("Y for Continue");
		printing("\nN for Exit");

		validateYesOrNo(input, name);
	}

	public static void main(String[] args) {
		game(false, "");
	}
}
