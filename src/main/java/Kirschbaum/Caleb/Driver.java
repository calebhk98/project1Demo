package Kirschbaum.Caleb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.service.ServicesImpl;

public class Driver {
	static ServicesImpl Simpl = new ServicesImpl();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * if (MetaModel.of(Bob.class).getTableName().equals("Food")) {
		 * Simpl.renameTable(Bob.class, "Bob"); }
		 */

		// if (MetaModel.of(Bob.class).getTableName().equals("Food")) {
		// Simpl.renameColumn(Bob.class, "d", "creationDate");
		// }

		//		System.out.println("Renamed the values");

		Simpl.create(Prison.class);
		Simpl.create(Prisoners.class);
		System.out.println("\n\nCreated the class");
		input.nextLine();

		Prisoners Joker = new Prisoners("Joker", 1);
		Prisoners riddle = new Prisoners("Riddler", 1);
		List<Prisoners> ps = new ArrayList<>();
		ps.add(riddle);
		ps.add(Joker);
		Prison Arkham = new Prison("Arkham", ps);
		int row = Simpl.insert(Arkham);
		System.out.println("Inserted Arkham");
		input.nextLine();

		Simpl.truncate(Prison.class);
		Simpl.drop(Prisoners.class);
		System.out.println("Droped and truncated");
		input.nextLine();

		List<Bob> foods = new ArrayList<>();

		foods.add(new Bob("Carrot Cake", 118, LocalDate.of(1943, 12, 25)));
		foods.add(new Bob("Steak", 679, LocalDate.of(1450, 12, 25)));
		foods.add(new Bob("Banana", 105, LocalDate.of(327, 12, 25)));

		Simpl.create(Bob.class);
		for (Bob i : foods) {
			Simpl.insert(i);
		}

		System.out.println("Inputted the food");
		input.nextLine();

		Simpl.create(Users.class);
		Simpl.create(Accounts.class);

		System.out.println("Created the Users and accounts");
		input.nextLine();
	}

}
