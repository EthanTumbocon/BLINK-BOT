import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
//https://discord.com/oauth2/authorize?client_id=<client_id>&scope=bot;
    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault("!token");
        PingPong pingPong = new PingPong();
        JDABuilder.addEventListeners(pingPong);
        JDABuilder.setActivity(Activity.watching("Listening to kpop!"));
        JDA jda = null;
        try {
            jda = jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
        try {
            jda.awaitReady();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


