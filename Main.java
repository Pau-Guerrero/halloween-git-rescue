package server-room-horror;

public class Main {
    private static String securityMode = "BASELINE";

    public static void main(String[] args) {
        System.out.println("Server room security system started.");
        System.out.println("Security mode: " + securityMode);
        monitorServerRoom();
    }

    private static void monitorServerRoom() {
        System.out.println("Monitoring server room temperature and movement.");
    }
}