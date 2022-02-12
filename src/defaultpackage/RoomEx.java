package defaultpackage;
import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class RoomEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Room[] rooms = new Room[10];
		System.out.print("How many tenants?\n");
		int tenants = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<tenants; i++) {
			System.out.print("\nInsert name: ");
			String name = sc.nextLine();
			System.out.print("\nInsert email: ");
			String email = sc.nextLine();
			System.out.print("\nInsert room No: ");
			int room = sc.nextInt();
			
			rooms[room] = new Room(name, email, room);
			
			sc.nextLine();
		}
		
		for(int i=0; i<10; i++) {
			if(rooms[i] != null) {
				System.out.print("\nRoom #" + i + " : " + rooms[i] + "\n");
			} else {
				System.out.print("\nRoom #" + i + " : unoccupied\n");
			}
		}
		
		sc.close();
	}

}
