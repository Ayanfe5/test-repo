package com.seamfix.nimc.constants;

import java.net.URL;

public class WsdlUrlConstant {
    public static final URL SIM_REG_WSDL_FILE_URL = WsdlUrlConstant.class.getClassLoader().getResource("soapresources/nimc/identitysearch/IdentitySearch.wsdl");
    public static final URL DATA_RECEPTION_WSDL_FILE_URL = WsdlUrlConstant.class.getClassLoader().getResource("soapresources/nimc/datareception/DataReception.wsdl");
}
