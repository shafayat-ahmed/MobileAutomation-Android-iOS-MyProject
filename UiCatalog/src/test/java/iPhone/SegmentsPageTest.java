package iPhone;

import Segments.Segments;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SegmentsPageTest extends Segments {
    Segments segments;
    @BeforeMethod
    public void initElements() {
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void testSegments(){
        segments.clickOnSegments();
    }
    @Test
    public void testSegmentsControlCheck(){
        segments.SegmentsControlCheck();
    }
    @Test
    public void SegmentsControlSearch(){
        segments.SegmentsControlSearch();
    }
    @Test
    public void SegmentsControlTools(){
        segments.SegmentsControlTools();
    }
    @Test
    public void SegmentsControlStyleBorderedtools(){
        segments.SegmentsControlStyleBorderedtools();
    }
    @Test
    public void SegmentsControlStyleBorderedCheck(){
        segments.SegmentsControlStyleBorderedCheck();
    }
    @Test
    public void SegmentsControlStyleBarSearchRed(){
        segments.SegmentsControlStyleBarSearchRed();
    }
    @Test
    public void SegmentsControlStyleBarSearchRedTools(){
        segments.SegmentsControlStyleBarSearchRedTools();
    }
    @Test
    public void SegmentsControlStyleBarImage(){
        segments.SegmentsControlStyleBarImage();
    }
    @Test
    public void SegmentsControlStyleBarImage1(){
        segments.SegmentsControlStyleBarImage1();
    }
}
