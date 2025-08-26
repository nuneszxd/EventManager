import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;

public class ManagerEvent {

    private ArrayList<Events> events;

    public ManagerEvent(){

        events = new ArrayList<Events>();

    }
    public void addEvent(Events event){
        events.add(event);
    }
    public void listEvents(){

        if (events.isEmpty()){

            System.out.println("Não há eventos disponiveis no momento. :(");

        } else {

            events.sort((e1, e2) -> e1.getHorario().compareTo(e2.getHorario()));

            for(Events event : events){

                System.out.println(event.getNameEvent());
                System.out.println(event.getCategoria());
                System.out.println(event.getDescricao());
                System.out.println(event.getHorario());
                System.out.println(event.getEndereco());

            }

        }

    }
    public void userJoinEvent(User user, int eventIndex) {
        if(eventIndex < 0 || eventIndex >= events.size()) {
            System.out.println("Índice de evento inválido!");
            return;
        }
        Events chosenEvent = events.get(eventIndex);
        user.addEventToUser(chosenEvent);
        System.out.println(user.getName() + " agora participa do evento: " + chosenEvent.getNameEvent());
    }
}
