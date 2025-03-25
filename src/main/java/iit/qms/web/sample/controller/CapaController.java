package iit.qms.web.sample.controller;

import iit.qms.web.sample.service.CapaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CapaController {

    private final CapaService capaService;


    @GetMapping
    public ResponseEntity<?> search() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> request() {
        capaService.request();
        return ResponseEntity.ok().build();
    }

    @PutMapping("/next-process")
    public ResponseEntity<?> nextProcess() {
        capaService.toNextProcess();
        return ResponseEntity.ok().build();
    }

}
