package com.sistemaEscuela.aplicaciones2.autentificacion;

import com.sistemaEscuela.aplicaciones2.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.sistemaEscuela.aplicaciones2.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UsuarioRepository userRepository;

    @Override
//    @Transactional
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Usuario user = userRepository.findByUsername(username)
                .orElseThrow(()
                        -> new UsernameNotFoundException
                        ("user Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }
}