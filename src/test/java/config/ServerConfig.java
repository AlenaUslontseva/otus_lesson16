package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;


@Sources("classpath:config.properties")
public interface ServerConfig extends Config {

    @Key("emailNegativeTest")
    String emailNegativeTest();

    @Key("passwordNegativeTest")
    String passwordNegativeTest();

    @Key("emailPositiveTest")
    String emailPositiveTest();

    @Key("passwordPositiveTest")
    String passwordPositiveTest();

}
