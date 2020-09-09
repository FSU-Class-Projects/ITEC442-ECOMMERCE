package edu.frostburg.itec442.ecommerce.service;

import edu.frostburg.itec442.ecommerce.model.Merchandise;
import edu.frostburg.itec442.ecommerce.repository.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchandiseService {

    @Autowired
    MerchandiseRepository merchandiseRepository;

    /**
     * Save/Update merchandise
     * @param merchandise
     * @return
     */
    public Merchandise save(Merchandise merchandise){
        return merchandiseRepository.save(merchandise);
    }
}
