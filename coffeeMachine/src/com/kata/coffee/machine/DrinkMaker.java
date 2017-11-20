package com.kata.coffee.machine;

public class DrinkMaker {


	public DrinkMaker() {
		super();
	}

	public Drink makeDrink(InstructionType pInstructionType,
			String[] pInstructionsTab) throws IllegalArgumentException {

		boolean vIsExtratHot = chekExtraHotInstruction(pInstructionsTab);
		int vNbSugars = chekSugars(pInstructionsTab);
		boolean vStick = chekStick(pInstructionsTab, vNbSugars);
		return new Drink(pInstructionType, vIsExtratHot, vNbSugars, vStick);
	}

	public boolean chekExtraHotInstruction(String[] pInstructionsTab) {
		String vFirstElement = pInstructionsTab[0];
		return vFirstElement.length() >= 2
				&& "H".equalsIgnoreCase(vFirstElement.substring(1, 2));
	}

	public boolean chekStick(String[] pInstructionsTab, int pNbSugars) {
		// TODO Order contains sugar the drink maker should add a stick)
		// if  C:2:33 what should we do?
		boolean vHasStick = false;
		if (pInstructionsTab.length > 2) {
			String vThirdElement = pInstructionsTab[2];
			vHasStick =  pNbSugars > 0;
		}

		return vHasStick;
	}

	public int chekSugars(String[] pInstructionsTab) throws IllegalArgumentException {
		int vNbSugars = 0;
		if (pInstructionsTab.length > 1) {
			String vSecondElement = pInstructionsTab[1];
			if (vSecondElement.matches("[0-2]+")) {
				vNbSugars = Integer.parseInt(vSecondElement);
			}else{
				throw new IllegalArgumentException("Invalid number of sugars.");
			}
		}
		return vNbSugars;
	}
}
