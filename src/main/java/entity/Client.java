package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Client {

    private int id;
    private String phone;
    private String name;


    private Address address;

    public Client() {
    }

    public Client(int id, String phone, String name, Address address) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "\n     id=" + id +
                ", \n     phone='" + phone + '\'' +
                ", \n     name='" + name + '\'' +
                ", \n     address=" + address +
                "\n}";
    }
}