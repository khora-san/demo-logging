package fr.diginamic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service de démonstration pour tester le FileAppender.
 */
public class AppService {
    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    /**
     * Exécute le service avec le paramètre fourni.
     *
     * @param param le paramètre à traiter
     */
    public void executer(String param) {
        LOG.debug("Exécution du service pour : {}", param);
    }
}