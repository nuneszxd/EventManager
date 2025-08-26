
import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {

    private int idade;
    private String name;
    private String sobrenome;
    private String email;
    private Long telefone;

    private ArrayList<Events> myEvents;

    public User() {
        myEvents = new ArrayList<Events>();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Events> getMyEvents() {
        return myEvents;
    }

    public void addEventToUser(Events event) {
        myEvents.add(event);
    }

    public void listMyEvents() {
        if (myEvents.isEmpty()) {
            System.out.println(name + " não participa de nenhum evento ainda.");
        } else {
            for (Events event : myEvents) {
                System.out.println(event.getNameEvent() + " - " + event.getCategoria() + " - " + event.getHorario());
            }
        }
    }
}
