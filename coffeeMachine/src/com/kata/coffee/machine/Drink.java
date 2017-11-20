package com.kata.coffee.machine;

public class Drink {
    private InstructionType mInstructionType;
    private boolean mIsExtraHot;
    private int numberOfSugars;
    private boolean hasStick;
    
	public Drink() {
		super();
	}

	public Drink(InstructionType pInstructionType, boolean pIsExtraHot,
			int pNumberOfSugars, boolean pHasStick) {
		super();
		mInstructionType = pInstructionType;
		mIsExtraHot = pIsExtraHot;
		numberOfSugars = pNumberOfSugars;
		hasStick = pHasStick;
	}

	public InstructionType getInstructionType() {
		return mInstructionType;
	}

	public void setInstructionType(InstructionType pInstructionType) {
		mInstructionType = pInstructionType;
	}

	public boolean isIsExtraHot() {
		return mIsExtraHot;
	}

	public void setIsExtraHot(boolean pIsExtraHot) {
		mIsExtraHot = pIsExtraHot;
	}

	public int getNumberOfSugars() {
		return numberOfSugars;
	}

	public void setNumberOfSugars(int pNumberOfSugars) {
		numberOfSugars = pNumberOfSugars;
	}

	public boolean isHasStick() {
		return hasStick;
	}

	public void setHasStick(boolean pHasStick) {
		hasStick = pHasStick;
	}




}
