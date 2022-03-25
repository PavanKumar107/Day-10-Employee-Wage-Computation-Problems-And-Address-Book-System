package addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class UC6 {
	ArrayList<Contact> list = new ArrayList<Contact>();
	String bookName; /// It represent the name of book
	void addContact() {
		Contact contact = new Contact();
		contact.addContact1();
		list.add(contact);
		System.out.println("Contact added successfully");
	}
	void deletePerson(String name, ArrayList<Contact> list) {
		if (list.size() == 0) {
			System.out.println("Address book is empty.Please Add First");
		} else {
			int m = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (((ArrayList<Contact>) list.get(i).firstName).contains(name)) {
					list.remove(i);
					System.out.println("Contact deleted successfully");
					m += 1;
					break;
				}
			}
			if (m == 0) {
				System.out.println("No contact with the given name exist");
			}
		}
	}
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	void editPerson(String name, ArrayList<Contact> list) {
		if (list.size() == 0) {
			System.out.println("Addressbook is empty.Please add First");
		} else {
			int m = 0;
			for (int i = list.size() - 1; i >= 0; --i) {
				if (((ArrayList<Contact>) list.get(i).firstName).contains(name)) {
					list.get(i).addContact();
					System.out.println("Contact Updated successfully");
					m += 1;
					break;
				}
			}
			if (m == 0) {
				System.out.println("No contact with the given name exist");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Address Book Program ");

		BookList book = new BookList();
		BookList shelf = new BookList();

		while (true) {
			UC6 addressBook = new UC6();
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter the name of Book you want to  access or add or press 'q' to quit");
			String bookName = scan3.nextLine();
			if (bookName.equals("q")) {
				//if (addressBook.list.size() > 0) {
				//book.addBook(bookName, addressBook);
				//}
				System.out.println("The program is closed");
				break;
			}
			int result = book.checkBook(bookName);//// (It can return 0 or 1)It will return 1 if book exist b and break
			int result1 = shelf.checkBook(bookName);//// (It can return 0 or 1)It will return 1 if book exist b and break
			//// down loop
			int condition = 0;///// It will keep check on the addressbook created or not
			while (true) {
				if (result1 == 1) {
					break;
				}
				System.out.println("Do you want to add/edit/delete the contact (0/1/2) :Press 3 to Go back to main menu");
				Scanner scan = new Scanner(System.in);
				int input = scan.nextInt();
				if (input == 0) {
					addressBook.addContact();
				} else if (input == 1) {
					Scanner scan1 = new Scanner(System.in);
					System.out.println("Enter the first name of person you to edit ");
					String name = scan1.nextLine();
					addressBook.editPerson(name, addressBook.list);
				} else if (input == 2) {
					Scanner scan2 = new Scanner(System.in);
					System.out.println("Enter the first name of the person you want to delete : ");
					String name = scan2.nextLine();
					addressBook.deletePerson(name, addressBook.list);
				}

				else if (input == 3) {
					book.addBook1(bookName, addressBook);
					shelf.addBook11(bookName, addressBook);
					break;
				}

				else {
					System.out.println("Enter the valid command");
				}
			}
		}
	}
}