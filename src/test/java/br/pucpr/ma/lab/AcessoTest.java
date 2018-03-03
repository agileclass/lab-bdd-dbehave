package br.pucpr.ma.lab;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class AcessoTest {

	private BehaveContext eng = BehaveContext.getInstance();

	Logger log = Logger.getLogger(AcessoTest.class);

	public AcessoTest() {
	}

	@Test
	public void testAllAcesso() throws Throwable {
		eng.run(Arrays.asList("/stories"));
	}
	
}
