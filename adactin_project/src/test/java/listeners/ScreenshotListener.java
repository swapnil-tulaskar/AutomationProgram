package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import base.BaseClass;
import utils.ScreenshotUtil;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        ScreenshotUtil.captureScreenshot(BaseClass.driver, testName);
    }
}
