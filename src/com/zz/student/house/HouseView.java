package com.zz.student.house;

public class HouseView {
    private boolean loop = true;
    private char choice;
    private HouseService houseService = new HouseService();

    public void Menu() {
        do {
            System.out.println("==========房屋出租系统=========");
            System.out.println("\t\t\t    1.新增房源");
            System.out.println("          2.查找房屋");
            System.out.println("          3.删除房屋");
            System.out.println("          4.修改房屋信息");
            System.out.println("          5.房屋列表");
            System.out.println("          6.退    出");
            System.out.println("请输入你的选择（1-6）：");
            choice = Utility.readChar();
            switch (choice) {
                case '1':
                    System.out.println("新增房源");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找房屋");
                    getHouse();
                    break;
                case '3':
                    System.out.println("删除房屋");
                    deleteHouse();
                    break;
                case '4':
                    System.out.println("修改房屋信息");
                    update();
                    break;
                case '5':
                    System.out.println("房屋列表");
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出(y/n)");
                    char c = Utility.readConfirmSelection();
                    if (c == 'Y') {
                        loop = false;
                        System.out.println("退出成功");
                    }
                    break;
                default:
                    break;
            }
        } while (loop);
    }

    public void listHouse() {
        HouseModel[] list = houseService.list();
        System.out.println("==========房源列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)\t\t");
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                continue;
            }
            System.out.println(list[i]);
        }
        System.out.println("===============房屋列表显示完毕=========");
    }

    public void addHouse() {
        System.out.println("===========添加房屋=================");
        System.out.print("姓名:");
        String name = Utility.readString(8, "");
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        HouseModel houseModel = new HouseModel(houseService.getId(), name, phone, address, rent, state);
        houseService.addHouse(houseModel);
    }

    public void deleteHouse() {
        System.out.println("===========删除房屋=================");
        System.out.print("编号（-1 退出）：");
        int id = Utility.readInt();
        if (-1 == id) {
            System.out.println("退出删除！");
            return;
        }
        char choice1 = Utility.readConfirmSelection();
        if (choice1 == 'Y') {
            if (houseService.delete(id)) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
            ;
        } else {
            System.out.println("放弃删除！");
        }

    }

    public void getHouse() {
        System.out.println("===========查找房屋=================");
        System.out.print("编号：");
        int id = Utility.readInt();
        HouseModel houseModel = houseService.getHouse(id);
        System.out.println(houseModel);
    }

    public void update() {
        System.out.println("===========修改房屋信息=================");
        System.out.print("编号：");
        int id = Utility.readInt();
        HouseModel houseModel = houseService.getHouse(id);
        if (houseModel == null) {
            System.out.println("编号不存在！");
            return;
        }
        System.out.println(houseModel);
        System.out.print("姓名：");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
             houseModel.setName(name);
        }
        System.out.print("电话：");
        String phone = Utility.readString(11,"");
        if (!"".equals(phone)) {
            houseModel.setPhone(phone);
        }
        System.out.print("地址：");
        String address = Utility.readString(20,"");
        if (!"".equals(address)) {
            houseModel.setAddress(address);
        }
        System.out.print("月租：");
        int rent = Utility.readInt(-1);
        if(-1!=rent){
            houseModel.setRent(rent);
        }
        System.out.print("状态：");
        String state = Utility.readString(3,"");
        if (!"".equals(state)) {
            houseModel.setState(state);
        }
        if (houseService.update(houseModel)) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
        ;
    }
}
