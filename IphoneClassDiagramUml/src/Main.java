public class Main {
    public static void main(String[] args) {

        Contact felipe = new Contact();
        felipe.setName("Felipe");


        System.out.println("Hello this is an iphone program. What do you want to do?");

        Iphone carlosPhone = new Iphone();
        System.out.println(carlosPhone.OpenPhoneFunctions());
        System.out.println(carlosPhone.makeACall(felipe.name));

        System.out.println("Do you want to play a music?");

        MusicPlayer countryMusic = new MusicPlayer();
        System.out.println(countryMusic.playMusic("Gospel"));
        System.out.println(countryMusic.pauseMusic("Gospel"));
        System.out.println(countryMusic.selectMusic("Vallenato"));

        Browser mozilla = new Browser();
        mozilla.webPage = "www.google.com";
        System.out.println(mozilla.openWebPage(mozilla.webPage));
        System.out.println(mozilla.openNewTab());
        System.out.println(mozilla.updateWebPage());


    }
}