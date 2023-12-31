package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

    public ConfigDataProvider() throws IOException
    {
    	String cpath=System.getProperty("user.dir")+".//ConfigData//config.properties";
    	File src=new File(cpath);
    	
    	FileInputStream file=new FileInputStream(src);
    	pro=new Properties();
    	pro.load(file);
    }
    public String nodeJsPath()
    {
    	return pro.getProperty("nodejspath");
    }
    public String apkPath()
    {
    	return pro.getProperty("apkpath");
    }
    public String hostUrl()
    {
    	return pro.getProperty("hosturl");
    }

}