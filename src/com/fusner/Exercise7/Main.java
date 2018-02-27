package com.fusner.Exercise7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("name1", "name1@example.com"));
        contacts.add(new Contact("name2", "name2@example.com"));
        contacts.add(new BusinessContact("name3", "name3@example.com", "000-0001"));
        contacts.add(new BusinessContact("name4", "name4@example.com", "000-0002"));

        for (Contact contact: contacts)
        {
            contact.display();
        }
    }
}

class Contact
{
    private String name;
    private String email;

    //region getters and setters
    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    //endregion

    public Contact(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public void display()
    {
        System.out.println("Name: " + this.name + "\nEmail: " + this.email + "\n");
    }
}

class BusinessContact extends  Contact
{
    private String phone;

    //region getters and setters
    public String getPhone()
    {
        return phone;
    }
    //endregion

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public BusinessContact(String name, String email, String phone)
    {
        super(name, email);
        this.phone = phone;
    }

    @Override
    public void display()
    {
        System.out.println("Name: " + super.getName() + "\nEmail: " + super.getEmail() + "\nPhone: " + this.phone + "\n");
    }
}