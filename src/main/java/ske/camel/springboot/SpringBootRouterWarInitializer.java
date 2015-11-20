package ske.camel.springboot; /**

 * Created by m86922 on 30.09.15.
 */
import org.apache.camel.spring.boot.FatJarRouter;
import org.apache.camel.spring.boot.FatWarInitializer;

public class SpringBootRouterWarInitializer extends FatWarInitializer {

    @Override protected Class<? extends FatJarRouter> routerClass() {
        return CamelApplication.class;
    }
}
