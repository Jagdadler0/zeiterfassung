package won24.backend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import won24.backend.jwt.JWTService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final JWTService jwtService;
    private final AuthenticationManager authManager;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest request) {
        Authentication auth = authManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.username, request.password)
        );
        String token = jwtService.generateToken(auth);
        return ResponseEntity.ok(token);
    }
}
