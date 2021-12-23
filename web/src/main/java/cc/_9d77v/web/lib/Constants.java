package cc._9d77v.web.lib;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {

    public static String APP_ID;
    public static String APP_NAME;


    @Value("${app.app_id}")
    public void setAppId(String appId) {
        APP_ID = appId;
    }

    @Value("${app.app_name}")
    public void setAppName(String appName) {
        APP_NAME = appName;
    }

    private static class ConstantsHolder {

        private static final Constants instance = new Constants();
    }

    public Constants() {
    }

    public static  Constants getInstance() {
        return ConstantsHolder.instance;
    }

    public String getAppInfo() {
        return String.format("AppID:%s AppName:%s", APP_ID, APP_NAME);
    }

}
