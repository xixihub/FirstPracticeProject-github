package com.zz.student.house;

/**
 * @author zz
 * @version 1.0
 * @description 房屋出租操作类
 */
public class HouseService {
    private HouseModel[] houseModels;
    private int size;

    public HouseService(int size) {
        this.size = size;
        this.houseModels = new HouseModel[size];

    }

    public HouseService() {

    }

    public void addHouse(HouseModel houseModel) {
        if (this.houseModels == null) {
            this.houseModels = new HouseModel[1];
            this.houseModels[0]=houseModel;
        } else {
            HouseModel[] houseModelsNew = new HouseModel[this.houseModels.length + 1];
            for (int i = 0; i < this.houseModels.length; i++) {
                if (this.houseModels[i] != null) {
                    houseModelsNew[i] = this.houseModels[i];
                }
            }
            houseModelsNew[this.size] = houseModel;
            this.houseModels = houseModelsNew;
        }
        this.size=this.houseModels.length;
    }

    public HouseModel[] list() {
        return houseModels;
    }
public  HouseModel getHouse(int id) {
        for (int i = 0; i < size; i++) {
            if (houseModels[i].getId() == id) {
                return houseModels[i];
            }
        }
        return null;
}
    public Boolean delete(int id) {
        int index=-1;
        for (int i = 0; i < size; i++) {
            if (houseModels[i].getId() == id) {
                houseModels[i] = null;
                index=i;
                break;
            }
        }
        if (index!=-1) {
            for (int j = 0; j < houseModels.length-1; j++) {
              houseModels[j]=houseModels[j+1];
            }
            houseModels[--size]=null;
            this.size=this.houseModels.length;
            return true;
        }
        return false;
    }

    public boolean update(HouseModel houseModel) {
        int index=-1;
        for (int i = 0; i < size; i++) {
            if (houseModels[i].getId() == houseModel.getId()) {
                houseModels[i] = houseModel;
                index=i;
                break;
            }
        }
        if (index!=-1) {
            return true;
        }
        return false;
    }

    public int getId() {
        if (this.houseModels != null) {
            return this.houseModels.length + 1;
        }
        return 1;
    }

}
