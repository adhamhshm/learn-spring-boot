package com.ctt.restservices.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

    @NotNull(message = "First name cannot be empty.")
    @Size(min = 2, message = "First name must be more than 2 characters.")
    private String firstName;

    @NotNull(message = "Last name cannot be empty.")
    private String lastName;

    @NotNull(message = "Email cannot be empty.")
    @Email(message = "Email is not valid.")
    private String email;

    @NotNull(message = "Password cannot be empty.")
    @Size(min = 4, max = 16, message = "Password must be between 4 and 16 characters.")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
