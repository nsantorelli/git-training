package com.zenika.resanet.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class ResanetSchemaExport {
	
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SchemaExport schemaExport = new SchemaExport(configuration);
		schemaExport.create(true, true);
	}
}
