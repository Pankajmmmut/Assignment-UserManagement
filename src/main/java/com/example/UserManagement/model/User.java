package com.example.UserManagement.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NonNull
    private Integer userId;
    @NotEmpty
    private String userName;
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth should be in the format yyyy-MM-dd")
    private LocalDate dob;
    @Email
    private String email;
    @Pattern(regexp = "^\\d{2}\\d{10}$", message = "Phone number should be 12 digits with a 2-digit country code")
    private String phoneNo;
    @DateTimeFormat
    private LocalDate date;
    @DateTimeFormat
    private LocalTime time;

}
