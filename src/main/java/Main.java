import config.FactoryConfig;
import entity.Client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(FactoryConfig.class);
        config.getBean("alex", Client.class);
        Client serhii = config.getBean("serhii", Client.class);


       /* GenericApplicationContext config = new GenericXmlApplicationContext("AppContext.xml");
        Client bean1 = config.getBean("client", Client.class);
        System.out.println(bean1);*/


    }
}
