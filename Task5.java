// **5. Design and implement a Java program that simulates a network monitoring system. Your system should be capable of monitoring different types of network devices, such as routers and switches, and alerting if any devices are experiencing errors or downtime. Use interfaces to define common behaviors for network devices and implement these behaviors in different device classes. Create an interface named NetworkDevice with at least two methods:**

// - getStatus() which returns a String indicating the current status of the device
// - isAvailable() which returns a boolean indicating if the device is currently available and functioning correctly. Implement the NetworkDevice interface in at least three separate classes, Router and Switch. Each class should have a constructor that sets specific properties for the device and specific logic to determine its status and availability.

public class Task5 {
    public static void main(String[] args) {
        Router router = new Router("Connected", true);
        System.out.println("Router Status: " + router.getStatus());
        System.out.println("Router Available: " + router.isAvailable());

    }
}

interface NetworkDevice {
    public String getStatus();

    public boolean isAvailable();
}

class Router implements NetworkDevice {
    private String status;
    private boolean available;

    public Router(String status, boolean available) {
        this.status = status;
        this.available = available;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

class Switch implements NetworkDevice {
    private String status;
    private boolean available;

    public Switch(String status, boolean available) {
        this.status = status;
        this.available = available;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

class Hub implements NetworkDevice {
    private String status;
    private boolean available;

    public Hub(String status, boolean available) {
        this.status = status;
        this.available = available;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}