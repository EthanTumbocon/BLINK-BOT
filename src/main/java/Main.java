import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        JDA jda = (JDA) JDABuilder.createDefault("!token");
        try {
            ((JDABuilder) jda).build();
        }catch (LoginException e){
            e.printStackTrace();
        }
    }
}
