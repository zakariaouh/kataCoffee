package com.kata.coffee.machine;

import org.junit.Assert;
import org.junit.Test;

public class DrinkMakerTest {
	DrinkMaker mDrinkMaker = new DrinkMaker();

	@Test
	public void testChekSugarsCas1() throws Exception {
		String[] vInstructionsTab = { "T", "2" };
		int resultat = mDrinkMaker.chekSugars(vInstructionsTab);
		Assert.assertEquals(2, resultat);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testChekSugarsCas2() throws Exception {
		String[] vInstructionsTab = { "T", "6" };
 mDrinkMaker.chekSugars(vInstructionsTab);
	}

	@Test
	public void testChekStickCas1() {

		String[] vInstructionsTab = { "T", "6", "0" };
		boolean resultat = mDrinkMaker.chekStick(vInstructionsTab, 2);
		Assert.assertTrue(resultat);

	}

	@Test
	public void testChekStickCas2() {

		String[] vInstructionsTab = { "T", "6" };
		boolean resultat = mDrinkMaker.chekStick(vInstructionsTab, 2);
		Assert.assertFalse(resultat);

	}

	@Test
	public void testChekExtraHotInstructionCas1() {
		String[] vInstructionsTab = { "TH", "6" };
		boolean resultat = mDrinkMaker
				.chekExtraHotInstruction(vInstructionsTab);
		Assert.assertTrue(resultat);

	}

	@Test
	public void testChekExtraHotInstructionCas2() {
		String[] vInstructionsTab = { "T", "6" };
		boolean resultat = mDrinkMaker
				.chekExtraHotInstruction(vInstructionsTab);
		Assert.assertFalse(resultat);

	}

	@Test
	public void testMakeDrink() throws Exception {

		String[] vInstructionsTab = { "TH", "6" };
		Drink vDrink = mDrinkMaker.makeDrink(InstructionType.CHOCOLATE,
				vInstructionsTab);
		Assert.assertNotNull(vDrink);
		Assert.assertEquals(InstructionType.CHOCOLATE,vDrink.getInstructionType());
		Assert.assertEquals(0,vDrink.getNumberOfSugars());
	}
	
}
