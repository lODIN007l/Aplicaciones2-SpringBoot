//package com.sistemaEscuela.aplicaciones2.security;
//
//import com.sistemaEscuela.aplicaciones2.modelo.Usuario;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class UsuarioPrincipal implements UserDetails {
//
//    private long id;
//    private String nombre;
//    private String password;
//    private String rol;
//    private Collection<? extends GrantedAuthority> authorities;
//
//    public UsuarioPrincipal(long id, String nombre, String password, String rol) {
//        this.id = id;
//        this.nombre = nombre;
//        this.password = password;
//        this.rol = rol;
//    }
//
//    public static UsuarioPrincipal build(Usuario usuario){
//
//        return new UsuarioPrincipal(usuario.getId(), usuario.getNombre(), usuario.getPassword(), usuario.getRoles());
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return nombre;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
