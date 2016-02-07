package elennaro.repositories;

import elennaro.entities.DomainObject;

import java.util.Set;

@SuppressWarnings("unused")
public interface DataRepository<V extends DomainObject> {

    void persist(V object);

    @SuppressWarnings("unused")
    void delete(V object);

    Set<String> getRandomData();

}
