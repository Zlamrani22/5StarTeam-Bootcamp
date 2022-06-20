package testapp.ebay;

//import pages.ebay.HomePage;

//public class HomeTest {
//    public class Hometest extends CommonAPI {
//
//        @Test
//        public void HomeTest() {
//            HomePage testHomePage = new HomePage(getDriver());
//            testHomePage.selectOptionFromMenuDropdownWithGivenText("Home");
//            waitFor(2);
//        }
//    }



//import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.ebay.*;
//
//public class HomeTest extends CommonAPI {
//    @Test
//    public void HomeTest() {
//
//       HomePage homePage= new HomePage(getDriver());
//        HomePage.clickHome();
//        String expectHome = "ebay.com Home";
//        Assert.assertEquals(expectHome, (getPageTitle()));
//    }
//}


//public class HomeTest extends CommonAPI {
//    @Test
//    public void AddToCartTest() {
//
//        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
//        AddToCartPage.clickAddToCart();
//        String expectAddToCart = "ebay.com AddToCart";
//        Assert.assertEquals(expectAddToCart, (getPageTitle()));
//    }
//
//    @Test
//    public void AntiquesTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Antiques");
//        waitFor(3);
//    }
//
//    @Test
//    public void ArtTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Art");
//        waitFor(2);
//    }
//
//    @Test
//    public void BookTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Book");
//        waitFor(1);
//    }
//}
//
//    @Test
//    public void BrandOutletTest() {
//        BrandNamePage brandNamePage = new BrandNamePage(getDriver());
//        brandNamePage.clickBrandName();
//        String expectBrandName = "ebay.com :BrandName";
//        Assert.assertEquals(expectBrandName, (getPageTitle()));
//    }
//
//    @Test
//    public void BussinessAndIndusterialTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("BussinessAndIndusterial");
//        waitFor(3);
//    }
//
//    @Test
//    public void CameraAndPhotopTest() {
//        CameraAndPhotoPage cameraAndPhotopage = new CameraAndPhotoPage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("CameraAndPhoto");
//        waitFor(3);
//    }
//
//    @Test
//    public void CloseAccountTest() {
//        CloseAccountPage closeAccountpage = new CloseAccountPage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("CameraAndPhoto");
//        waitFor(3);
//    }
//
//    @Test
//    public void CarftTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Craft");
//        waitFor(2);
//    }
//
//    @Test
//    public void DailyDealsTest() {
//
//        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
//        DailyDealsPage.clickDailyDeals();
//        String expectDailyDeals = "Electronics, Cars, Fashion, Collectibles & More | eBay";
//        Assert.assertEquals(expectDailyDeals, (getPageTitle()));
//    }
//
//    @Test
//    public void CollectiblesAndArtTest() {
//        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(getDriver());
//        collectiblesAndArtPage.clickCollectiblesAndArt();
//        String expectCollectiblesAndArt = "ebay.com :CollectiblesAndArt";
//        Assert.assertEquals(expectCollectiblesAndArt, (getPageTitle()));
//    }
//
//    @Test
//    public void DollsAndBearsTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("DollsAndBears");
//        waitFor(1);
//    }
//
//    @Test
//    public void ElecteronicTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Electronic");
//        waitFor(2);
//    }
//
//    @Test
//    public void ForgotPasswordTest() {
//        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
//        forgotPasswordPage.clickForgotPassword();
//        String expectForgotPassword = "ebay.com :ForgotPassword";
//        Assert.assertEquals(expectForgotPassword, (getPageTitle()));
//    }
//
//    @Test
//    public void ForgotUserIdTest() {
//        ForgotUseIdPage forgotUserIdpage = new ForgotUseIdPage(getDriver());
//        forgotUserIdpage.clickForgotUserIdt();
//
//        String expectForgotUSerId = "ebay.com :ForgotUserId";
//        Assert.assertEquals(expectForgotUSerId, (getClass()));
//    }
//
//
//    @Test
//    public void HomeAndGardenTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("HomeAndGarden");
//        waitFor(1);
//    }
//
//    @Test
//    public void HelpAndContactTest() {
//        HelpAndContactPage helpAndAccountPage = new HelpAndContactPage(getDriver());
//        helpAndAccountPage.clickHelpAndAccount();
//
//        String expectHelpAndAccount = "ebay.HelpAndContactTest";
//        Assert.assertEquals(expectHelpAndAccount, (getClass()));
//    }
//
//    @Test
//    public void InboxMessageTest() {
//        InboxMessagePage inboxMessagePage = new InboxMessagePage(getDriver());
//        InboxMessagePage inboxmassagePage = new InboxMessagePage(getDriver());
//        inboxMessagePage.clickInboxMessage();
//        String expectInboxMessage = "ebay.com :InboxMessage";
//        Assert.assertEquals(expectInboxMessage, (getClass()));
//    }
//
//    @Test
//    public void InvalidSigninTest() {
//        InvalidSigninPage invalidSinginPage = new InvalidSigninPage(getDriver());
//        invalidSinginPage.clickInvalidSignint();
//        String expectInvalidSignin = "ebay.com :InvalidSignin";
//        Assert.assertEquals(expectInvalidSignin, (getClass()));
//    }
//
//    @Test
//    public void MotorTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Motor");
//        waitFor(2);
//    }
//
//    @Test
//    public void MusicTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Music");
//        waitFor(2);
//    }
//
//    @Test
//    public void MyEbayTest() {
//        MyEbayPage myEbayPage = new MyEbayPage(getDriver());
//        myEbayPage.clickMyEbay();
//        String expectMyEbay = "ebay.com :MyEbay";
//        Assert.assertEquals(expectMyEbay, (getClass()));
//    }

//      @Test
//      public void PaymentTest() {
//          PaymentPage paymentPage = new PaymentPage(getDriver());
//          paymentPage.selectOptionFromAccountSettingWithSelectOptions("Payment");
//          waitFor(5);


//@Test
//public void PetSupplyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("PetSupply");
//        waitFor(2);
//        }
//
//@Test
//public void PolicyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Policy");
//        waitFor(2);
//        }
//
//@Test
//public void RealEstateTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("RealEstate");
//        waitFor(2);
//        }
//
//@Test
//public void RegisterTest() {
//        RegisterPage registerPage = new RegisterPage(getDriver());
//        registerPage.clickRegister();
//        String expectRegister = "ebay.com :Register";
//        Assert.assertEquals(expectRegister, (getClass()));
//        }
//
//@Test
//public void SearchProductTest() {
//        SearchProductPage searchProductPage = new SearchProductPage(getDriver());
//        searchProductPage.clickSearchProduct();
//        String expectSearchProduct = "ebay.com :SearchProduct";
//        Assert.assertEquals(expectSearchProduct, (getPageTitle()));
//        }
//
//@Test
//public void SellTest() {
//        SellingPage sellingPage = new SellingPage(getDriver());
//        sellingPage.clickSelling();
//        String expectSelling = "ebay.com :Sellingy";
//        Assert.assertEquals(expectSelling, (getClass()));
//        }
//
//@Test
//public void ShopByCatogoryTest() {
//        ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage(getDriver());
//        shopByCategoryPage.clickShopByCategory();
//        String expectShopByCategory = "ebay.com :ShopByCategory";
//        Assert.assertEquals(expectShopByCategory, (getClass()));
//        }
//
//@Test
//public void SignoutTest() {
//        SignoutPage signoutPage = new SignoutPage(getDriver());
//        signoutPage.clickSignOut();
//        String expectSignout = "ebay.com :Signout";
//        Assert.assertEquals(expectSignout, (getClass()));
//        }
//
//@Test
//public void LoginTest() {
//        LoginPage loginPage = new LoginPage(getDriver());
//        loginPage.clickLogin;
//        String expectLogin = "ebay.com :Login";
//        Assert.assertEquals(expectLogin, (getClass()));
//        }
//
//@Test
//public void SportingGoodTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("SportingGood");
//        waitFor(1);
//        }
//
//@Test
//public void StampsTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Stamps");
//        waitFor(1);
//        }
//
//@Test
//public void ToysTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Toys");
//        waitFor(2);
//        }
//
//@Test
//public void TravelTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("Travel");
//        waitFor(2);
//        }
//
//@Test
//public void ValidPasswordTest() {
//        ValidPasswordPage validEmailPage = new ValidPasswordPage(getDriver());
//        validEmailPage.clickValidEmailt();
//        String expectValidEmail = "ebay.com :ValidEmail";
//        Assert.assertEquals(expectValidEmail, (getClass()));
//        }
//@Test
//public void WatchAndJewellyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromMenuDropdownWithGivenText("WatchesAndJewelly");
//        waitFor(3);
//        }
//        }


