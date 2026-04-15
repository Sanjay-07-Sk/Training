package RateLimiterProject;
import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {
    private Map<String, User> users;

    public RateLimiterService() {
        users = new HashMap<>();
    }

    public void addUser(String userId, int capacity, int refillRate) {
        users.put(userId, new User(userId, capacity, refillRate));
    }

    public boolean allowRequest(String userId) {
        User user = users.get(userId);
        if (user == null) return false;
        return user.makeRequest();
    }
}