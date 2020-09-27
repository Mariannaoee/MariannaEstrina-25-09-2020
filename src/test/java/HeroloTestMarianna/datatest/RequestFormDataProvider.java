package HeroloTestMarianna.datatest;

import HeroloTestMarianna.model.RequestForm;
import org.testng.annotations.DataProvider;

public class RequestFormDataProvider {

    @DataProvider(name = "PositiveTests")
    public static Object[][] getDataFromDataProvider() {
        return new Object[][]{
                {new RequestForm("Marianna", "yes", "marianna@gmail.com", "0526227286")},
                {new RequestForm("מריאנה", "כן", "MaRiAnAn@GmAiL.cOm", "0526227286")},
                {new RequestForm("MARIANNA", "BEST", "MARIANNA@GMAIL.COM", "972526212787")},
                {new RequestForm("Ma1a12d344g", "C4g5j", "marianna4r@gmail.com", "0526227286")},

        };
    }

    @DataProvider(name = "NegativeTests1")
    public static Object[][] getDataFromDataProvider1() {
        return new Object[][]{
                {new RequestForm("", "", "", "")},
        };
    }
 // 100 characters
    @DataProvider(name = "NegativeTests2")
    public static Object[][] getDataFromDataProvider2() {
        return new Object[][]{
                {new RequestForm("NNJNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN777777777777777777777777777",
                        "NNJNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN777777777777777777777777777",
                        "NNJNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN777777777777777777777777777@gmail.com",
                        "NNJNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN777777777777777777777777777")}
        };
    }

    @DataProvider(name = "NegativeTests3")
    public static Object[][] getDataFromDataProvider3() {
        return new Object[][]{
                {new RequestForm("  !", "!", "marianna@@gmail.com", "1231234532")}
        };

    }
}
