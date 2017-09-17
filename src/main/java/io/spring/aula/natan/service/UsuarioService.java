/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package io.spring.aula.natan.service;

import io.spring.aula.natan.entity.Usuario;
import io.spring.aula.natan.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> listaUsuario(Usuario usuarioAdd) {

        usuarioRepository.save(usuarioAdd);

        return usuarioRepository.findAll();

    }

}
