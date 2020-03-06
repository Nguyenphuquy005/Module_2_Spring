package modle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name ;
    private String date ;
    private String address ;
    private String img ;
    private static List<Customer> list;
    static {
        list = new ArrayList<>() ;
        list.add(new Customer("Bạn Xấu Nhất","2019/12/12","dn","img/hinh1.jpg")) ;
        list.add(new Customer("Còn Bạn Xấu Bỏ Mẹ","2019/12/12","dn","img/hinh2.jpg")) ;
        list.add(new Customer( "Bạn thì ngta đéo mún nhìn","2019/12/12","dn","img/hinh3.jpg")) ;

    }
    public Customer(String name, String date, String address, String img) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.img = img;
    }


    public Customer() {
    }

    public static List<Customer> getList() {
        return list;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public  void setList(List<Customer> list) {
        this.list = list;
    }


}

