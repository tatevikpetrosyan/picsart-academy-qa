package am.picsartacademy.homeworkOOP;

import am.picsartacademy.homeworkOOP.models.MobilePhone;
import am.picsartacademy.homeworkOOP.models.Samsung;
import am.picsartacademy.homeworkOOP.models.iPhone;

public class Working {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.phoneNumber = "091456871";
        myPhone.color = "black";
        myPhone.call();
        System.out.println(myPhone.phoneNumber);
        System.out.println(myPhone.color);

        //another mobile phone
        System.out.println();
        System.out.println("---Another mobile phone---");

        MobilePhone myPhone1 = new MobilePhone();
        myPhone1.phoneNumber = "0954789314";
        myPhone1.color = "blue";
        myPhone1.memory = "256GB";
        myPhone1.call();
        myPhone1.sendSMS();

        System.out.println("My phone's memory is " + myPhone1.memory);

        //example with iphone
        System.out.println();
        System.out.println("---My new iPhone---");

        iPhone iphone = new iPhone();
        iphone.setCamera(true);
        System.out.println("My iphone has camera: " + iphone.getCamera());
        iphone.color = "white";
        iphone.setAccount("Tatev");
        iphone.setCountCamera(3);
        System.out.println("My iphone has " + iphone.getCountCamera() + " cameras");
        iphone.setFaceTime(true);
        System.out.println(iphone.getFaceTime());
        iphone.callFT();

        //example with samsung
        System.out.println();
        System.out.println("---Samsung example---");
        Samsung samsung1 = new Samsung();
        samsung1.color = "yellow";
        samsung1.setCamera(true);
        System.out.println(samsung1.getCamera());
        samsung1.setFlip('Y');
        System.out.println(samsung1.getFlip());

    }
}
