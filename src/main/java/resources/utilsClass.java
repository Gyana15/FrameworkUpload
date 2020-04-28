package resources;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class utilsClass extends MobileTestBase{
Dimension size;
WebDriverWait wait;
@SuppressWarnings("rawtypes")
private TouchAction _touchAction;

@SuppressWarnings("rawtypes")
private TouchAction touchAction() {
if (_touchAction == null) {
_touchAction = new TouchAction(driver);
}
return _touchAction;
}
@SuppressWarnings("rawtypes")
public void swipeOnScreen(Point fromPoint, Point toPoint) {

WaitOptions waitOptions = new WaitOptions().withDuration(Duration.ofMillis(300));
touchAction().press(new PointOption().withCoordinates(fromPoint)).waitAction(waitOptions).moveTo(new PointOption().withCoordinates(toPoint)).waitAction().release().perform();
}

public WebElement AndroidScrollable(String Text){

WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+Text+"\").instance(0)"));
return element;
}


}
