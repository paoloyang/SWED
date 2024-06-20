public class Subscription {
    private int subscriptionID;
    private int userID;
    private int websiteID;
    private String frequency;
    private String notificationChannel;

    // Constructors
    public Subscription() {}

    public Subscription(int subscriptionID, int userID, int websiteID, String frequency, String notificationChannel) {
        this.subscriptionID = subscriptionID;
        this.userID = userID;
        this.websiteID = websiteID;
        this.frequency = frequency;
        this.notificationChannel = notificationChannel;
    }

    // Getters and Setters
    public int getSubscriptionID() {
        return subscriptionID;
    }

    public void setSubscriptionID(int subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getWebsiteID() {
        return websiteID;
    }

    public void setWebsiteID(int websiteID) {
        this.websiteID = websiteID;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getNotificationChannel() {
        return notificationChannel;
    }

    public void setNotificationChannel(String notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    // Methods
    public void modifySubscription() {
        // Implementation to modify subscription
        System.out.println("Modifying subscription for userID: " + userID + " and websiteID: " + websiteID);
    }

    public void cancelSubscription() {
        // Implementation to cancel subscription
        System.out.println("Cancelling subscription for userID: " + userID + " and websiteID: " + websiteID);
    }
}
