package pe.edu.upc.planwasi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.EntidadFinancieraDTO;
import pe.edu.upc.planwasi.entities.EntidadFinanciera;
import pe.edu.upc.planwasi.entities.TipoEntidad;
import pe.edu.upc.planwasi.serviceinterfaces.IEntidadFinancieraService;
import pe.edu.upc.planwasi.serviceinterfaces.ITipoEntidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entidadfinanciera")
public class EntidadFinancieraController {

    @Autowired
    private IEntidadFinancieraService efService;

    @Autowired
    private ITipoEntidadService tipoService;

    private ModelMapper mapper = new ModelMapper();

    @GetMapping
    public List<EntidadFinancieraDTO> list() {
        return efService.list().stream().map(e -> {
            EntidadFinancieraDTO dto = mapper.map(e, EntidadFinancieraDTO.class);
            dto.setIdTipoEntidad(e.getTipoEntidad().getIdTipoEntidad());
            return dto;
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody EntidadFinancieraDTO dto) {
        EntidadFinanciera entidad = mapper.map(dto, EntidadFinanciera.class);

        TipoEntidad tipo = tipoService.findById(dto.getIdTipoEntidad());
        entidad.setTipoEntidad(tipo);

        efService.insert(entidad);
    }

    @GetMapping("/{id}")
    public EntidadFinancieraDTO getById(@PathVariable("id") int id) {
        EntidadFinanciera entidad = efService.findById(id);
        EntidadFinancieraDTO dto = mapper.map(entidad, EntidadFinancieraDTO.class);
        dto.setIdTipoEntidad(entidad.getTipoEntidad().getIdTipoEntidad());
        return dto;
    }

    @PutMapping
    public void update(@RequestBody EntidadFinancieraDTO dto) {
        EntidadFinanciera entidad = mapper.map(dto, EntidadFinanciera.class);

        TipoEntidad tipo = tipoService.findById(dto.getIdTipoEntidad());
        entidad.setTipoEntidad(tipo);

        efService.update(entidad);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        efService.delete(id);
    }
}
