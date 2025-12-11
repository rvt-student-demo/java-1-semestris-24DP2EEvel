package rvt;

import java.util.ArrayList;

public class remove_last {


   public static void removeLast(ArrayList<String> strings)  {
        
        if (strings.isEmpty()) {
            return;
        }

        int lastIndex = strings.size() - 1;
        strings.remove(lastIndex);
    }

    public static void main(String[] args) {
        
    ArrayList<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        System.out.println(strings);

        removeLast(strings);

        removeLast(strings);

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);
        System.err.println(strings);
        
        }
    }
