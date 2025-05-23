package won24.backend.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import won24.backend.shared.ShiftType;

@Entity
public class User {
    @Id
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private ShiftType shiftType;

    public User(int id, String firstName, String lastName, String email, ShiftType shiftType) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setShiftType(shiftType);
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setShiftType(ShiftType shiftType) {
        this.shiftType = shiftType;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public ShiftType getShiftType() {
        return shiftType;
    }
    public String getEmail() {
        return email;
    }
}
