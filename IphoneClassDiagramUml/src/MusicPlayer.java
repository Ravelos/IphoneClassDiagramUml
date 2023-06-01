public class MusicPlayer {
   public String music ="";

   public String playMusic(String music){
       return "Playing this music: " + music;
   }

   public String pauseMusic(String music){
       return "Music paused";
   }

   public String selectMusic(String music){
       return "Selected music " + music;
   }


}
