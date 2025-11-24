package pe.edu.upc.planwasi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.RolDTO;
import pe.edu.upc.planwasi.entities.Rol;
import pe.edu.upc.planwasi.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rolS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RolDTO> listar() {
        return rolS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody RolDTO rolDTO) {
        ModelMapper m = new ModelMapper();
        Rol a = m.map(rolDTO, Rol.class);
        rolS.insert(a);
    }
    @GetMapping("/{idApp}")
    public RolDTO listarId(@PathVariable("idrol") int idRol) {
        ModelMapper m = new ModelMapper();
        RolDTO dto = m.map(rolS.listId(idRol), RolDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody RolDTO rolDTO) {
        ModelMapper m = new ModelMapper();
        Rol rol = m.map(rolDTO, Rol.class);
        rolS.update(rol);
    }
    @DeleteMapping("/{idApp}")
    public void eliminar(@PathVariable("idrol") int idRol) {
        rolS.delete(idRol);
    }
}
