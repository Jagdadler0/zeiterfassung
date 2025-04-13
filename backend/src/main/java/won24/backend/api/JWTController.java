package won24.backend.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import won24.backend.utility.JWTService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/jwt")
public class JWTController {
    @PostMapping("/generateToken")
    public ResponseEntity<Map<String, String>> generateToken(@RequestParam String username, String password) {
        String token = JWTService.generateToken(username, password);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/parseToken")
    public ResponseEntity<Map<String, String>> parseToken(@RequestBody String token) {
        Map<String, String> response = new HashMap<>();
        try {
            String username = JWTService.parseToken(token);
            response.put("username",username);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("error", "Ungültiges Token:" + e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    
    
}
