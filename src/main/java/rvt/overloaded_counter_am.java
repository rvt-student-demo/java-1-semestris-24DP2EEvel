package rvt;

public class overloaded_counter_am {

private int value;

public overloaded_counter_am(int StartValue) {
this.value = StartValue;
}

public overloaded_counter_am() {
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

public void increase(int increaseBy) {
if (increaseBy > 0) {
this.value += increaseBy;
}
}

public void decrease(int decreaseBy) {
if (decreaseBy > 0) {
this.value -= decreaseBy;
}
}
}