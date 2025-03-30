package browsermanager;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class ChromeBrowserManager extends BrowserManager {

    private Playwright playwright;

    @Override
    public void startService() {
        playwright = Playwright.create();
    }


    @Override
    public void createBrowser() {
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @Override
    public void stopService() {}

}
