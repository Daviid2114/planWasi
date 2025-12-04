package pe.edu.upc.planwasi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.TipoEntidadDTO;
import pe.edu.upc.planwasi.entities.TipoEntidad;
import pe.edu.upc.planwasi.serviceinterfaces.ITipoEntidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoentidad")
public class TipoEntidadController {
    @Autowired
    private ITipoEntidadService teService;
    ModelMapper modelMapper = new ModelMapper();

    @GetMapping
    public List<TipoEntidadDTO> list() {
        return teService.list()
                .stream()
                .map(x -> modelMapper.map(x, TipoEntidadDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody TipoEntidadDTO dto) {
        TipoEntidad entidad = modelMapper.map(dto, TipoEntidad.class);
        teService.insert(entidad);
    }

    @GetMapping("/{id}")
    public TipoEntidadDTO getById(@PathVariable("id") Long id) {
        TipoEntidad entidad = teService.findById(id);
        return modelMapper.map(entidad, TipoEntidadDTO.class);
    }

    @PutMapping
    public void update(@RequestBody TipoEntidadDTO dto) {
        TipoEntidad entidad = modelMapper.map(dto, TipoEntidad.class);
        teService.update(entidad);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        teService.delete(id);
    }
}
