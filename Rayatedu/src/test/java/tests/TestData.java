package tests;

import org.testng.annotations.DataProvider;
import util.ExcelUtil;

public class TestData {

    @DataProvider(name = "alumniData")
    public Object[][] data() {
        return ExcelUtil.getData("src/test/resources/new.xlsx", "Sheet1");
    }
}