package elennaro.servicies;

import java.util.Set;

@SuppressWarnings("UnnecessaryInterfaceModifier")
public interface DataService {

    @SuppressWarnings("UnusedReturnValue")
    public boolean persist(String problem);

    public Set<String> getRandomData();
}
