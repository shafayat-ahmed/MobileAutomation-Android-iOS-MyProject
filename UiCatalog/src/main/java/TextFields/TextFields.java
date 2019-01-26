package TextFields;

import common.Base;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFields extends Base {

    public void typeOnUiTextField(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]", "Architecture");
    }
    public void typeOnUiTextFieldRounded(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]", "Rounded");
    }
    public void typeOnUiTextFieldSecure(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]", "test123");
    }
    public void typeOnUiTextFieldLeftView(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]", "Secure");
    }

    public void writeTextToFields()throws InterruptedException{
        typeOnUiTextField();
        typeOnUiTextFieldRounded();
        typeOnUiTextFieldSecure();
        typeOnUiTextFieldLeftView();
    }
}
