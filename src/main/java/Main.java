import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import javax.security.auth.login.LoginException;
        import net.dv8tion.jda.api.JDA;
        import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        JDA jda = (JDA) JDABuilder.createDefault("!token");

        try {
            ((JDABuilder)jda).build();
        } catch (LoginException var3) {
            var3.printStackTrace();
        }

    }
}{
}
