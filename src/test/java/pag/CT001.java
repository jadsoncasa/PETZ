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

public class CT001 extends Base{

	@Dado("^a abertura da tela de assinatura$")
	public void telaAssinatura() throws Throwable {	 
		try {			
			browserChrome();
			driver.get("https://www.petz.com.br/nova-assinatura");
			Thread.sleep(4000);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/abrirTelaAssinatura.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@Então("^exibe o título \"([^\"]*)\"$")
	public void ExibeTituloTela(String titulo) throws Throwable {
		try {	
			try {
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"busca\"]/div[1]/h2")).getText(),titulo);
				Thread.sleep(4000);
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT001/exibeTitulo.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/exibeTitulo.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	

	@Dado("^a busca de um \"([^\"]*)\" cadastro no sistema$")
	public void buscaProduto(String produto) throws Throwable {	 
		try {			
			driver.findElement(By.xpath("//*[@id=\"searchAssinatura\"]")).sendKeys(produto);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"busca\"]/div[1]/div[2]/div/span/button")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/buscaProduto.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^clicar no botão Adcionar ao lado do produto$")
	public void clicarBtnAddProduto() throws Throwable {
		try {			
			driver.findElement(By.xpath("//*[@id=\"search-products\"]")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/clicarBtnAddProduto.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^clicar no botão Adcionar no modal da descrição do produto$")
	public void clicarBtnAddProdutoModal() throws Throwable {	
		try {			
			driver.findElement(By.xpath("//*[@id=\"search-products-variacao\"]")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/clicarBtnAddProdutoModal.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@E("^inserir um \"([^\"]*)\" negativo no campo quantidade$")
	public void InserirValorNegativoCampoQnt(String valor) throws Throwable {	
		try {			
			driver.findElement(By.xpath("//*[@id=\"collapse-carrinho\"]/tbody/tr/td[2]/div/input")).sendKeys(valor,Keys.TAB);			
			Thread.sleep(4000);
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/InserirValorNegativoCampoQnt.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@Então("^validar se o produto é removido do resumo \"([^\"]*)\"$")
	public void validarProdutoRemovidoResumo(String texto) throws Throwable {	 
		try {	
			try {
				Thread.sleep(4000);
				Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"semItens\"]")).getText(),texto);
				Thread.sleep(4000);
				driver.close();
			} catch (AssertionError e) {
				img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				evidencias(img,fail,"CT001/validarProdutoRemovidoResumo.png");
				System.out.println(e.getMessage());
				Assert.fail();
			}															 
		} catch (Exception e) {
			img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			evidencias(img,fail,"CT001/validarProdutoRemovidoResumo.png");
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}	
}
