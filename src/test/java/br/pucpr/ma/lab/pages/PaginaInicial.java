package br.pucpr.ma.lab.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;

@ScreenMap(name = "Amazon Brasil", base = "https://www.amazon.com.br", location = "/")
public class PaginaInicial {

	@ElementMap(name = "Link de Pedidos", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]")
	private Button btVerAgenda;
	
}
