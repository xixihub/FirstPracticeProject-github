package com.zz.student0130;
public class ExtendsDetail  extends  Extends{
    public ExtendsDetail(){
        super(100);
        System.out.println(n1+n2+n3);
        System.out.println("子类构造器");

    }
    public ExtendsDetail(int n1,int n2,int n3,int n4){
        super(n1);
        System.out.println("子类有参构造器");
    }
      public  void Basetest100()
      {
          test100();
          test200();
          test300();
          test500();

      }
}
