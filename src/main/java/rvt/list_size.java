package rvt;

import java.util.ArrayList;
import java.util.Scanner;


public class list_size {


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

            scanner.close();

            }

    }
