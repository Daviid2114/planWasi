package pe.edu.upc.planwasi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.CapitalizacionDTO;
import pe.edu.upc.planwasi.entities.Capitalizacion;
import pe.edu.upc.planwasi.serviceinterfaces.ICapitalizacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/capitalizaciones")
public class CapitalizacionController {
    @Autowired
    private ICapitalizacionService cS;
    @GetMapping
    public List<CapitalizacionDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x,CapitalizacionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody CapitalizacionDTO cdto){
        ModelMapper modelMapper = new ModelMapper();
        Capitalizacion c= modelMapper.map(cdto,Capitalizacion.class);
        cS.insert(c);
    }
    @GetMapping("/{idCapitalizacion}")
    public CapitalizacionDTO listarId(@PathVariable("idCapitalizacion") int idCapitalizacion){
        ModelMapper modelMapper = new ModelMapper();
        CapitalizacionDTO dto = modelMapper.map(cS.listId(idCapitalizacion),CapitalizacionDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CapitalizacionDTO cdto){
        ModelMapper modelMapper = new ModelMapper();
        Capitalizacion c= modelMapper.map(cdto,Capitalizacion.class);
        cS.update(c);
    }
    @DeleteMapping("/{idCapitalizacion}")
    public void eliminar(@PathVariable("idCapitalizacion") int idCapitalizacion){
        cS.delete(idCapitalizacion);
    }

}
