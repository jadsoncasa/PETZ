package pag;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import config.Base;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class CT000 extends Base{

	@Dado("^a abertura do blog$")
	public void abrirBlog() throws Throwable {
		try {
			browserChrome();
			driver.get(url);
			Thread.sleep(3500);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/abrirBlog.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}		
	}

	@E("^clicar no link Atendimento na parte superior da tela$")
	public void clicarLinkAtendimento() throws Throwable {
		try {
			driver.findElement(By.linkText("Atendimento")).click();
			driver.switchTo().frame("cp");
			Thread.sleep(3500);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/clicarLinkAtendimento.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@Então("^validar se a tela é exibida através do título \"([^\"]*)\"$")
	public void exibeTitulo(String titulo) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ola\"]")).getText(),titulo);				
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/exibeTitulo.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/exibeTitulo.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@Dado("^o click no botão Enviar$")
	public void clickBtnEnviar() throws Throwable {
		try {
//			driver.findElement(By.id("rn_FormSubmit_20_Button")).click();
			driver.findElement(By.xpath("//*[@id=\"rn_TextInput_6_Contact.Name.First\"]")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//*[@id=\"rn_TextInput_6_Contact.Name.First\"]")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);			
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/clickBtnEnviar.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Nome \"([^\"]*)\"$")
	public void msgNome(String nome) throws Throwable {
		try {	
			try {			
//				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"yui_3_18_1_1_1603906594454_530\"]")).getText(),nome);				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgNome.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgNome.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Sobrenome \"([^\"]*)\"$")
	public void msgSobrenome(String sobrenome) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[2]/b/a")).getText(),sobrenome);
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgSobrenome.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgSobrenome.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo CPF \"([^\"]*)\"$")
	public void msgCPF(String cpf) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[3]/b/a")).getText(),cpf);
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgCPF.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgCPF.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Email \"([^\"]*)\"$")
	public void msgEmail(String email) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[4]/b/a")).getText(),email);
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgEmail.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgEmail.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Telefone \"([^\"]*)\"$")
	public void msgTelefone(String telefone) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[5]/b/a")).getText(),telefone);
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgTelefone.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgTelefone.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Assunto \"([^\"]*)\"$")
	public void msgAssunto(String assunto) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[6]/b/a")).getText(),assunto);
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgAssunto.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgAssunto.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Motivo \"([^\"]*)\"$")
	public void msgMotivo(String motivo) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[7]/b/a")).getText(),motivo);
				Thread.sleep(3500);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgMotivo.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgMotivo.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^Exibe a mensagem de alerta do campo Texto \"([^\"]*)\"$")
	public void msgTexto(String texto) throws Throwable {
		try {	
			try {				
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[8]/b/a")).getText(),texto);
				Thread.sleep(3500);
				driver.close();
			} catch (AssertionError e) {
				driver.findElement(By.xpath("//*[@id=\"rn_ErrorLocation\"]/div[8]/b/a")).sendKeys(Keys.TAB);
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT000/msgTexto.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {			
			driver.findElement(By.xpath("//*[@id=\"rn_TextInput_6_Contact.Name.First\"]")).click();
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT000/msgTexto.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}		
	}
}
