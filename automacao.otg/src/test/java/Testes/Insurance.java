package Testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.MetodosdeTestes;

public class Insurance {

	MetodosdeTestes metodos = new MetodosdeTestes();

	By make = By.xpath("//select[@id='make']");
	By engineperformance = By.xpath("//input[@id='engineperformance']");
	By dateofmanufacture = By.xpath("//input[@id='dateofmanufacture']");
	By numberofseats = By.xpath("//*[@id=\"numberofseats\"]");
	By fuel = By.xpath("//*[@id=\"fuel\"]\r\n");
	By listprice = By.xpath("//*[@id=\"listprice\"]");
	By licenseplatenumber = By.xpath("//*[@id=\"licenseplatenumber\"]");
	By annualmileage = By.xpath("//*[@id=\"annualmileage\"]");
	By nextenterinsurantdata = By.xpath("//*[@id=\"nextenterinsurantdata\"]");
	By firstName = By.xpath("//*[@id=\"firstname\"]");
	By LastName = By.xpath("//*[@id=\"lastname\"]");
	By DateofBirth = By.xpath("//*[@id=\"birthdate\"]");
	By Gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	By StreetAddress = By.xpath("//*[@id=\"streetaddress\"]");
	By Country = By.xpath("//*[@id=\"country\"]");
	By ZipCode = By.xpath("//*[@id=\"zipcode\"]");
	By City = By.xpath("//*[@id=\"city\"]");
	By Occupation = By.xpath("//*[@id=\"occupation\"]");
	By Speeding = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	By nextenterproductdata = By.xpath("//*[@id=\"nextenterproductdata\"]");
	By StartDate = By.xpath("//*[@id=\"startdate\"]");
	By InsuranceSum = By.xpath("//*[@id=\"insurancesum\"]");
	By MeritRating = By.xpath("//*[@id=\"meritrating\"]");
	By DamageInsurance = By.xpath("//*[@id=\"damageinsurance\"]");
	By EuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	By CourtesyCar = By.xpath("//*[@id=\"courtesycar\"]");
	By nextselectpriceoption = By.xpath("//*[@id=\"nextselectpriceoption\"]");
	By SelectOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	By Next = By.id("nextsendquote");
	By email = By.xpath("//*[@id=\"email\"]");
	By Phone = By.xpath("//*[@id=\"phone\"]");
	By Username = By.xpath("//*[@id=\"username\"]");
	By Password = By.xpath("//*[@id=\"password\"]");
	By ConfirmPassowrd = By.xpath("//*[@id=\"confirmpassword\"]");
	By Send = By.xpath("//*[@id=\"sendemail\"]");
	
	@Before
	public void setUp() throws Exception {
		metodos.AbrirNavegador();
	}

	@After
	public void tearDown() {
		metodos.fecharNavegador();
	}

	@Test
	public void test() throws InterruptedException {
		metodos.clicarPorTexto("div[@class='main-navigation']//a", "Automobile");
		metodos.escrever(make, "BMW");
		metodos.escrever(engineperformance, "1");
		metodos.escrever(dateofmanufacture, "08/04/2022");
		metodos.escrever(numberofseats, "1");
		metodos.escrever(fuel, "Eletric Power");
		metodos.escrever(listprice, "1500");
		metodos.escrever(licenseplatenumber, "1234567890");
		metodos.escrever(annualmileage, "3000");
		metodos.clicar(nextenterinsurantdata);
		metodos.escrever(firstName, "Jose");
		metodos.escrever(LastName, "Ramos");
		metodos.escrever(DateofBirth, "06/13/1977");
		metodos.clicar(Gender);
		metodos.escrever(StreetAddress, "Rua SÃ£o Leopoldo");
		metodos.escrever(Country, "Brazil");
		metodos.escrever(ZipCode, "89370000");
		metodos.escrever(City, "Santa Catarina");
		metodos.escrever(Occupation, "Farmer");
		metodos.clicar(Speeding);
		metodos.clicar(nextenterproductdata);
		metodos.escrever(StartDate, "09/20/2022");
		metodos.escrever(InsuranceSum, "15.000,000,00");
		metodos.escrever(MeritRating, "Bonus 3");
		metodos.escrever(DamageInsurance, "Full Coverage");
		metodos.clicar(EuroProtection);
		metodos.escrever(CourtesyCar, "Yes");
		metodos.clicar(nextselectpriceoption);
		metodos.clicar(SelectOption);
		Thread.sleep(3000);
		metodos.clicar(Next);
		metodos.escrever(email, "josecabralramos@gmail.com");
		metodos.escrever(Phone, "51945390762");
		metodos.escrever(Username, "jose.r");
		metodos.escrever(Password, "123Jose");
		metodos.escrever(ConfirmPassowrd, "123Jose");
		Thread.sleep(3000);
		metodos.clicar(Send);
		Thread.sleep(10000);
		metodos.fecharNavegador();

	}

}
