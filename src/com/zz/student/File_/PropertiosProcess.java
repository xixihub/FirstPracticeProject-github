package com.zz.student.File_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public class PropertiosProcess {
    public static void main(String[] args) {
  Properties propertios=new Properties();
  propertios.setProperty("name","zz");

  try {
      propertios.store(new FileOutputStream("D:\\myfile\\myfile1\\1.properties"),null);
      propertios.load(new FileInputStream("D:\\myfile\\myfile1\\1.properties"));
      propertios.list(System.out);
     System.out.println(propertios.getProperty("name"));

  } catch (FileNotFoundException e) {
      e.printStackTrace();
  } catch (IOException e) {
      throw new RuntimeException(e);
  }

    }
}
