package seleniumIntegrationTest


import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.FlatSpec

/**
  * Created by knoldus on 11/3/16.
  */

class IntegrationTestSpec extends FlatSpec {

  val port = 9000
  val baseUrl = "localhost:" + port + "/login"

  "normal user" should "successfully hit the url for login" in {
    //register the browser driver
    val driver = new FirefoxDriver()
    //
    driver.get(baseUrl)
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    // check for login
    driver.findElementById("email").sendKeys("john@gmail.com")
    driver.findElementById("password").sendKeys("abcdef")
    driver.findElementByClassName("btn").click()
    //check for changing of url
    assert(driver.getCurrentUrl() === "http://localhost:9000/dashboard")
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    // user click on award modal
    driver.findElementById("award").click()
    //check that award modal is displayed
    driver.findElementById("awardmenu").isDisplayed
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    //user add an new award
    driver.findElementByCssSelector(".btn-info").click()
    driver.findElementById("id").sendKeys("3")
    driver.findElementById("name").sendKeys("codechef")
    driver.findElementById("details").sendKeys("winner")
    driver.findElementByCssSelector(".btn-default").click()
    //user delete a award
    driver.get("http://localhost:9000/deleteAward?id=3")
    //user click on language modal
    driver.findElementById("language").click()
    //modal is displayed or not
    driver.findElementById("languageMenu").isDisplayed
    driver.findElementByCssSelector(".btn-info").click()
    driver.findElementById("fluency").sendKeys("bad")
    driver.findElementByCssSelector(".form-control").sendKeys("eng")
    driver.findElementByCssSelector(".btn-default").click()
    //user click on delete on language
    driver.get("http://localhost:9000/deleteLanguage?sno=2")
    //user click on assignment modal
    driver.findElementById("assignments").click()
    //modal is displayed or not
    driver.findElementById("assignmentMenu").isDisplayed
    //user click on programming language modal
    driver.findElementById("progLanguages").click()
    //modal is displayed or not
    driver.findElementById("progLangMenu").isDisplayed
    //add a new programming language
    driver.findElementByCssSelector(".btn-info").click()
    driver.findElementById("langName").sendKeys("c++")
    driver.findElementById("fluency").sendKeys("cool")
    driver.findElementByCssSelector(".btn-default").click()
    // delete a programming language
    driver.get("http://localhost:9000/deleteProgLanguage?sno=1")
    // log out
    driver.get("http://localhost:9000/logout")
    assert(driver.getCurrentUrl() === "http://localhost:9000/login")
  }
  "admin user" should "successfully hit the url for login" in {
    //register the browser
    val driver = new FirefoxDriver()
    //
    driver.get(baseUrl)
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    // check for login
    driver.findElementById("email").sendKeys("admin@gmail.com")
    driver.findElementById("password").sendKeys("admin")
    driver.findElementByClassName("btn").click()
    //check for changing of url
    assert(driver.getCurrentUrl() === "http://localhost:9000/adminDashboard")
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    // user click on award modal
    driver.findElementById("award").click()
    //check that award modal is displayed
    driver.findElementById("awardmenu").isDisplayed
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    //user add an new award
    driver.findElementByCssSelector(".btn-info").click()
    driver.findElementById("id").sendKeys("3")
    driver.findElementById("name").sendKeys("codechef")
    driver.findElementById("details").sendKeys("winner")
    driver.findElementByCssSelector(".btn-default").click()
    //user delete a award
    driver.get("http://localhost:9000/deleteAward?id=5")
    //user click on language modal
    driver.findElementById("language").click()
    //modal is displayed or not
    driver.findElementById("languageMenu").isDisplayed
    driver.findElementByCssSelector(".btn-info").click()
    driver.findElementById("fluency").sendKeys("bad")
    driver.findElementByCssSelector(".form-control").sendKeys("eng")
    driver.findElementByCssSelector(".btn-default").click()
    //user click on delete on language
    driver.get("http://localhost:9000/deleteLanguage?sno=2")
    //user click on assignment modal
    driver.findElementById("assignments").click()
    //modal is displayed or not
    driver.findElementById("assignmentMenu").isDisplayed
    // add a new assignment
    driver.findElementByCssSelector(".btn-info").click
    //user click on programming language modal
    driver.findElementById("progLanguages").click()
    //modal is displayed or not
    driver.findElementById("progLangMenu").isDisplayed
    //add a new programming language
    driver.findElementByCssSelector(".btn-info").click()
    driver.findElementById("langName").sendKeys("c++")
    driver.findElementById("fluency").sendKeys("cool")
    driver.findElementByCssSelector(".btn-default").click()
    // delete a programming language
    driver.get("http://localhost:9000/deleteProgLanguage?sno=1")
    driver.findElementById("interndetails").click()
    driver.findElementById("internmenu").isDisplayed

  }
}
