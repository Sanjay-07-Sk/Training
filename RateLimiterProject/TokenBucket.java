package RateLimiterProject;
public class TokenBucket {
    private int capacity;
    private int tokens;
    private long lastRefillTime;
    private int refillRate;

    public TokenBucket(int capacity, int refillRate) {
        this.capacity = capacity;
        this.tokens = capacity;
        this.refillRate = refillRate;
        this.lastRefillTime = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest() {
        refill();
        if (tokens > 0) {
            tokens--;
            return true;
        }
        return false;
    }

    private void refill() {
        long now = System.currentTimeMillis();
        long elapsed = (now - lastRefillTime) / 1000;
        if (elapsed > 0) {
            int newTokens = (int) (elapsed * refillRate);
            tokens = Math.min(capacity, tokens + newTokens);
            lastRefillTime = now;
        }
    }
}