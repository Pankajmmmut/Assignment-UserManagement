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
    @DateTimeFormat
    private LocalDate dob;
    @Email
    private String email;
    @Size(max=12,min=12, message="criteria not met")
    private String phoneNo;
    @DateTimeFormat
    private LocalDate date;
    @DateTimeFormat
    private LocalTime time;

}
