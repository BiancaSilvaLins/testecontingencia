package org.selenide.exemplos.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.TextReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.selenide.exemplos.steps",
        features = "src/test/resources/feature/uploadDeArquivos.feature" ,
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
        //formato legivelmonochrome=true
        monochrome = true
)
public class Runner {

    private static ChromeDriver driver;
    @Rule
    public TestRule report = new TextReport().onSucceededTest(true);

    @BeforeClass
    public static void configure() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }
}