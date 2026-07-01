import java.util.Scanner;
public class NetworkUtility {

    public static class PingConfig {
        public String targetIp;
        public int timeout;

        public PingConfig(String targetIp, int timeout) {
            this.targetIp = targetIp;
            this.timeout = timeout;
        }
    }
}