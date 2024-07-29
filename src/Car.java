import java.awt.event.KeyEvent;
// This programme logically shows the basic working principle of car driving system based upon commands given
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    double x, y, speed, direction;

    public Car(double x, double y) {
        this.x = x;
        this.y = y;
        speed = 0;
        direction = 0;
    }

    void move() {
        // ... (movement logic based on speed and direction)
    }
}

class Obstacle {
    double x, y, size;

    public Obstacle(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }
}

class Sensor {
    Car car;

    public Sensor(Car car) {
        this.car = car;
    }

    double detectObstacle(List<Obstacle> obstacles) {
        // ... (sensor logic to detect nearest obstacle distance)
        return Double.MAX_VALUE; // Rewplace with actual distance calculation
    }
}

 class CarSimulation {
    static final double MAX_SPEED = 10;
    static final double SPEED_INCREMENT = 1;

    public static void main(String[] args) {
        Car car = new Car(0, 0);
        Sensor sensor = new Sensor(car);
        List<Obstacle> obstacles = new ArrayList<>();
        // Create obstacles here

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int key = scanner.next().charAt(0);
            switch (key) {
                case 'w':
                    car.speed += SPEED_INCREMENT;
                    break;
                case 's':
                    car.speed -= SPEED_INCREMENT;
                    break;
                case 'a':
                    car.direction -= 5;
                    break;
                case 'd':
                    car.direction += 5;
                    break;
                default:
                    break;
            }

            car.speed = Math.max(0, Math.min(car.speed, MAX_SPEED));
            car.move();

            double distanceToObstacle = sensor.detectObstacle(obstacles);
            if (distanceToObstacle < car.speed) {
                // Implement obstacle avoidance logic
                System.out.println("Obstacle ahead! Braking...");
                car.speed = 0;
            }

            // Update obstacle positions and create new obstacles
            // ...

            // Simulate car movement and display information
            System.out.println("Car position: (" + car.x + ", " + car.y + ")");
            System.out.println("Car speed: " + car.speed);
            System.out.println("Car direction: " + car.direction);
            System.out.println("Distance to obstacle: " + distanceToObstacle);
        }
    }
}
