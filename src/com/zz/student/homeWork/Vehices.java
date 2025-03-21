package com.zz.student.homeWork;

import lombok.Data;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
public interface Vehices {
    void work();
}
class Horse implements Vehices{
 @Override
    public void work()
    {
        System.out.println("马车");
    }
}
class Boat implements Vehices{
    @Override
    public void work()
    {
        System.out.println("船");
    }
}
class feijing implements Vehices{
    @Override
    public void work()
    {
        System.out.println("飞机");
    }
}
@Data
class Person{
    private String name;
    private Vehices vehices;
    public Person(String name,Vehices vehices)
    {
        this.name=name;
        this.vehices=vehices;
    }
    public void show()
    {
        if(vehices instanceof Boat){
            System.out.println("船111111");
            vehices=VehicesFactory.getBoat();
        } else if (vehices instanceof Horse) {
            System.out.println("马车111111");
            vehices=VehicesFactory.getHorse();
        }else if(vehices instanceof feijing){
            System.out.println("飞机111111");
            vehices=VehicesFactory.getfeijing();
        }
        vehices.work();
    }
}
class VehicesFactory{
    private static Horse horse=new Horse();

   static Boat getBoat(){
       return new Boat();
   }
    static Horse getHorse(){
        return horse;
    }
    static feijing getfeijing(){
        return new feijing();
    }
}