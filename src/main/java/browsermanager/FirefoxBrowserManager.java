package browsermanager;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class FirefoxBrowserManager extends BrowserManager {

    private Playwright playwright;

    @Override
    public void startService() {
        if (null == browser) {
            try {
                playwright = Playwright.create();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void createBrowser() {
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @Override
    public void stopService() {}

}
