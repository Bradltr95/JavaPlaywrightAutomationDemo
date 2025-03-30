package browsermanager;

import com.microsoft.playwright.Browser;

public abstract class BrowserManager {
    protected Browser browser;
    protected abstract void startService();
    protected abstract void stopService();
    protected abstract void createBrowser();

    public BrowserManager() {}
    // Kill the existing browser object instance.
    public void quitBrowser() {
        if (browser != null) { browser = null; }
    }

    // Check if we have an empty browser object and need to create one. Otherwise, we return the current instance of the browser object.
    public Browser getBrowser() {
        if (browser == null) {
            startService();
            createBrowser();
        }

        return browser;
    }
}
