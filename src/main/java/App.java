import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beani1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beani2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beani1.getMessage());
//        ------------------------------------------
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean1 = (Cat) applicationContext1.getBean("cat");
        Cat bean2 = (Cat) applicationContext1.getBean("cat");
        System.out.println(bean1.getMessage());

        System.out.println(beani1 == beani2);
        System.out.println(bean1 == bean2);


    }
}