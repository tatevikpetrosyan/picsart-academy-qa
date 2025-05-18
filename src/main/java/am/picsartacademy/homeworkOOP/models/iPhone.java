package am.picsartacademy.homeworkOOP.models;

public class iPhone extends Smartphones {
    private boolean faceTime;
    public void callFT() {
        System.out.println("calling with Face time");
    }

    public void setFaceTime(boolean ft) {
        faceTime = ft;
    }
    public boolean getFaceTime() {
        return faceTime;
    }

}
