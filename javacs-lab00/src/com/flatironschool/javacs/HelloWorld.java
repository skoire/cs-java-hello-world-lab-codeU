package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.specification.version");
        Double versionNumber = Double.parseDouble(version);
        return versionNumber;
    }

    public static void main(String[] args) {
    	Double number = getVersion();
	    if (number >= 1.7) {
	    	System.out.println(number);
    	}
    }
}
