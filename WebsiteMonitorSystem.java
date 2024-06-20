
import java.util.List;
import java.util.ArrayList;

public class WebsiteMonitorSystem {
    private List<User> users;
    private List<Website> websites;
    private List<Subscription> subscriptions;
    private List<Notification> notifications;

    // Constructors
    public WebsiteMonitorSystem() {
        this.users = new ArrayList<>();
        this.websites = new ArrayList<>();
        this.subscriptions = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    // Getters and Setters
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    // Methods
    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int userID) {
        users.removeIf(user -> user.getUserID() == userID);
    }

    public User getUser(int userID) {
        return users.stream().filter(user -> user.getUserID() == userID).findFirst().orElse(null);
    }

    public void addWebsite(Website website) {
        websites.add(website);
    }

    public void removeWebsite(String websiteURL) {
        websites.removeIf(website -> website.getUrl().equals(websiteURL));
    }

    public Website getWebsite(String url) {
        return websites.stream().filter(website -> website.getUrl().equals(url)).findFirst().orElse(null);
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public void removeSubscription(int userID, String websiteURL) {
        subscriptions.removeIf(subscription -> subscription.getUserID() == userID && getWebsite(websiteURL).getWebsiteID() == subscription.getWebsiteID());
    }

    public Subscription getSubscription(int userID, String websiteURL) {
        return subscriptions.stream().filter(subscription -> subscription.getUserID() == userID && getWebsite(websiteURL).getWebsiteID() == subscription.getWebsiteID()).findFirst().orElse(null);
    }

    public void generateNotification(Notification notification) {
        notifications.add(notification);
    }

    public void deliverNotification(Notification notification) {
        notification.sendNotification();
        notifications.add(notification);
    }
}
