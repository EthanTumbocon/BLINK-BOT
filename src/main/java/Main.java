import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) {
        JDA jda = (JDA) JDABuilder.createDefault("token");
        Pingpong pingpong = new PingPong();

        try {
            ((JDABuilder) jda).build();
        }catch (LoginException e){
            e.printStackTrace();
        }
    }
}
