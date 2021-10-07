package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateCarPageForStoreMan {

    @FindBy(xpath = "(//div[@class=\"controls\"])[1]")
    public WebElement licensePlateBox;

    @FindBy(id = "custom_entity_type_Tags_5-uid-6159e87d792f9")
    public WebElement sedanCheckBox;

    @FindBy(xpath = "(//div[@class=\"controls\"])[3]")
    public WebElement driverBox;

    @FindBy(id = "custom_entity_type_Location-uid-6159e87d79694")
    public WebElement locationBox;


    @FindBy(id = "custom_entity_type_ChassisNumber-uid-6159ea12b9c98")
    public WebElement chassisNumberBox;


    @FindBy(id = "custom_entity_type_ModelYear-uid-6159ea12b9d8b")
    public WebElement modelYearBox;

    @FindBy(id = "custom_entity_type_LastOdometer-uid-6159ea12b9e7a")
    public WebElement lastOdometerCheckBox;

    @FindBy(id = "date_selector_custom_entity_type_ImmatriculationDate-uid-6159ea12b9f6a")
    public WebElement immatriculationDateBox;

    @FindBy(id = "date_selector_custom_entity_type_FirstContractDate-uid-6159ea12ba057")
    public WebElement firstContractDateBox;

    @FindBy(id = "custom_entity_type_CatalogValue-uid-6159ea12ba2bc")
    public WebElement catalogValuePriceBox;

    @FindBy(id = "custom_entity_type_SeatsNumber-uid-6159ea12ba3bd")
    public WebElement seatsNumberBox;

    @FindBy(id = "custom_entity_type_DoorsNumber-uid-6159ea12ba4dd")
    public WebElement doorsNumberBox;



    @FindBy(id = "custom_entity_type_Color-uid-6159ea12ba5e6")
    public WebElement colorBox;

    @FindBy(id = "s2id_custom_entity_type_Transmission-uid-6159f06fb5256")
    public WebElement transmissionLinkToClick;

    @FindBy(xpath = "//div[.=\"Automatic\"]")
    public WebElement transmissionTypeAutomatic;

    @FindBy(id = "custom_entity_type_CO2Emissions-uid-6159f06fb545c")
    public WebElement cO2EmissionBox;

    @FindBy(id = "uniform-custom_entity_type_Logo_file-uid-6159f06fb58d8")
    public WebElement chooseAFile;

    @FindBy(xpath = "//*[@id=\"custom_entity_type_Vehicle_Model-uid-6159f06fb5cb7-container\"]/div/div[1]/button")
    public WebElement vehicleModelAddClick;

    @FindBy(xpath = "//*[@id=\"custom_entity_type_Vehicle_Model-uid-6159f06fb5cb7-container\"]/div/div[1]/button")
    public WebElement selectVehicleModelforXF2021;

    @FindBy(xpath = "//span/button[text()='Select']")
    public WebElement clickSelecetToCreateCar;

    @FindBy(xpath = "//div/button[normalize-space(.)='Save and Close']")
    public WebElement saveandCloseCarModule;

    //constructor

    public CreateCarPageForStoreMan(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
































}
