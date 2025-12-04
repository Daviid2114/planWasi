package pe.edu.upc.planwasi.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.PeriodoGraciaDTO;
import pe.edu.upc.planwasi.entities.PeriodoGracia;
import pe.edu.upc.planwasi.serviceinterfaces.IPeriodoGraciaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/periodogracias")
public class PeriodoGraciaController {
    @Autowired
    private IPeriodoGraciaService pGS;
    @GetMapping
    public List<PeriodoGraciaDTO> listar(){
        return pGS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, PeriodoGraciaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PeriodoGraciaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        PeriodoGracia periodo = modelMapper.map(dto, PeriodoGracia.class);
        pGS.insert(periodo);
    }
    @GetMapping("/{idPeriodoGracia}")
    public PeriodoGraciaDTO listarId(@PathVariable("idPeriodoGracia") int idPeriodoGracia){
        ModelMapper modelMapper = new ModelMapper();
        PeriodoGraciaDTO dto = modelMapper.map(pGS.listId(idPeriodoGracia), PeriodoGraciaDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody PeriodoGraciaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        PeriodoGracia periodo = modelMapper.map(dto, PeriodoGracia.class);
        pGS.update(periodo);
    }
    @DeleteMapping("/{idPeriodoGracia}")
    public void eliminar(@PathVariable("idPeriodoGracia") int idPeriodoGracia){
        pGS.delete(idPeriodoGracia);
    }
}
