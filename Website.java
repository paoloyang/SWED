import java.util.Date;

public class Website {
    private int websiteID;
    private String url;
    private Date checkForUpdates;

    // Constructors
    public Website() {}

    public Website(int websiteID, String url, Date checkForUpdates) {
        this.websiteID = websiteID;
        this.url = url;
        this.checkForUpdates = checkForUpdates;
    }

    // Getters and Setters
    public int getWebsiteID() {
        return websiteID;
    }

    public void setWebsiteID(int websiteID) {
        this.websiteID = websiteID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCheckForUpdates() {
        return checkForUpdates;
    }

    public void setCheckForUpdates(Date checkForUpdates) {
        this.checkForUpdates = checkForUpdates;
    }

    // Methods
    public void checkForUpdates(String url, Date timestamp) {
        // Implementation to check for updates
        System.out.println("Checking for updates on: " + url + " at " + timestamp);
    }

    public String getURL() {
        return url;
    }
}
