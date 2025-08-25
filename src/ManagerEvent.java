import java.util.ArrayList;

public class ManagerEvent {

    private ArrayList<Events> events;

    public ManagerEvent(){

        events = new ArrayList<Events>();

    }
    public void addEvent(Events event){
        events.add(event);
    }
}
