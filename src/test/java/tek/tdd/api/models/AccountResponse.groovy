package tek.tdd.api.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountResponse {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String title;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private String employmentStatus;
    @JsonIgnore
    private Date dateOfBirth; // yyyy-MM-dd
}