import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BlackPink extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        if (e.getMessage().getContentRaw().equals("!BLACKPINK")){
            e.getChannel().sendMessage("IN YOUR AREA!!!").queue();
        }
    }
}
