package pe.edu.upc.planwasi.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.SeguroInmobiiliarioDTO;
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

    @GetMapping("/{IdSeguroInmobiliario}")
    public SeguroInmobiiliarioDTO listarId(@PathVariable("IdSeguroInmobiliario") int IdSeguroInmobiliario) {
        ModelMapper m = new ModelMapper();
        SeguroInmobiiliarioDTO dto = m.map(siS.listId(IdSeguroInmobiliario), SeguroInmobiiliarioDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SeguroInmobiiliarioDTO seguroInmobiiliarioDTO) {
        ModelMapper m = new ModelMapper();
        SeguroInmobiliario sI=m.map(seguroInmobiiliarioDTO, SeguroInmobiliario.class);
        siS.update(sI);
    }
    @DeleteMapping({"/{IdSeguroInmobiliario}"})
    public void eliminar (@PathVariable("IdSeguroInmobiliario")int idSeguroInmobiliario) {siS.delete(idSeguroInmobiliario);}
}
