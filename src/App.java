import java.util.Scanner;

public class App {
	public static void printing(String kuchbhi) {
		System.out.println(kuchbhi);
	}

	public static void main(String[] args) {
		printing("\nLet's Play Stone,Paper and Scissors\n");
		printing("Are You Want to Play?\n");
		printing("Enter Y for Yes!");
		printing("Enter N for No!");

		Scanner input = new Scanner(System.in);
		printing("\nEnter your response: ");

		String response = input.nextLine();
		if (response.equalsIgnoreCase("y")) {

			printing("\nEnter your name: ");

			String name = input.nextLine();

			System.out.println("\nHello " + name + "! Choose the Following numbers to Continue\n");
			String[] choices = {"Stone", "Scissors", "Paper"};

			printing("Choose 1 for Stone!");
			printing("Choose 2 for Scissors!");
			printing("Choose 3 for Paper!");
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

			}
		} else if (response.equalsIgnoreCase("n")) {
			printing("No Problem!,We hope you play next time!");
		} else {
			printing("Invalid response! yeh to option mai hai hi nhi");
		}
        input.close();
	}
}
