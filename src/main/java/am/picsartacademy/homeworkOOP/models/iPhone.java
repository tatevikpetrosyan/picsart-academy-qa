package am.picsartacademy.homeworkOOP.models;

public class iPhone extends Smartphone {
    private boolean faceTime;

    public void checkSize(String size) {
        System.out.println("this iphone is " + size);
    }
    public void checkSize(String size1, String type) {
        System.out.println("this iphone is " + size1 + type);
    }

    public void callFT() {
        System.out.println("calling with Face time");
    }

    public iPhone(boolean faceTime) {
        this.faceTime = faceTime;
    }

    public void updateApps() {
        super.updateApps();
        System.out.println("updating from APP store");
    }

    public void setFaceTime(boolean ft) {
        faceTime = ft;
    }
    public boolean getFaceTime() {
        return faceTime;
    }

}
