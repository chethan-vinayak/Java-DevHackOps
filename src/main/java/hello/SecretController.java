import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

    // Secure: Read token from environment variable
    private String githubToken = System.getenv("GITHUB_TOKEN");

}
