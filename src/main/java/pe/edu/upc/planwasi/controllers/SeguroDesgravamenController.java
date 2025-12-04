package pe.edu.upc.planwasi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.planwasi.dtos.SeguroDesgravamenDTO;
import pe.edu.upc.planwasi.entities.SeguroDesgravamen;
import pe.edu.upc.planwasi.serviceinterfaces.ISeguroDesgravamenService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Seguro_Desgravament")
public class SeguroDesgravamenController {
    @Autowired
    private ISeguroDesgravamenService seguroDesgravamenS;

    @GetMapping
    public List<SeguroDesgravamenDTO> list() {
        return seguroDesgravamenS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, SeguroDesgravamenDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void register(@RequestBody SeguroDesgravamenDTO seguroDesgravamenDTO) {
        ModelMapper m = new ModelMapper();
        SeguroDesgravamen sd = m.map(seguroDesgravamenDTO, SeguroDesgravamen.class);
        seguroDesgravamenS.insert(sd);
    }
    @GetMapping("/{IdSeguroDesgravament}")
    public SeguroDesgravamenDTO list(@PathVariable("IdSeguroDesgravament") int idSeguroDesgravamen) {
        ModelMapper m = new ModelMapper();
        SeguroDesgravamenDTO dto = m.map(seguroDesgravamenS.listId(idSeguroDesgravamen), SeguroDesgravamenDTO.class);
        return dto;
    }
    @PutMapping
    public void edit(@RequestBody SeguroDesgravamenDTO seguroDesgravamenDTO) {
        ModelMapper m = new ModelMapper();
        SeguroDesgravamen seguroDesgravamen = m.map(seguroDesgravamenDTO, SeguroDesgravamen.class);
        seguroDesgravamenS.update(seguroDesgravamen);
    }
    @DeleteMapping("/{IdSeguroDesgravament}")
    public void eliminar(@PathVariable("IdSeguroDesgravament") int idSeguroDesgravament) {
        seguroDesgravamenS.delete(idSeguroDesgravament);
    }

}
