import java.lang.invoke.StringConcatFactory;

public class Iphone {

    protected String OpenBrowser(){
        return "The browser was opened";
    }

    protected String CloseBrowser(){
        return "Browser was closed";
    }

    protected String OpenMusicPlayer(){
        return "Music player was opened";
    }

    public String CloseMusicPlayer(){
        return "Music player was closed";
    }

    public String OpenPhoneFunctions(){
        return "Phone functions are available";
    }

    public String makeACall(String contact){
        return "Calling.... " + contact;
    }

    public String finishCall(){
        return "Call ended";
    }

}
