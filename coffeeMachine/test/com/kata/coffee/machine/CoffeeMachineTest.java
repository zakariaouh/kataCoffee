package com.kata.coffee.machine;

import org.junit.Assert;
import org.junit.Test;

public class CoffeeMachineTest {
	CoffeeMachine mCoffeeMachine=new CoffeeMachine();
	@Test(expected=IllegalArgumentException.class)
	public  void testSendInstructionsCas1() {
		mCoffeeMachine.sendInstructions(null);
	}
	@Test
	public  void testSendInstructionsCas2() {
		Drink vDrink = mCoffeeMachine.sendInstructions("Th:1:0");
		Assert.assertNotNull(vDrink);
		Assert.assertEquals(InstructionType.TEA,vDrink.getInstructionType());
		Assert.assertEquals(1,vDrink.getNumberOfSugars());
		Assert.assertTrue(vDrink.isIsExtraHot());
		Assert.assertTrue(vDrink.isHasStick());
	}
	@Test
	public  void testSendInstructionsCas3() {
		Drink vDrink = mCoffeeMachine.sendInstructions("O:1:0");
		Assert.assertNotNull(vDrink);
		Assert.assertEquals(InstructionType.ORANGE_JUICE,vDrink.getInstructionType());
		Assert.assertEquals(1,vDrink.getNumberOfSugars());
		Assert.assertTrue(vDrink.isHasStick());
	}
	@Test
	public  void testSendInstructionsCas4() {
		Drink vDrink = mCoffeeMachine.sendInstructions("M:Hello!!!");
		Assert.assertNull(vDrink);
	}
	@Test
	public  void testSendInstructionsCas5() {
		Drink vDrink = mCoffeeMachine.sendInstructions("M:Hel:lo!!!");
		Assert.assertNull(vDrink);
	}
	@Test
	public  void testSendInstructionsCas6() {
		Drink vDrink = mCoffeeMachine.sendInstructions("M:");
		Assert.assertNull(vDrink);
	}
}
