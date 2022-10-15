package info.itsthesky.disky.api.events.specific;

import net.dv8tion.jda.api.interactions.components.Modal;
import net.dv8tion.jda.api.requests.restaction.interactions.ModalCallbackAction;
import org.jetbrains.annotations.NotNull;

public interface ModalEvent {

	ModalCallbackAction replyModal(@NotNull Modal modal);

}
