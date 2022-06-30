package com.akshay.spring.springcore.properties;

import java.util.Properties;

public class CoutriesAndLanguages {
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "CoutriesAndLanguages [countryAndLangs=" + countryAndLangs + "]";
	}
	

	

}
