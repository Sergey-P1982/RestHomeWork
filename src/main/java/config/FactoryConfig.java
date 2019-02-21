package config;

import entity.Address;
import entity.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("entity")
public class FactoryConfig {
    @Bean(name = "alex")
    public Client getAlex(){
        return new Client(0,"1232", "Alex", getBrovary() );
    }

    @Bean
    public Address getBrovary(){
        return new Address(0,"Brovary, Kyivskaya street");
    }
    @Bean(name = "serhii")
    public Client getSerhii(){
        return new Client(1,"436367", "Serhii", getKyiv() );
    }

    @Bean
    public Address getKyiv(){
        return new Address(1,"Kyiv, Kyivskaya street");
    }



}