package com.epam.rp

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification

class TutByTest extends Specification {

    private final static Logger LOGGER =
            LoggerFactory.getLogger(TutByTest.class)

    private static WebDriver driver
    private static final String CHROME_KEY = "webdriver.chrome.driver"
    private static final String CHROME_VALUE = "./drivers/chromedriver.exe"

    def setupSpec() {

        LOGGER.info("before class")
        System.setProperty(CHROME_KEY, CHROME_VALUE)
    }

    def cleanupSpec() {
        LOGGER.info("after class")
    }

    def setup() {

        LOGGER.info("before method")

        driver = new ChromeDriver()
    }

    def cleanup() {

        LOGGER.info("after method")

        driver.close()
    }

    def "test1"() {

        given: "user does something"
        when: "user does something"
        then: "does something else"
        expect:
        Math.max(2, 3) == 3
    }

    def "test2"() {

        driver.navigate().to("https://tut.by")

        expect:
        123 != 10
    }

    def "test3"() {

        expect:
        123 != 10
    }

}
