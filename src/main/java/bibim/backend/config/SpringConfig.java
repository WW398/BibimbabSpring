package bibim.backend.config;

import bibim.backend.repository.MemberRepository;
import bibim.backend.repository.MemoryMemberRepository;
import bibim.backend.repository.MemoryPostRepository;
import bibim.backend.repository.PostRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfig {
    @Primary
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public PostRepository postRepository() {
        return new MemoryPostRepository();
    }
}