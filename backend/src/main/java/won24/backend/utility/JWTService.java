package won24.backend.utility;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JWTService {
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    
    public static String generateToken(String username, String password) {
        return Jwts.builder()
                .setSubject(username)
                .setSubject(password)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 Stunde gültig
                .signWith(key)
                .compact();
    }
    
    public static String parseToken(String token) {
        try {
            Jws<Claims> claimsJws = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);

            String username = claimsJws.getBody().getSubject();
            return username;

        } catch (JwtException e) {
            return e.getMessage();
        }
    }
    
}
