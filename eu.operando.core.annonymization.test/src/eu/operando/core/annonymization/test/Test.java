/*******************************************************************************
 *  * Copyright (c) 2016 {TECNALIA}.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the The MIT License (MIT).
 *  * which accompanies this distribution, and is available at
 *  * http://opensource.org/licenses/MIT
 *  *
 *  * Contributors:
 *  *    Gorka Mikel Echevarría {TECNALIA}
 *  * Initially developed in the context of OPERANDO EU project www.operando.eu
 *******************************************************************************/
package eu.operando.core.annonymization.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;
import io.swagger.client.model.DataUnit;
import io.swagger.client.model.DataUnitValuePerAccessLevel;


public class Test {

	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
		ApiClient apiClient = new ApiClient();
		 
	    byte[] postBinaryBody = null; 
	     
	    // create path and map variables 
	    String path = "/dataUnit"; 
	 
	    // query params 
	    List<Pair> queryParams = new ArrayList<Pair>(); 
	    Map<String, String> headerParams = new HashMap<String, String>(); 
	    Map<String, Object> formParams = new HashMap<String, Object>(); 
	 
	    final String[] accepts = { 
	      "application/json", "application/xml" 
	    }; 
	    final String accept = apiClient.selectHeaderAccept(accepts); 
	 
	    final String[] contentTypes = { 
	       
	    }; 
	    final String contentType = apiClient.selectHeaderContentType(contentTypes); 
	 
	    String[] authNames = new String[] {  }; 
	 
	    //TypeRef returnType = new TypeRef<DataUnit>() {}; 
	    GenericType returnType = new GenericType<String>() {};
		
		//public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {
		//String str = apiClient.invokeAPI(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		DataUnit dataUnit = new DataUnit();
		List<DataUnitValuePerAccessLevel> valuesPerAccessLevel = new ArrayList<>();
		DataUnitValuePerAccessLevel dataUnitValuePerAccessLevel = new DataUnitValuePerAccessLevel();
		dataUnitValuePerAccessLevel.setDataUnitId("1");
		dataUnitValuePerAccessLevel.setAccessLevelId("0");
		dataUnitValuePerAccessLevel.setValue("Complete");
		valuesPerAccessLevel.add(0, dataUnitValuePerAccessLevel);
		dataUnit.setId("1");
		dataUnit.setDescription("Education");		
		dataUnit.setValuesPerAccessLevel(valuesPerAccessLevel);
		
		Object postBody = dataUnit;
		try {
			String str = apiClient.invokeAPI("/dataUnit","POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
			System.out.println(str);
		} catch (ApiException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		//String str = client.invokeAPI("swagger.json", "GET", new HashMap<String, String>(), null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
	}
	
	//prueba con post/dataunit

}
