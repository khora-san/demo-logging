package fr.diginamic;

import fr.diginamic.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe de test pour valider la configuration SLF4J/Logback.
 */
public class TestLogging {

    private static final Logger LOG = LoggerFactory.getLogger(TestLogging.class);

    /**
     * Point d'entrée du programme.
     *
     * @param args arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        LOG.info("Bienvenue dans le projet demo-logging !");

        AppService service = new AppService();
        service.executer("Khorasan");
    }
}