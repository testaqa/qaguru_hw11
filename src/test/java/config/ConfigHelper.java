package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    public static String getWebRemoteDriver() {
        return "https://"
                + getWebConfig().webRemoteDriverUser()
                + ":"
                + getWebConfig().webRemoteDriverPassword()
                + "@"
                + System.getProperty("web.remote.driver");
    }

    public static boolean isRemoteWebDriver() {
        return System.getProperty("web.remote.driver") != null;
    }

    public static String getAppUsername() {
        return getAuthConfig().username();
    }

    public static String getAppPassword() {
        return getAuthConfig().password();
    }

    public static String getWebUrl() {
        return getWebConfig().webUrl();
    }

    public static String getWebBrowser() {
        return getWebConfig().webBrowser();
    }

    private static AuthConfig getAuthConfig() {
        return ConfigFactory.create(AuthConfig.class, System.getProperties());
    }

    private static WebConfig getWebConfig() {
        return ConfigFactory.create(WebConfig.class, System.getProperties());
    }
}
