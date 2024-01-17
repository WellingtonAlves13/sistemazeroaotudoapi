package br.com.blue.projeto.controller;

import br.com.blue.projeto.DTO.PerfilDTO;
import br.com.blue.projeto.service.PerfilService;
import br.com.blue.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfil")
@CrossOrigin
public class PerfilController {

    @Autowired
    private PerfilService perfilServiceService;
    @GetMapping
    public List<PerfilDTO> listarTodos(){
        return perfilServiceService.listarTodos();
    }
    @PostMapping
    public void inserir(@RequestBody PerfilDTO perfil){
        perfilServiceService.inserir(perfil);
    }
    @PutMapping
    public PerfilDTO alterar(@RequestBody PerfilDTO perfil){
        return perfilServiceService.alterar(perfil);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        perfilServiceService.excluir(id);
        return ResponseEntity.ok().build();
    }


}

