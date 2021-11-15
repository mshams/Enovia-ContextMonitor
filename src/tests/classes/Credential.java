/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package tests.classes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Credential {
    private String username;
    private String password;
    private String vault;
    private String serverURL;
    private String role;

    public Credential() {
    }

    @XmlElement
    public void setUsername(String username) {
        this.username = username;
    }

    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement
    public void setVault(String vault) {
        this.vault = vault;
    }

    @XmlElement
    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    @XmlElement
    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getVault() {
        return vault;
    }

    public String getServerURL() {
        return serverURL;
    }

    public String getRole() {
        return role;
    }
}
