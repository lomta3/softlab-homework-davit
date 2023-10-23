package softlab.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(schema = "public",name = "users")
public class Users implements UserDetails {
    @Id
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    private Boolean active;

   @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){ return new ArrayList<>();}

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired(){ return Objects.equals(active,Boolean.TRUE);}

    @Override
    public boolean isAccountNonLocked(){ return Objects.equals(active,Boolean.TRUE);}

    @Override
    public boolean isCredentialsNonExpired() { return Objects.equals(active,Boolean.TRUE);}
    @Override
    public boolean isEnabled(){return Objects.equals(active,Boolean.TRUE);}
}
