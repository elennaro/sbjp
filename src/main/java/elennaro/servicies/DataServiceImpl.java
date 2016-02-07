package elennaro.servicies;

import elennaro.entities.Data;
import elennaro.repositories.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service("dataService")
class DataServiceImpl implements DataService {

    private static final Logger LOG = LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    @Qualifier("dataRepository")
    private DataRepository dataRepository;

    @Override
    @SuppressWarnings("unchecked")
    public boolean persist(String problem) {
        try {
            dataRepository.persist(new Data(UUID.randomUUID(), problem));
            return true;
        } catch (Exception e) {
            LOG.error("ERROR SAVING DATA: " + e.getMessage(), e);
            return false;
        }
    }

    @Override
    public Set<String> getRandomData() {
        //noinspection unchecked
        return dataRepository.getRandomData();
    }
}
