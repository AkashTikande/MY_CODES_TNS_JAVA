package MyJava;

class CarManufacturer {
    String name;

    public CarManufacturer(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Company: " + name);
    }
}

class Volkswagen extends CarManufacturer {
    public Volkswagen() {
        super("Volkswagen");
    }
}

class Audi extends Volkswagen {
    public Audi() {
        super();
    }
}

class Lamborghini extends Audi {
    public Lamborghini() {
        super();
    }
}
class Ducati extends CarManufacturer {
    public Ducati() {
        super("Ducati");
    }
}

class Main {
    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen();
        Audi audi = new Audi();
        Lamborghini lamborghini = new Lamborghini();
        Ducati ducati = new Ducati();

        volkswagen.printDetails();
        audi.printDetails();
        lamborghini.printDetails();
        ducati.printDetails();
    }
}