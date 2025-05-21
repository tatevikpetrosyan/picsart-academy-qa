package am.picsartacademy.homeworkOOP.models;

public class Smartphone extends MobilePhone {
    private boolean camera;
    private int countCamera;
    private boolean touchscreen;
    private String account;
    private int yearOfRelease;

    public void updateApps() {
        System.out.println("updating");
    }
    public void takePicture() {
        System.out.println("camera is turned on");
    }
    public Smartphone() {

    }
    public Smartphone(int countCamera, boolean touchscreen) {
        this.countCamera = countCamera;
        this.touchscreen = touchscreen;
    }


    public void setCamera(boolean cam) {
        camera = cam;
    }
    public boolean getCamera() {
        return camera;
    }
    public void setTouchscreen(boolean touch) {
        touchscreen = touch;
    }
    public boolean getTouchscreen() {
        return touchscreen;
    }
    public void setCountCamera(int countCam) {
        countCamera = countCam;
    }
    public int getCountCamera() {
        return countCamera;
    }
    public void setAccount(String acc) {
        account = acc;
    }
    public String getAccount() {
        return account;
    }
    public void setYearOfRelease(int year) {
        yearOfRelease = year;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }

}
