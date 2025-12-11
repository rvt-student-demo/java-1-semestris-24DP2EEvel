package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<Book> books = new ArrayList<>();
while (true) {

System.out.print("Title: ");
String title = scanner.nextLine();

if (title.isEmpty()) {
break;
}
System.out.print("Pages: ");
int pages = Integer.valueOf(scanner.nextLine());

System.out.print("Publication year: ");
int publicationYear = Integer.valueOf(scanner.nextLine());

books.add(new Book(title, pages, publicationYear));
}

System.out.println("What information will be printed? ");
String choice = scanner.nextLine();

if (choice.equals("everything")) {
for (Book book : books) {
System.out.println(book);
}
} else if (choice.equals("name")) {
for (Book book : books) {
System.out.println(book.getTitle());
}
}
scanner.close();
}
}

class Book {
private String title;
private int pages;
private int publicationYear;

public Book(String title, int pages, int publicationYear) {
this.title = title;
this.pages = pages;
this.publicationYear = publicationYear;
}

public String getTitle() {
return this.title;
}

@Override // pārliecinās, ka metodes šajā klasē atbilst metodēm citā klasē, savādāk rādīs error
public String toString() {
return this.title + ", " + this.pages + " pages, " + this.publicationYear;
}
}
