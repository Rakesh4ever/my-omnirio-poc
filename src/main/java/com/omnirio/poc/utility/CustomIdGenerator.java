/**
 * 
 */
package com.omnirio.poc.utility;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * @author rkumar
 *
 */
public class CustomIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

	    String prefix = "1hy26msd";
	    Connection connection = session.connection();

	    try {
	        Statement statement=connection.createStatement();

	        ResultSet rs=statement.executeQuery("select count(productid) as Id from product");

	        if(rs.next())
	        {
	            int id=rs.getInt(1)+101;
	            String generatedId = prefix + new Integer(id).toString();
	            return generatedId;
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    return null;
	}
	static String usingUUID() { 
	    UUID randomUUID = UUID.randomUUID(); 
	    return randomUUID.toString().replaceAll("-", ""); 
	  } 
}
