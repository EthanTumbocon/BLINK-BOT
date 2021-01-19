import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        JDA jda = (JDA) JDABuilder.createDefault("ODAwODc0MTY4MzA3NTQ4MTkw.YAYeMQ.xy15HYAcZrf3F4xkVhq_yMtY25M");
        try {
            ((JDABuilder) jda).build();
        }catch (LoginException e){
            e.printStackTrace();
        }
    }
}
