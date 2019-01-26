package navigate;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
public class NavigateUi extends Base {
    public void home(){
        List<WebElement> elements = new ArrayList<WebElement>();
        //store mobile elements into ArrayList
        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"));
        for(int i=1; i<elements.size(); i++){
            //click on each elements
            clickByXpath("//XCUIElementTypeCell["+i+"]");
            clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]");
        }
    }
}
