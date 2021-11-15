import com.jahsminemma.repository.HibernateSpeakerRepositoryImpl;
import com.jahsminemma.repository.SpeakerRepository;
import com.jahsminemma.service.SpeakerService;
import com.jahsminemma.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.BeanProperty;
import java.beans.beancontext.BeanContext;

@Configuration
public class AppConfig {
    @Bean(name="speakerService")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        return new SpeakerServiceImpl(getSpeakerRepository());
       // service.setRepository(getSpeakerRepository());
    }

    @Bean(name ="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}
