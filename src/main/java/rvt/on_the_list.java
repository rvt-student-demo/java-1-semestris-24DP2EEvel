package rvt;

import java.util.ArrayList;
import java.util.Scanner;


public class on_the_list {


    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
        ArrayList<String> names = new ArrayList<>();

        while (true) {

            String name = scanner.nextLine();

            if (name.isEmpty()) {

                break;
            }

            names.add(name);
        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

            scanner.close();

            }

    }