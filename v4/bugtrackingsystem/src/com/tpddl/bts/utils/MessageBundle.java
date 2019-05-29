package com.tpddl.bts.utils;

import java.util.ResourceBundle;

public class MessageBundle  {
	private static ResourceBundle rb ;
	static {
		rb = ResourceBundle.getBundle(CommonConstants.BUNDLE_NAME);
	}
	public static String getValue(String key) {
		String value = rb.getString(key);
		return value!=null?value:"";
	}

}
