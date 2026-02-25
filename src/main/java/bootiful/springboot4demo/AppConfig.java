package bootiful.springboot4demo;

import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

@Configuration
@Import(AppConfig.AppBeanRegister.class)
public class AppConfig {

    static class AppBeanRegister implements BeanRegistrar {

        @Override
        public void register(BeanRegistry registry, Environment env) {
            String smsSender = env.getProperty("app.sms.sender");

            switch (smsSender) {
                case "twillio":
                    registry.registerBean(TwillioSmsSender.class);
            }
        }
    }
}
