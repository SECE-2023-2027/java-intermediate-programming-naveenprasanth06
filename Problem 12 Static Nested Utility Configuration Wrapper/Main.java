import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Target IP: ");
        String targetIp = sc.nextLine();

        System.out.print("Enter Timeout: ");
        int timeout = sc.nextInt();

        NetworkUtility.PingConfig config =
                new NetworkUtility.PingConfig(targetIp, timeout);

        System.out.println(config.targetIp + " with timeout " + config.timeout);

        sc.close();
    }
}