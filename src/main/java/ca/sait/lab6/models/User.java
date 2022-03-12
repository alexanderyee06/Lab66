package ca.sait.lab6.models;

import java.io.Serializable;

/**
 * Represents a user
 * @author alexa
 */
public class User implements Serializable {
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
}
