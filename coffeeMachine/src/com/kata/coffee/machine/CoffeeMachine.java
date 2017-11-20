package com.kata.coffee.machine;

import org.apache.commons.lang3.StringUtils;

public class CoffeeMachine {
	public static String S_SEPARATOR = ":";
	public DrinkMaker mDrinkMaker = new DrinkMaker();

	public Drink sendInstructions(String pInstruction) throws IllegalArgumentException {
		if (StringUtils.isBlank(pInstruction)) {
			throw new IllegalArgumentException("Invalid instruction");
		} else {
			Drink Drink = null;
			String[] vInstructionsTab = pInstruction.split(S_SEPARATOR);
			InstructionType vInstructionType = chekInstructionsType(vInstructionsTab);
			// TODO Drink maker forwards any message received
			//But how send the message (incorrect in the examples provided)
			if (InstructionType.MESSAGE.equals(vInstructionType)) {
				String message = pInstruction.substring(
						pInstruction.indexOf(":")+1, pInstruction.length() );
				System.out.println(message);
			} else {
				Drink = mDrinkMaker.makeDrink(vInstructionType,
						vInstructionsTab);
			}
			return Drink;
		}

	}

	public InstructionType chekInstructionsType(String[] pInstructionsTab)
			throws IllegalArgumentException {
		String vFirstElement = pInstructionsTab[0];
		String vType = vFirstElement.substring(0, 1);
		InstructionType vInstructionType = InstructionType.getFromValue(vType);
		if (vInstructionType == null) {
			throw new IllegalArgumentException("Invalid instruction type");
		}

		return vInstructionType;

	}
}
