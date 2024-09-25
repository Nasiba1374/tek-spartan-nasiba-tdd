package tek.tdd.api.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddAccountRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String title;
    private String gender;
    private String maritalStatus;
    private String employmentStatus;
    private String dateOfBirth; // yyyy-MM-dd
}