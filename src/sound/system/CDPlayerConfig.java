package sound.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
@Configuration
public class CDPlayerConfig {

    @Bean(name = "LonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
// 1. Way1
//    @Bean
//    public CDPlayer cdPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }
//2. Way2
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
