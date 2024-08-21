package src.MyJava;

public class Driver {
    public static void main(String[] args) {
        Demo d = new Demo() {
            @Override
            public void print() {

            }

            @Override
            public void show() {

            }
        };
        d.show();
        d.print();

    }

}
