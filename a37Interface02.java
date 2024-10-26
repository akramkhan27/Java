// multiple inheritance using interface

interface MusicPlayer{
    void playMusic();
    void stopMusic();
}
interface Phone{
    void startCall();
    void endCall();
}
interface Camera{
    void takePicture();
    void deletePicture();
}
class SmartPhone implements MusicPlayer, Phone, Camera{

    @Override
    public void playMusic() {
        System.out.println("Playing Music..");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music");
    }

    @Override
    public void endCall() {
        System.out.println("End the call");
    }

    @Override
    public void startCall() {
        System.out.println("Start the call");
    }

    @Override
    public void deletePicture() {
        System.out.println("Delete Picture");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking Picture");
    }

}
public class a37Interface02 {
    public static void main(String[ ]args){
        SmartPhone s1=new SmartPhone();
        s1.playMusic();
        s1.stopMusic();
        s1.startCall();
        s1.endCall();
        s1.takePicture();
        s1.deletePicture();
    }
}
