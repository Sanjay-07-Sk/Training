package RateLimiterProject;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        RateLimiterService service = new RateLimiterService();

        service.addUser("user1", 5, 1);

        for (int i = 0; i < 10; i++) {
            boolean allowed = service.allowRequest("user1");
            System.out.println("Request " + i + ": " + allowed);
            Thread.sleep(500);
        }
    }
}