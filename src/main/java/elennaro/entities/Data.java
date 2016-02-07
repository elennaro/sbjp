package elennaro.entities;

import java.util.UUID;

public class Data implements DomainObject {

    private UUID id;
    private String description;

    public Data(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    @SuppressWarnings("unused")
    public void setDescription(String description) {
        this.description = description;
    }
}
