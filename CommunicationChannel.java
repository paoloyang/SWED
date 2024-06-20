public class CommunicationChannel {
    private String channelName;

    // Constructors
    public CommunicationChannel() {}

    public CommunicationChannel(String channelName) {
        this.channelName = channelName;
    }

    // Getters and Setters
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    // Methods
    public void deliverNotification(String message, User recipient) {
        // Implementation to deliver a notification
        System.out.println("Delivering message: " + message + " to user: " + recipient.getUsername());
    }
}
