package iPhone;

import Pickers.Picker;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PickerTest extends Picker {
    Picker picker;
    @BeforeMethod
    public void initElements(){
        picker= PageFactory.initElements(ad, Picker.class);}
    @Test
    public void testActionSheetSimple() throws InterruptedException {
        picker.clickPicker();
    }
}
