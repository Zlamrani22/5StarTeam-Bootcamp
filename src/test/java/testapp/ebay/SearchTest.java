package testapp.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.*;

public class SearchTest extends CommonAPI {

    @Test
    public void AntiquesTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Antiques");
        AntiquesPage antiquesPage = new AntiquesPage(getDriver());
        antiquesPage.clickantiquesbutton();
        waitFor(3);
        homePage.clickSearch();
        String expectAntiques = "ebay.com :Antiques";
        Assert.assertEquals(expectAntiques, (getPageTitle()));
    }

    @Test
    public void AddToCartTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickAddToCart();
        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        addToCartPage.clickaddtocartbutton();
        homePage.clickSearch();
        String expectAddToCart = "ebay.com AddToCart";
        Assert.assertEquals(expectAddToCart, (getPageTitle()));
    }

    @Test
    public void ArtTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Art");
        ArtPage artPage = new ArtPage(getDriver());
        artPage.clickartbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectAntiques = "ebay.com :Art";
        Assert.assertEquals(expectAntiques, (getPageTitle()));
    }

    @Test
    public void BabyTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Baby");
        BabyPage babyPage = new BabyPage(getDriver());
        babyPage.clickbabybutton();
        waitFor(3);
        homePage.clickSearch();
        String expectBaby = "ebay.com :Baby";
        Assert.assertEquals(expectBaby, (getPageTitle()));
    }

    @Test
    public void BookTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Book");
        BookPage bookPage = new BookPage(getDriver());
        bookPage.clickbookbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectBook = "ebay.com :Book";
        Assert.assertEquals(expectBook, (getPageTitle()));
    }

    @Test
    public void BrandOutletTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBrandOutlet();
        BrandOutletPage brandOutletPage = new BrandOutletPage(getDriver());
        brandOutletPage.clickbrandOutletbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectBrandOutlet = "ebay.com BrandOutlet";
        Assert.assertEquals(expectBrandOutlet, (getPageTitle()));
    }

    @Test
    public void BusinessAndIndusterialTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("BusinessAndIndusterial");
        BusinessAndIndusterialPage businessAndIndusterialPage = new BusinessAndIndusterialPage(getDriver());
        businessAndIndusterialPage.clickbusinessAndIndusterialbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectBusinessAndIndusterial = "ebay.com :BusinessAndIndusterial";
        Assert.assertEquals(expectBusinessAndIndusterial, (getPageTitle()));
    }

    @Test
    public void BuyTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBuy();
        BuyPage buyPage = new BuyPage(getDriver());
        buyPage.clickbuybutton();
        waitFor(1);
        homePage.clickSearch();
        String expectBuy = "ebay.com Buy";
        Assert.assertEquals(expectBuy, (getPageTitle()));
    }

    @Test
    public void CameraAndPhotoTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("CameraAndPhoto");
        CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage(getDriver());
        cameraAndPhotoPage.clickcameraAndPhotobutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCameraAndPhoto = "ebay.com :CameraAndPhoto";
        Assert.assertEquals(expectCameraAndPhoto, (getPageTitle()));
    }

    @Test
    public void selectCellPhoneAndAccessoriesOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("CellPhoneAndAccessories");
        CellPhoneAndAccessoriesPage cellPhoneAndAccessoriesPage = new CellPhoneAndAccessoriesPage(getDriver());
        cellPhoneAndAccessoriesPage.clickcellPhoneAndAccessoriesbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCellPhoneAndAccessories = "ebay.com :CellPhoneAndAccessories";
        Assert.assertEquals(expectCellPhoneAndAccessories, (getPageTitle()));
    }

    @Test
    public void CloseAccountTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("CloseAccount");
        CloseAccountPage closeAccountPage = new CloseAccountPage(getDriver());
        closeAccountPage.clickcloseAccountbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCloseAccount = "ebay.com :CloseAccount";
        Assert.assertEquals(expectCloseAccount, (getPageTitle()));
    }

    @Test
    public void selectClothingAndAccessoriesOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("ClothingAndShoesAccessories");
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(getDriver());
        clothingAndAccessoriesPage.clickclothingAndAccessoriesbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectClothingAndShoesAccessories = "ebay.com :ClothingAndShoesAccessories";
        Assert.assertEquals(expectClothingAndShoesAccessories, (getPageTitle()));
    }

    @Test
    public void selectCoinOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Coin");
        CoinPage coinPage = new CoinPage(getDriver());
        coinPage.clickcoinbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCoin = "ebay.com :Coin";
        Assert.assertEquals(expectCoin, (getPageTitle()));
    }

    @Test
    public void CollectiblesAndArtTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickCollectiblesAndArt();
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(getDriver());
        collectiblesAndArtPage.clickcollectiblesAndArtbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCollectiblesAndArt = "ebay.com CollectiblesAndArt";
        Assert.assertEquals(expectCollectiblesAndArt, (getPageTitle()));
    }

    @Test
    public void CommunityTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickCommunity();
        CommunityPage communityPage = new CommunityPage(getDriver());
        communityPage.clickcommunitybutton();
        waitFor(2);
        homePage.clickSearch();
        String expectCommunity = "ebay.com Community";
        Assert.assertEquals(expectCommunity, (getPageTitle()));
    }

    @Test
    public void selectComputerAndTabletOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("computerAndTablet");
        ComputerAndTabletPage computerAndTabletPage = new ComputerAndTabletPage(getDriver());
        computerAndTabletPage.clickcomputerAndTabletbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectComputerAndTablet = "ebay.com :ComputerAndTablet";
        Assert.assertEquals(expectComputerAndTablet, (getPageTitle()));
    }

    @Test
    public void CraftTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Craft");
        CraftPage craftPage = new CraftPage(getDriver());
        craftPage.clickcraftbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectCraft = "ebay.com :Craft";
        Assert.assertEquals(expectCraft, (getPageTitle()));
    }

    @Test
    public void DailyDealsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickDailyDeals();
        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
        String expectDailyDeals = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(expectDailyDeals, (getPageTitle()));
    }

    @Test
    public void DollsAndBearsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("DollsAndBears");
        DollsAndBearsPage dollsAndBearsPage = new DollsAndBearsPage(getDriver());
        dollsAndBearsPage.clickdollsAndBearsbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectDollsAndBears = "ebay.com :DollsAndBears";
        Assert.assertEquals(expectDollsAndBears, (getPageTitle()));
    }

    @Test
    public void selectDVDAndMovieOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("DVDAndMovie");
        DVDAndMoviePage dvdAndMoviePage = new DVDAndMoviePage(getDriver());
        dvdAndMoviePage.clickdvdAndMoviebutton();
        waitFor(2);
        homePage.clickSearch();
        String expectDVDAndMovie = "ebay.com :DVDandMovie";
        Assert.assertEquals(expectDVDAndMovie, (getPageTitle()));
    }

    @Test
    public void EbayRefurbishedTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickEbayRefurbished();
        EbayRefurbishedPage ebayRefurbishedPage = new EbayRefurbishedPage(getDriver());
        ebayRefurbishedPage.clickebayRefurbishedbutton();
        homePage.clickSearch();
        String expectEbayRefurbished = "ebay.com EbayRefurbished";
        Assert.assertEquals(expectEbayRefurbished, (getPageTitle()));
    }

    @Test
    public void ElectronicTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Electeronic");
        ElectronicPage electronicPage = new ElectronicPage(getDriver());
        electronicPage.clickelectronicbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectElectronic = "ebay.com :Electronic";
        Assert.assertEquals(expectElectronic, (getPageTitle()));
    }

    @Test
    public void selectEntertaintmentAndMomorabiliaOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("EntertaintmentAndMomorabilia");
        EntertaintmentMemorabiliaPage entertaintmentMemorabiliaPage = new EntertaintmentMemorabiliaPage(getDriver());
        entertaintmentMemorabiliaPage.clickentertaintmentMemorabiliabutton();
        waitFor(2);
        homePage.clickSearch();
        String expectEntertaintmentAndMomorabilia = "ebay.com :EntertaintmentAndMomorabilia";
        Assert.assertEquals(expectEntertaintmentAndMomorabilia, (getPageTitle()));
    }

    @Test
    public void GetYourThingsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickGetYourThings();
        GetYourThingsPage getYourThingsPage = new GetYourThingsPage(getDriver());
        getYourThingsPage.clickgetYourThingsbutton();
        homePage.clickSearch();
        String expectGetYourThings = "ebay.com GetYourThings ";
        Assert.assertEquals(expectGetYourThings, (getPageTitle()));
    }

    @Test
    public void selectGiftCardAndCouponOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("GiftCardAndCoupon");
        GiftCardAndCouponPage giftCardAndCouponPage = new GiftCardAndCouponPage(getDriver());
        giftCardAndCouponPage.clickgiftCardAndCouponbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectGiftCardAndCoupon = "ebay.com :GiftCardAndCoupon";
        Assert.assertEquals(expectGiftCardAndCoupon, (getPageTitle()));
    }

    @Test
    public void selectHealthAndBeautyOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("HealthAndBeauty");
        HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage(getDriver());
        healthAndBeautyPage.clickhealthAndBeautybutton();
        waitFor(2);
        homePage.clickSearch();
        String expectHealthAndBeauty = "ebay.com :HealthAndBeauty";
        Assert.assertEquals(expectHealthAndBeauty, (getPageTitle()));
    }

    @Test
    public void HelpAndContactTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickHelpAndContact();
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(getDriver());
        helpAndContactPage.clickhelpAndContactbutton();
        homePage.clickSearch();
        String expectHelpAndContact = "ebay.com HelpAndContact";
        Assert.assertEquals(expectHelpAndContact, (getPageTitle()));
    }

    @Test
    public void HomeAndGardenTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("HomeAndGarden");
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage(getDriver());
        homeAndGardenPage.clickhomeAndGardenbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectHomeAndGarden = "ebay.com :HomeAndGarden";
        Assert.assertEquals(expectHomeAndGarden, (getPageTitle()));
    }

    @Test
    public void HowToDonateTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickHowToDonate();
        HowToDonatePage howToDonatePage = new HowToDonatePage(getDriver());
        howToDonatePage.clickhowToDonatebutton();
        homePage.clickSearch();
        String expectHowToDonate = "ebay.com HowToDonate";
        Assert.assertEquals(expectHowToDonate, (getPageTitle()));
    }

    @Test
    public void InboxMessageTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("InboxMessage");
        InboxMessagePage inboxMessagePage = new InboxMessagePage(getDriver());
        inboxMessagePage.clickInboxMessage();
        waitFor(1);
        homePage.clickSearch();
        String expectInboxMessage = "ebay.com :InboxMessage";
        Assert.assertEquals(expectInboxMessage, (getPageTitle()));
    }

    @Test
    public void InvalidSigninTest() {
        InvalidSigninPage invalidSinginPage = new InvalidSigninPage(getDriver());
        invalidSinginPage.clickInvalidSignint();
        InvalidSigninPage invalidSigninPage = new InvalidSigninPage(getDriver());
        invalidSigninPage.clickInvalidSignint();
        String expectInvalidSignin = "ebay.com :InvalidSignin";
        Assert.assertEquals(expectInvalidSignin, (getClass()));
    }

    @Test(enabled = false)
    public void LoginTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSingin();
        LoginPage loginPage = new LoginPage(getDriver());
        //loginPage.clickSinginbutton();
        String expectLogin = "ebay.com :Login";
        Assert.assertEquals(expectLogin, (getPageTitle()));
    }

    @Test
    public void MotorTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Motor");
        MotorPage motorPage = new MotorPage(getDriver());
        motorPage.clickmotorbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectMotor = "ebay.com : Motor";
        Assert.assertEquals(expectMotor, (getPageTitle()));
    }

    @Test
    public void MusicTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Music");
        MusicPage musicPage = new MusicPage(getDriver());
        musicPage.clickmusicbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectMusic = "ebay.com : Music";
        Assert.assertEquals(expectMusic, (getPageTitle()));
    }

    @Test
    public void MyEbayTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickMyEbay();
        MyEbayPage myEbayPage = new MyEbayPage(getDriver());
        myEbayPage.clickmyEbaybutton();
        homePage.clickSearch();
        String expectMyEbay = "ebay.com MyEbay";
        Assert.assertEquals(expectMyEbay, (getPageTitle()));
    }

    @Test
    public void PaymentTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Payment");
        PaymentPage paymentPage = new PaymentPage(getDriver());
        paymentPage.clickpaymentbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectPayment = "ebay.com : Payment";
        Assert.assertEquals(expectPayment, (getPageTitle()));
    }

    @Test
    public void PetSupplyTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("PetSupply");
        PetSupplyPage petSupplyPage = new PetSupplyPage(getDriver());
        petSupplyPage.clickpetSupplybutton();
        waitFor(2);
        homePage.clickSearch();
        String expectPetSupply = "ebay.com : PatSupply";
        Assert.assertEquals(expectPetSupply, (getPageTitle()));
    }

    @Test
    public void PolicyTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Policy");
        PolicyPage policyPage = new PolicyPage(getDriver());
        policyPage.clickpolicybutton();
        waitFor(2);
        homePage.clickSearch();
        String expectPolicy = "ebay.com : Policy";
        Assert.assertEquals(expectPolicy, (getPageTitle()));
    }

    @Test
    public void selectPotteryAndGlassOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("PotteryAndGlass");
        PotteryAndGlassPage potteryAndGlassPage = new PotteryAndGlassPage(getDriver());
        potteryAndGlassPage.clickpotteryAndGlassbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectPottryAndGlass = "ebay.com :PotteryAndGlass";
        Assert.assertEquals(expectPottryAndGlass, (getPageTitle()));
    }

    @Test
    public void RealEstateTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("RealEstate");
        RealEstatePage realEstatePage = new RealEstatePage(getDriver());
        realEstatePage.clickrealEstatebutton();
        waitFor(2);
        homePage.clickSearch();
        String expectRealEstate = "ebay.com : RealEstate";
        Assert.assertEquals(expectRealEstate, (getPageTitle()));
    }

    @Test
    public void RefreshYourHomeForLessTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRefreshYourHomeForLess();
        RefreshYourHomeForLessPage refreshYourHomeForLessPage = new RefreshYourHomeForLessPage(getDriver());
        refreshYourHomeForLessPage.clickRefreshYourHomeForLessbutton();
        homePage.clickSearch();
        String expectRefreshYourHomeForLessTest = "ebay.com RefreshYourHomeForLessTest";
        Assert.assertEquals(expectRefreshYourHomeForLessTest, (getPageTitle()));
    }

    @Test
    public void RegisterTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickregisterbutton();
        homePage.clickSearch();
        String expectRegister = "ebay.com Register";
        Assert.assertEquals(expectRegister, (getPageTitle()));
    }

    @Test
    public void SavedSearchTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSavedSearch();
        SavedSearchPage savedSearchPage = new SavedSearchPage(getDriver());
       //savedSearchPage.clicksavebutton();
        homePage.clickSearch();
        String expectSevedSearch = "ebay.com SavedSearch";
        Assert.assertEquals(expectSevedSearch, (getPageTitle()));
    }

    @Test
    public void SellingTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSelling();
        SellingPage sellPage = new SellingPage(getDriver());
        homePage.clickSearch();
        String expectSelling = "ebay.com Selling";
        Assert.assertEquals(expectSelling, (getPageTitle()));
    }

    @Test
    public void ShopByCategoryTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickShopByCategory();
        ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage(getDriver());
        shopByCategoryPage.clickShopByCategorybutton();
        homePage.clickSearch();
        String expectShopByCategory = "ebay.com ShopByCategory";
        Assert.assertEquals(expectShopByCategory, (getPageTitle()));
    }

    @Test
    public void SingoutTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSignOut();
        SignoutPage signoutPage = new SignoutPage(getDriver());
        signoutPage.clickSignOutButton();
        homePage.clickSearch();
        String expectSignout = "ebay.com Signout";
        Assert.assertEquals(expectSignout, (getPageTitle()));
    }

    @Test
    public void SportingGoodTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("SportingGood");
        SportingGoodPage sportingGoodPage = new SportingGoodPage(getDriver());
        sportingGoodPage.clicksportingGoodButton();
        waitFor(1);
        homePage.clickSearch();
        String expectSportingGood = "ebay.com : SportingGood";
        Assert.assertEquals(expectSportingGood, (getPageTitle()));
    }

    @Test
    public void StampsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Stamps");
        StampsPage stampsPage = new StampsPage(getDriver());
        stampsPage.clickstampsbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectStamps = "ebay.com : Stamps";
        Assert.assertEquals(expectStamps, (getPageTitle()));
    }

    @Test
    public void TodayDealTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickTodayDeal();
        TodayDealPage todayDealPage = new TodayDealPage(getDriver());
        todayDealPage.clicktodaydealbutton();
        homePage.clickSearch();
        String expectTodayDeal = "ebay.com TodayDeal";
        Assert.assertEquals(expectTodayDeal, (getPageTitle()));
    }

    @Test
    public void ToysTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Toys");
        ToysPage toysPage = new ToysPage(getDriver());
        toysPage.clicktoysButton();
        waitFor(2);
        homePage.clickSearch();
        String expectToys = "ebay.com : Toys";
        Assert.assertEquals(expectToys, (getPageTitle()));
    }

    @Test
    public void TravelTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("Travel");
        TravelPage travelPage = new TravelPage(getDriver());
        travelPage.clicktravelbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectTravel = "ebay.com : Travel";
        Assert.assertEquals(expectTravel, (getPageTitle()));
    }

    @Test
    public void ValidPasswordTest() {
        ValidPasswordPage validPasswordPage = new ValidPasswordPage((getDriver()));
        ValidPasswordPage.clickvalidPasswordbutton();
        validPasswordPage.clickValidPassword();
        String expectValidPAssword = "ebay.com :ValidPassword";
        Assert.assertEquals(expectValidPAssword, (getClass()));
    }

    @Test
    public void WatchAndJewellyTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("WatchesAndJewelly");
        WatchesAndJewellyPage watchesAndJewellyPage = new WatchesAndJewellyPage(getDriver());
        watchesAndJewellyPage.clickwatchesAndJewellybutton();
        waitFor(3);
        homePage.clickSearch();
        String expectWatchesAndJewelly = "ebay.com :WatchesAndJewelly";
        Assert.assertEquals(expectWatchesAndJewelly, (getPageTitle()));
    }

    @Test
    public void WatchListTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickWatchList();
        WatchListPage watchListPage = new WatchListPage(getDriver());
        watchListPage.clickwatchListbutton();
        waitFor(1);
        homePage.clickSearch();
        String expectWatchList = "ebay.com WatchList";
        Assert.assertEquals(expectWatchList, (getPageTitle()));
    }

    @Test
    public void WomenSandalsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickWomenSandals();
        WomenSandalsPage womenSandalsPage = new WomenSandalsPage(getDriver());
        womenSandalsPage.clickwomenSandalsbutton();
        waitFor(2);
        homePage.clickSearch();
        String expectWomenSandals = "ebay.com WomenSandals";
        Assert.assertEquals(expectWomenSandals, (getPageTitle()));
    }

    @Test
    public void WomenWalletTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickWomenWallet();
        WomenWalletPage womenWalletPage = new WomenWalletPage(getDriver());
        womenWalletPage.clickwomenWalletbutton();
        homePage.clickSavedSearch();
        String expectWomenWallet = "ebay.com WomenWallet";
        Assert.assertEquals(expectWomenWallet, (getPageTitle()));
    }

    @Test(enabled = false)
    public void SavedTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSavedSearch();
        SavedSearchPage savedSearchPage = new SavedSearchPage(getDriver());
        //savedSearchPage.clicksavebutton();
        homePage.clickSearch();
        String expectSevedSearch = "ebay.com SavedSearch";
        Assert.assertEquals(expectSevedSearch, (getPageTitle()));
    }

    @Test
    public void AboutEbayTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromDropDown("AboutEbay");
        AboutEbayPage aboutEbayPage = new AboutEbayPage(getDriver());
        aboutEbayPage.clickAboutEbaybutton();
        waitFor(2);
        homePage.clickSearch();
        String expectAboutEbay = "ebay.com :AboutEbay";
        Assert.assertEquals(expectAboutEbay, (getPageTitle()));
    }

    @Test
    public void SearchTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSearch();
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickSearchbutton();
        homePage.clickSearch();
        String expectSearch = "ebay.com Search";
        Assert.assertEquals(expectSearch, (getPageTitle()));
    }
}











//    @Test
//    public void AddToCartTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickAddToCart();
//        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
//        String expectAddToCart = "ebay.com AddToCart";
//        Assert.assertEquals(expectAddToCart, (getPageTitle()));
//    }

//    @Test
//    public void AntiquesTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Antiques");
//        waitFor(3);
//        homePage.clickSearch();
//        String expectAntiques = "ebay.com :Antiques";
//        Assert.assertEquals(expectAntiques, (getPageTitle()));
//    }

//    @Test
//    public void ArtTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Art");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectAntiques = "ebay.com :Art";
//        Assert.assertEquals(expectAntiques, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void BabyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Baby");
//        waitFor(3);
//        homePage.clickSearch();
//        String expectBaby = "ebay.com :Baby";
//        Assert.assertEquals(expectBaby, (getPageTitle()));
//    }

//    @Test
//    public void BookTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Book");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectBook = "ebay.com :Book";
//        Assert.assertEquals(expectBook, (getPageTitle()));
//    }

//    @Test
//    public void BrandOutletTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickBrandOutlet();
//        BrandOutletPage brandOutletPage = new BrandOutletPage(getDriver());
//        String expectBrandOutlet = "ebay.com BrandOutlet";
//        Assert.assertEquals(expectBrandOutlet, (getPageTitle()));
//    }

//    @Test
//    public void BusinessAndIndusterialTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("BusinessAndIndusterial");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectBusinessAndIndusterial = "ebay.com :BusinessAndIndusterial";
//        Assert.assertEquals(expectBusinessAndIndusterial, (getPageTitle()));
//    }

//    @Test
//    public void BuyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickBuy();
//        BuyPage buyPage = new BuyPage(getDriver());
//        String expectBuy = "ebay.com Buy";
//        Assert.assertEquals(expectBuy, (getPageTitle()));
//    }

//    @Test
//    public void CameraAndPhotoTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("CameraAndPhoto");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectCameraAndPhoto = "ebay.com :CameraAndPhoto";
//        Assert.assertEquals(expectCameraAndPhoto, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectCellPhoneAndAccessoriesOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("CellPhoneAndAccessories");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectCellPhoneAndAccessories = "ebay.com :CellPhoneAndAccessories";
//        Assert.assertEquals(expectCellPhoneAndAccessories, (getPageTitle()));
//    }

//    @Test
//    public void CloseAccountTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("CloseAccount");
//        waitFor(3);
//        homePage.clickSearch();
//        String expectCloseAccount = "ebay.com :CloseAccount";
//        Assert.assertEquals(expectCloseAccount, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectClothingAndShoesAccessoriesOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("ClothingAndShoesAccessories");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectClothingAndShoesAccessories = "ebay.com :ClothingAndShoesAccessories";
//        Assert.assertEquals(expectClothingAndShoesAccessories, (getPageTitle()));
//    }

//    @Test
//    public void selectCoinOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Coin");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectCoin = "ebay.com :Coin";
//        Assert.assertEquals(expectCoin, (getPageTitle()));
//    }

//    @Test
//    public void CollectiblesAndArtTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickCollectiblesAndArt();
//        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(getDriver());
//        String expectCollectiblesAndArt = "ebay.com CollectiblesAndArt";
//        Assert.assertEquals(expectCollectiblesAndArt, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectComputerAndTabletOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("computerAndTablet");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectComputerAndTablet = "ebay.com :ComputerAndTablet";
//        Assert.assertEquals(expectComputerAndTablet, (getPageTitle()));
//    }

//    @Test
//    public void selectCraftOptionFromDropDown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Craft");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectCraft = "ebay.com :Craft";
//        Assert.assertEquals(expectCraft, (getPageTitle()));
//    }

//    @Test
//    public void DailyDealsTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickDailyDeals();
//        DailyDealsPage dailyDealsPage = new DailyDealsPage(getDriver());
//        String expectDailyDeals = "Electronics, Cars, Fashion, Collectibles & More | eBay";
//        Assert.assertEquals(expectDailyDeals, (getPageTitle()));
//    }

//    @Test
//    public void DollsAndBearsTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("DollsAndBears");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectDollsAndBears = "ebay.com :DollsAndBears";
//        Assert.assertEquals(expectDollsAndBears, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectDVDAndMovieOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("DVDAndMovie");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectDVDAndMovie = "ebay.com :DVDandMovie";
//        Assert.assertEquals(expectDVDAndMovie, (getPageTitle()));
//    }

//    @Test
//    public void ElectronicTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Electronic");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectElectronic = "ebay.com :Electronic";
//        Assert.assertEquals(expectElectronic, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectEntertaintmentAndMomorabiliaOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("EntertaintmentAndMomorabilia");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectEntertaintmentAndMomorabilia = "ebay.com :EntertaintmentAndMomorabilia";
//        Assert.assertEquals(expectEntertaintmentAndMomorabilia, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectGiftCardAndCouponOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("GiftCardAndCoupon");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectGiftCardAndCoupon = "ebay.com :GiftCardAndCoupon";
//        Assert.assertEquals(expectGiftCardAndCoupon, (getPageTitle()));
//    }

//    @Test(enabled = false)
//    public void selectHealthAndBeautyOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("HealthAndBeauty");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectHealthAndBeauty = "ebay.com :HealthAndBeauty";
//        Assert.assertEquals(expectHealthAndBeauty, (getPageTitle()));
//    }

//    @Test
//    public void HelpAndContactTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickAddToCart();
//        HelpAndContactPage helpAndAccountPage = new HelpAndContactPage(getDriver());
//        String expectHelpAndAccount = "ebay.com HelpAndAccount";
//        Assert.assertEquals(expectHelpAndAccount, (getPageTitle()));
//    }

//    @Test
//    public void HomeAndGardenTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("HomeAndGarden");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectHomeAndGarden = "ebay.com :HomeAndGarden";
//        Assert.assertEquals(expectHomeAndGarden, (getPageTitle()));
//    }

//    @Test
//    public void InboxMessageTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("InboxMessage");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectInboxMessage = "ebay.com :InboxMessage";
//        Assert.assertEquals(expectInboxMessage, (getPageTitle()));
//    }

//    @Test
//    public void LoginTest() {
//        HomePage homePage = new HomePage(getDriver());
//        LoginPage loginPage = new LoginPage(getDriver());
//        loginPage.clickSingin();
//        String expectLogin = "ebay.com :Login";
//        Assert.assertEquals("Email or Password", (getPageTitle()));
//    }

//    @Test
//    public void MotorTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Motor");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectMotor = "ebay.com : Motor";
//        Assert.assertEquals(expectMotor, (getPageTitle()));
//    }

//    @Test
//    public void MusicTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Music");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectMusic = "ebay.com : Music";
//        Assert.assertEquals(expectMusic, (getPageTitle()));
//    }

//    @Test
//    public void MyEbayTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickMyEbay();
//        MyEbayPage myEbayPage = new MyEbayPage(getDriver());
//        String expectMyEbay = "ebay.com MyEbay";
//        Assert.assertEquals(expectMyEbay, (getPageTitle()));
//    }

//    @Test
//    public void PaymentTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Payment");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectPayment = "ebay.com : Payment";
//        Assert.assertEquals(expectPayment, (getPageTitle()));
//    }
//
//    @Test
//    public void PetSupplyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("PetSupply");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectPetSupply = "ebay.com : PatSupply";
//        Assert.assertEquals(expectPetSupply, (getPageTitle()));
//    }

//    @Test
//    public void PolicyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickPolicy();
//        PolicyPage policyPage = new PolicyPage(getDriver());
//        String expectPloicy = "ebay.com Policy";
//        Assert.assertEquals(expectPloicy, (getPageTitle()));
//    }
//
//    @Test(enabled = false)
//    public void selectPotteryAndGlassOptionFromDropdown() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("PotteryAndGlass");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectPottryAndGlass = "ebay.com :PotteryAndGlass";
//        Assert.assertEquals(expectPottryAndGlass, (getPageTitle()));
//    }

//    @Test
//    public void RealEstateTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("RealEstate");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectRealEstate = "ebay.com : RealEstate";
//        Assert.assertEquals(expectRealEstate, (getPageTitle()));
//    }

//    @Test
//    public void RegisterTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickRegister();
//        RegisterPage registerPage = new RegisterPage(getDriver());
//        String expectRegister = "ebay.com Register";
//        Assert.assertEquals(expectRegister, (getPageTitle()));
//    }

//    @Test
//    public void SaveSearchesTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickSave();
//        SavedSearchPage savePage = new SavedSearchPage(getDriver());
//        String expectSave = "ebay.com Save";
//        Assert.assertEquals(expectSave, (getPageTitle()));
//    }
//
//    @Test
//    public void SearchTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickSearch();
//        SearchPage searchPage = new SearchPage(getDriver());
//        String expectSearch = "ebay.com Search";
//        Assert.assertEquals(expectSearch, (getPageTitle()));
//    }

//    @Test
//    public void SellingTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickSelling();
//        SellingPage sellingPage = new SellingPage(getDriver());
//        String expectSelling = "ebay.com Selling";
//        Assert.assertEquals(expectSelling, (getPageTitle()));
//    }

//    @Test
//    public void ShopByCategoryTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickShopByCategory();
//        ShopByCategoryPage shopByCategoryPage = new ShopByCategoryPage(getDriver());
//        String expectShopByCategory = "ebay.com ShopByCategory";
//        Assert.assertEquals(expectShopByCategory, (getPageTitle()));
//    }

//    @Test
//    public void SingoutTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickSignOut();
//        SignoutPage signoutPage = new SignoutPage(getDriver());
//        String expectSignout = "ebay.com Signout";
//        Assert.assertEquals(expectSignout, (getPageTitle()));
//    }

//    @Test
//    public void StampsTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Stamps");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectStamps = "ebay.com : Stamps";
//        Assert.assertEquals(expectStamps, (getPageTitle()));
//    }

//    @Test
//    public void ToysTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Toys");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectToys = "ebay.com : Toys";
//        Assert.assertEquals(expectToys, (getPageTitle()));
//    }

//    @Test
//    public void TravelTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("Travel");
//        waitFor(2);
//        homePage.clickSearch();
//        String expectTravel = "ebay.com : Travel";
//        Assert.assertEquals(expectTravel, (getPageTitle()));
//    }

//    @Test
//    public void WatchAndJewellyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("WatchesAndJewelly");
//        waitFor(3);
//        homePage.clickSearch();
//        String expectWatchesAndJewelly = "ebay.com :WatchesAndJewelly";
//        Assert.assertEquals(expectWatchesAndJewelly, (getPageTitle()));
//    }

//    @Test
//    public void ValidPasswordTest() {
//        HomePage homePage = new HomePage(getDriver());
//        ValidPasswordPage validPasswordPage = new ValidPasswordPage(getDriver());
//        ValidPasswordPage.clickPassword();
//        String expectValidPassword = "ebay.com :ValidPassword";
//        Assert.assertEquals(" Valid Password ", (getPageTitle()));
//    }

//    @Test
//    public void SportingGoodTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("SportingGood");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectSportingGood = "ebay.com : SportingGood";
//        Assert.assertEquals(expectSportingGood, (getPageTitle()));
//    }

//    @Test
//    public void EbayFurbishedTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickEbayRefurbished();
//        EbayRefurbishedPage ebayRefurbishedPage = new EbayRefurbishedPage(getDriver());
//        String expectEbayFurbished = "ebay.com EbayFurbished";
//        Assert.assertEquals(expectEbayFurbished, (getPageTitle()));
//    }

//    @Test
//    public void GiftCardAndCouponTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("GiftCardAndCoupon");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectGiftCardAndCoupon = "ebay.com : GiftCardAndCoupon";
//        Assert.assertEquals(expectGiftCardAndCoupon, (getPageTitle()));
//    }

//    @Test
//    public void HowToDonateTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickHowToDonate();
//        HowToDonatePage howToDonatePage = new HowToDonatePage(getDriver());
//        String expectHowToDonate = "ebay.com HowToDonate";
//        Assert.assertEquals(expectHowToDonate, (getPageTitle()));
//    }

//    @Test
//    public void RefreshYourHomeForLessTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickRefreshYourHomeForLess();
//        RefreshYourHomeForLessPage refreshYourHomeForLessPage = new RefreshYourHomeForLessPage(getDriver());
//        String expectRefreshYourHomeForLess = "ebay.com RefreshYourHomeForLess";
//        Assert.assertEquals(expectRefreshYourHomeForLess, (getPageTitle()));
//    }

//    @Test
//    public void TodaysDealTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickTodayDeal();
//        TodayDealPage todayDealPage = new TodayDealPage(getDriver());
//        String expectTodaysDeal = "ebay.com TodaysDeal";
//        Assert.assertEquals(expectTodaysDeal, (getPageTitle()));
//    }

//    @Test
//    public void WomenSandalsTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickWomenSandals();
//        WomenSandalsPage womenSandalsPage = new WomenSandalsPage(getDriver());
//        String expectWomenSandals = "ebay.com WomenSandals";
//        Assert.assertEquals(expectWomenSandals, (getPageTitle()));
//    }
//
//    @Test
//    public void WomenWalletTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickWomenWallet();
//        WomenWalletPage womenWalletPage = new WomenWalletPage(getDriver());
//        String expectWomenWallet = "ebay.com WomenWallet";
//        Assert.assertEquals(expectWomenWallet, (getPageTitle()));
//    }

//    @Test
//    public void AboutEbayTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickAboutEbay();
//        AboutEbayPage aboutEbayPage = new AboutEbayPage(getDriver());
//        String expectAboutEbay = "ebay.com AboutEbay";
//        Assert.assertEquals(expectAboutEbay, (getPageTitle()));
//    }

//    @Test
//    public void CommunityTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickCommunity();
//        CommunityPage communityPage = new CommunityPage(getDriver());
//        String expectCommunity = "ebay.com Community";
//        Assert.assertEquals(expectCommunity, (getPageTitle()));
//    }

//    @Test
//    public void HealthAndBeautyTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.selectOptionFromDropDown("HealthAndBeauthy");
//        waitFor(1);
//        homePage.clickSearch();
//        String expectHealthAndBeauty = "ebay.com : HealthAndBeauty";
//        Assert.assertEquals(expectHealthAndBeauty, (getPageTitle()));
//    }

//    @Test
//    public void SavedTest() {
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickSave();
//        SavedSearchPage savePage = new SavedSearchPage(getDriver());
//        String expectSavedSearch = "ebay.com SavedSearch";
//        Assert.assertEquals(expectSavedSearch, (getPageTitle()));
//    }
//
//}



























