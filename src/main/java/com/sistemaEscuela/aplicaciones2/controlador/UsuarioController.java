//package com.sistemaEscuela.aplicaciones2.controlador;
//
//import com.sistemaEscuela.aplicaciones2.modelo.Usuario;
//import com.sistemaEscuela.aplicaciones2.servicios.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import  org.apache.commons.lang3.StringUtils;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller
//@RequestMapping("/usuario")
//public class UsuarioController {
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
//    @GetMapping("/registro")
//    public String nuevo(){
//        return "registro";
//    }
//
//    @PostMapping("/registrar")
//    public ModelAndView registrar(String nombre, String password){
//        ModelAndView mv = new ModelAndView();
//        if(StringUtils.isBlank(nombre)){
//            mv.addObject("error", "ese nombre no es válido");
//            mv.setViewName("registro");
//            return mv;
//        }
//        if(StringUtils.isBlank(password)){
//            mv.addObject("error", "esa contraseña no es válida");
//            mv.setViewName("registro");
//            return mv;
//        }
//        if(usuarioService.existsUsuarioNombre(nombre)){
//            mv.addObject("error", "ese nombre ya existe");
//            mv.setViewName("registro");
//            return mv;
//        }
//        String passwordEnc = passwordEncoder.encode(password);
//        Usuario usuario = new Usuario(nombre, passwordEnc,"ESTUDIANTE");
//
//
//
////        Optional <Rol> rol = Optional.ofNullable(rolService.getByRolNombre(RolNombre.ROLE_USER).orElseThrow(() -> new NoSuchElementException("No existe el rol")));
////        Rol rol = rolService.getByRolNombre(RolNombre.ROLE_USER).orElse(null);
//
//
////        Set<Rol> roles = new HashSet<>();
////        roles.add(rol);
////        usuario.setRoles(roles);
//        usuarioService.save(usuario);
//        mv.addObject("registroOK", "Cuenta creada, ingresa tus credenciales para iniciar sesión");
//        mv.setViewName("login");
//        return mv;
//    }
//
//}
