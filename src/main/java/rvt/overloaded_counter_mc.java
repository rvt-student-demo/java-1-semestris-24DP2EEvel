package rvt;

public class overloaded_counter_mc {

private int value;

public overloaded_counter_mc(int StartValue) {
this.value = StartValue;
}

public overloaded_counter_mc() {
this(0);
}

public int value() {
return this.value;
}

public void increase() {
this.value++;
}

public void decrease() {
this.value--;
}

public static void main(String[] args) {
overloaded_counter_mc counter = new overloaded_counter_mc();

counter.increase();
counter.increase();
System.out.println(counter.value());

counter.decrease();
System.out.println(counter.value());

overloaded_counter_mc counter2 = new overloaded_counter_mc(10);
counter2.increase();
System.out.println(counter2.value());
}

}