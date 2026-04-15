package RateLimiterProject;
public class User {
    private String userId;
    private TokenBucket bucket;

    public User(String userId, int capacity, int refillRate) {
        this.userId = userId;
        this.bucket = new TokenBucket(capacity, refillRate);
    }

    public String getUserId() {
        return userId;
    }

    public boolean makeRequest() {
        return bucket.allowRequest();
    }
}
