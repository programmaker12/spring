package com.tnsstudent.SpringBLC;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
       System.out.println(studentDao);
       studentDao.selectAllRows();
      studentDao.deleteStudentRecord(5);
      Hello hello = context.getBean("Hello", Hello.class);
      ((ClassPathXmlApplicationContext)context).close();
	}

}
