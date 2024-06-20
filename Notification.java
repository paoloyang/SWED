import java.util.Date;

public class Notification {
    private int notificationID;
    private int userID;
    private int subscriptionID;
    private String message;
    private Date timestamp;
    private User recipient;

    // Constructors
    public Notification() {}

    public Notification(int notificationID, int userID, int subscriptionID, String message, Date timestamp, User recipient) {
        this.notificationID = notificationID;
        this.userID = userID;
        this.subscriptionID = subscriptionID;
        this.message = message;
        this.timestamp = timestamp;
        this.recipient = recipient;
    }

    // Getters and Setters
    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSubscriptionID() {
        return subscriptionID;
    }

    public void setSubscriptionID(int subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    // Methods
    public void generateNotification() {
        // Implementation to generate a notification
        System.out.println("Generating notification: " + message);
    }

    public void sendNotification() {
        // Implementation to send a notification
        System.out.println("Sending notification to: " + recipient.getUsername());
    }
}
