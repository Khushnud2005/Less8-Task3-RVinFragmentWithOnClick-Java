package uz.exemple.less8_task3_java.model;

import java.io.Serializable;

public class ContactsModel implements Serializable {

    private String name;
    private String lastName;
    private String phone;

    public ContactsModel(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "ContactsModel{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
