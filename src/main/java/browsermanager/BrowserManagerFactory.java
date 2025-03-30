package browsermanager;

public class BrowserManagerFactory  {
    public static BrowserManager getManager(DriverType type) {
        BrowserManager browserManager;

        switch(type) {
            case CHROME:
                browserManager = new  ChromeBrowserManager();
                break;
            case FIREFOX:
                browserManager = new FirefoxBrowserManager();
                break;
            default:
                browserManager = new ChromeBrowserManager();
                break;
        }

        return browserManager;
    }
}
