@Configuration
public class WebClientConfig {
  @Bean public WebClient.Builder webClientBuilder(){
    return WebClient.builder();
  }
}
