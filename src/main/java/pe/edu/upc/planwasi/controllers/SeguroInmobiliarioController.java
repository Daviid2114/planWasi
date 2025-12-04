package pe.edu.upc.planwasi.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.RolDTO;
import pe.edu.upc.planwasi.dtos.SeguroInmobiiliarioDTO;
import pe.edu.upc.planwasi.entities.Rol;
import pe.edu.upc.planwasi.entities.SeguroDesgravamen;
import pe.edu.upc.planwasi.entities.SeguroInmobiliario;
import pe.edu.upc.planwasi.serviceinterfaces.ISeguroInmobiliarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Seguro_Inmobiliario")
public class SeguroInmobiliarioController {
    @Autowired
    private ISeguroInmobiliarioService siS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<SeguroInmobiiliarioDTO> listar() {
        return siS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SeguroInmobiiliarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody SeguroInmobiiliarioDTO SeguroInmobiiliarioDTO) {
        ModelMapper m = new ModelMapper();
        SeguroInmobiliario a = m.map(SeguroInmobiiliarioDTO, SeguroInmobiliario.class);
        siS.insert(a);
    }

    @GetMapping("/{idSeguroInmobiliario}")
    public RolDTO listarId(@PathVariable("idrol") int idRol) {
        ModelMapper m = new ModelMapper();
        RolDTO dto = m.map(siS.listId(idRol), RolDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@org.springframework.web.bind.annotation.RequestBody SeguroInmobiiliarioDTO seguroInmobiiliarioDTO) {
        ModelMapper m = new ModelMapper();
        SeguroInmobiliario sI=m.map(seguroInmobiiliarioDTO, SeguroInmobiliario.class);
        siS.update(sI);
    }
    @DeleteMapping("/idSeguroInmobiliario")
    public void eliminar (@PathVariable("IdSeguroInmobiliario")int idSeguroInmobiliario) {siS.delete(idSeguroInmobiliario);}
}
