package com.kata.coffee.machine;

public enum InstructionType {
	TEA("T"), CHOCOLATE("H"), COFFEE("C"), ORANGE_JUICE("O"), MESSAGE("M");

	private String mValue = "";

	InstructionType(String pValue) {
		this.mValue = pValue;
	}

	public String toString() {
		return mValue;
	}

	public String getValue() {
		return mValue;
	}

	public static InstructionType getFromValue(String pValue) {
		for (InstructionType vType : InstructionType.values()) {
			if (pValue.equals(vType.getValue())) {
				return vType;
			}
		}
		return null;
	}

}
