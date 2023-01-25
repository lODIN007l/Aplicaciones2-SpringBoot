//package com.sistemaEscuela.aplicaciones2.CONFIG;
//
//
//import com.sistemaEscuela.aplicaciones2.servicios.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AdminCreate implements CommandLineRunner {
//
//    @Autowired
//    UsuarioService usuarioService;
//
//    @Autowired
//    RolService rolService;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Override
//    public void run(String... args) throws Exception {
//        /*Rol rolAdmin = new Rol();
//        rolAdmin.setRolNombre(RolNombre.ROLE_ADMIN);
//        Rol rolUser = new Rol();
//        rolUser.setRolNombre(RolNombre.ROLE_USER);
//        Usuario adminUser = new Usuario("admin", passwordEncoder.encode("admin"));
//        Set<Rol> roles = new HashSet<>();
//        roles.add(rolAdmin);
//        roles.add(rolUser);
//        adminUser.setRoles(roles);
//
//        //insert
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
//        usuarioService.save(adminUser);*/
//    }
//}