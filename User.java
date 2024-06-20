import java.util.List;

public class User {
    private int userID;
    private String username;
    private String email;
    private String phoneNumber;
    private String communicationPreference;

    // Constructors
    public User() {}

    public User(int userID, String username, String email, String phoneNumber, String communicationPreference) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.communicationPreference = communicationPreference;
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCommunicationPreference() {
        return communicationPreference;
    }

    public void setCommunicationPreference(String communicationPreference) {
        this.communicationPreference = communicationPreference;
    }

    // Methods
    public void register(String websiteURL, String username, NotificationPreferences preferences) {
        // Implementation to register the user to a website
        System.out.println("User registered to website: " + websiteURL);
    }

    public void manageSubscription() {
        // Implementation to manage user subscriptions
        System.out.println("Managing subscription for user: " + username);
    }

    public void updateNotificationPreferences(Frequency frequency, CommunicationChannel channel) {
        // Implementation to update notification preferences
        System.out.println("Updating notification preferences for user: " + username);
    }

    public void receiveNotification(String websiteURL, String message) {
        // Implementation to handle receiving a notification
        System.out.println("Received notification from website: " + websiteURL + " with message: " + message);
    }

    public NotificationPreferences getNotificationPreferences() {
        // Return NotificationPreferences object
        return new NotificationPreferences(); // Placeholder implementation
    }

    public List<Subscription> getSubscriptions() {
        // Return list of subscriptions
        return List.of(new Subscription()); // Placeholder implementation
    }
}
