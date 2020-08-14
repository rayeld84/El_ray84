public class Main {

    public static void main(String[] args) throws InterruptedException {
        trafficLight(TrafficLight.RED);
    }

    public static void trafficLight(TrafficLight lights) throws InterruptedException {
        while (true) {
            Thread.sleep(3000);

            switch (lights) {
                case RED:
                    System.out.println("Stop");
                    trafficLight(TrafficLight.YELLOWRED);
                    break;
                case YELLOWRED:
                    System.out.println("Get ready");
                    trafficLight(TrafficLight.GREEN);
                    break;
                case GREEN:
                    System.out.println("Drive");
                    trafficLight(TrafficLight.YELLOW);
                    break;
                case YELLOW:
                    System.out.println("Slow down");
                    trafficLight(TrafficLight.RED);
                    break;
            }

        }
    }
}

