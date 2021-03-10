package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface AuthConfig extends Config {

    String username();

    String password();
}
