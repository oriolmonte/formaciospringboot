package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.oriol")
public class AppConfig {
    // //@Scope("prototype") 
    // @Bean
    // public Alien alien(Computer com){
    //     Alien obj = new Alien();
    //     obj.setAge(25);
    //     obj.setCom(com);
    //     return obj;
    // }
    // @Bean
    // public Desktop desktop(){
    //     //s'instancia cada cop
    //     return new Desktop();
    // }
    // @Bean
    // @Primary
    // public Laptop laptop()
    // {
    //     return new Laptop();
    // }


}
