package com.bocc.action.util;

public class MerchantStrUtil {

	public static String getmerchantStr(String merchantId){
		String merchantStr = merchantId;
		if (merchantId.equals("2000000001")) {
			merchantStr = "hyweb";
		}
		if (merchantId.equals("1000000003")) {
			merchantStr = "xfhcl";
		}
		if (merchantId.equals("1000000002")) {
			merchantStr = "yuanwei";
		}
		if (merchantId.equals("1000000004")) {
			merchantStr = "nosoup";
		}
		
		return merchantStr;
	}
}
